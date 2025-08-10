package dao.shop;

import java.util.ArrayList;
import java.util.List;

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
			psmt.setInt(3, dto.getStock());
			psmt.setInt(4, dto.getPrice());
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
				dto.setStock(rs.getInt(3));
				dto.setPrice(rs.getInt(4));
				dto.setCompany(rs.getString(5));
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	
	public List<ProductDTO> selectAllProduct() {
		
		List<ProductDTO> dtoList = new ArrayList<ProductDTO>();
		
		try {
			conn = getConnection(DBCP);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM PRODUCT");
			
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setPno(rs.getString(1));
				dto.setPname(rs.getString(2));
				dto.setStock(rs.getInt(3));
				dto.setPrice(rs.getInt(4));
				dto.setCompany(rs.getString(5));
				dtoList.add(dto);
			}
			closeAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dtoList;
	}
	
	public void updateProduct(ProductDTO dto) {
		
		try {
			conn = getConnection(DBCP);
			
			String sql = "UPDATE PRODUCT SET PNAME=? , STOCK=?, PRICE=?, COMPANY=? WHERE PNO = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPname());
			psmt.setInt(2, dto.getStock());
			psmt.setInt(3, dto.getPrice());
			psmt.setString(4, dto.getCompany());
			psmt.setString(5, dto.getPno());
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteProduct(String pno) {

		try {
			conn=getConnection(DBCP);
			String sql = "DELETE FROM PRODUCT WHERE PNO=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pno);
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
