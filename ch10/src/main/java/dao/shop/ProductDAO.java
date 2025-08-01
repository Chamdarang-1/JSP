package dao.shop;

import dto.shop.ProductDTO;
import util.DBHelper;

public class ProductDAO extends DBHelper{

	private static final ProductDAO INSTANCE = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return INSTANCE;
	}
	
	private ProductDAO() {}
	
	private final String DBCP = "jdbc/shop";
	
	public void insertProduct(ProductDTO dto) {
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "INSERT INTO PRODUCT VALUES(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPno());
			psmt.setString(2, dto.getPname());
			psmt.setString(3, dto.getStock());
			psmt.setString(4, dto.getPrice());
			psmt.setString(5, dto.getCompany());
			psmt.executeUpdate();
			closeAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public ProductDTO selectProduct(String pno) {
		
		ProductDTO dto = null;
		
		try {
			conn = getConnection(DBCP);
			String sql = "SELECT * FROM PRODUCT WHERE PNO = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pno);
			
			rs=psmt.executeQuery();
			
			if(rs.next()) {
				dto = new ProductDTO();
				dto.setPno(rs.getString(1));
				dto.setPname(rs.getString(2));
				dto.setStock(rs.getString(3));
				dto.setPrice(rs.getString(4));
				dto.setCompany(rs.getString(5));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public void selectAllProduct() {}
	
	public void updateProduct() {}
	
	public void deleteProduct() {}
}
