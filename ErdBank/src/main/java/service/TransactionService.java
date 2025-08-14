package service;

import java.util.List;

import dao.TransactionDAO;
import dto.TransactionDTO;

public enum TransactionService {

	INSTANCE;

	TransactionDAO dao = TransactionDAO.getInstance();
	
	public TransactionDTO findById(int t_a_no) {
		return dao.select(t_a_no);
	}
	public List<TransactionDTO> findAll() {
		return dao.selectAll();
	}
	public void transfer(TransactionDTO dto) {
		dao.insertAndUpdate(dto);
	}
	public void modify(TransactionDTO dto) {
		dao.update(dto);
	}
	public void delete(int t_a_no) {
		dao.delete(t_a_no);
	}

}
