package jboard.dao;

import java.util.List;

import jboard.dto.ArticleDTO;
import jboard.util.DBHelper;

public class TermsDAO extends DBHelper{
	
	private final static TermsDAO INSTANCE = new TermsDAO();
	public static TermsDAO getInstance() {
		return INSTANCE;
	}
	private TermsDAO() {}
	
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
