package jboard.dao;

import java.util.List;

import jboard.dto.TermsDTO;
import jboard.util.DBHelper;

public class FileDAO extends DBHelper{
	
	private final static FileDAO INSTANCE = new FileDAO();
	public static FileDAO getInstance() {
		return INSTANCE;
	}
	private FileDAO() {}
	
	public void insert(TermsDTO dto) {
		
	}
	public TermsDTO select(int no) {
		return null;
	}
	public List<TermsDTO> selectAll() {
		return null;
	}
	public void update(TermsDTO dto) {
		
	}
	public void delete(int no) {}
	
	
}
