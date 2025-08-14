package dao;

import java.util.List;

import dto.TransactionDTO;
import util.DBHelper;
import util.Sql;

public class TransactionDAO extends DBHelper{
	
	private static final TransactionDAO INSTANCE = new TransactionDAO();
	public static TransactionDAO getInstance() {
		return INSTANCE;
	}

	private TransactionDAO() {}
	
	public TransactionDTO select(int t_a_no) {
		return null;
	}
	public List<TransactionDTO> selectAll() {
		return null;
	}
	public void insertAndUpdate(TransactionDTO dto) {
		try {
			conn = getConnection();
			
			conn.setAutoCommit(false); // 자동커밋 해제(트랜잭션 시작) // 왜 자동커밋을 풀고 아래에서 수동으로 커밋하는 걸까?
			
			psmt = conn.prepareStatement(Sql.INSERT_TRANSACTION);
			psmt.setString(1, dto.getT_a_no());
			psmt.setInt(2, dto.getT_dist());
			psmt.setInt(3, dto.getT_amount());
			psmt.executeUpdate();
			
			psmt1 = conn.prepareStatement(Sql.UPDATE_ACCOUNT_PLUS);
			psmt1.setInt(1, dto.getT_amount());
			psmt1.setString(2, dto.getT_a_no());
			psmt1.executeUpdate();
			
			psmt2 = conn.prepareStatement(Sql.UPDATE_ACCOUNT_MINUS);
			psmt2.setInt(1, dto.getT_amount());
			psmt2.setString(2, dto.getT_a_no_to());
			psmt2.executeUpdate();
			
			conn.commit();
			
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}
	}
	public void update(TransactionDTO dto) {}
	public void delete(int t_a_no) {}
}