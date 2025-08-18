package dao;

import java.util.ArrayList;
import java.util.List;

import dto.LectureDTO;
import util.DBHelper;

public class LectureDAO extends DBHelper{
	
	private static final LectureDAO INSTANCE = new LectureDAO();
	public static LectureDAO getInstance() {
		return INSTANCE;
	}
	
	private LectureDAO() {}
	
	public LectureDTO select(int lecNo) {
		
		LectureDTO dto = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT * FROM STUDENT WHERE LECNO = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, lecNo);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new LectureDTO();
				dto.setLecNo(rs.getInt(1));
				dto.setLecName(rs.getString(2));
				dto.setLecCredit(rs.getInt(3));
				dto.setLecTime(rs.getInt(4));
				dto.setLecClass(rs.getString(5));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return dto;
	}
	public List<LectureDTO> selectAll() {
		
		List<LectureDTO> dtoList = new ArrayList<LectureDTO>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM LECTURE");
			
			while(rs.next()) {
				LectureDTO dto = new LectureDTO();
				dto.setLecNo(rs.getInt(1));
				dto.setLecName(rs.getString(2));
				dto.setLecCredit(rs.getInt(3));
				dto.setLecTime(rs.getInt(4));
				dto.setLecClass(rs.getString(5));
				dtoList.add(dto);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dtoList;
	}
	public void insert(LectureDTO dto) {
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO LECTURE VALUES(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getLecNo());
			psmt.setString(2, dto.getLecName());
			psmt.setInt(3, dto.getLecCredit());
			psmt.setInt(4, dto.getLecTime());
			psmt.setString(5, dto.getLecClass());
			psmt.executeUpdate();
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update(LectureDTO dto) {}
	public void delete(int lecNo) {}

}
