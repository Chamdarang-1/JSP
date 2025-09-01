package jboard.dao;

import java.util.List;

import jboard.dto.ArticleDTO;
import jboard.util.DBHelper;

public class UserDAO extends DBHelper{
	
	private final static UserDAO INSTANCE = new UserDAO();
	public static UserDAO getInstance() {
		return INSTANCE;
	}
	private UserDAO() {}
	
	public void insert(ArticleDTO dto) {
		
	}
	public ArticleDTO select(int ano) {
		return null;
	}
	public List<ArticleDTO> selectAll() {
		return null;
	}
	public void update(ArticleDTO dto) {
		
	}
	public void delete(int ano) {}
	
	
}
