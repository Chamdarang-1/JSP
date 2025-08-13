package dao.college;

import dto.college.CourseDTO;
import util.DBHelper;

public class CourseDAO extends DBHelper{
	
	private static final CourseDAO INSTANCE = new CourseDAO();
	
	public static CourseDAO getInstance() {
		return INSTANCE;
	}
	private CourseDAO() {}
	
	private final String DBCP = "jdbc/college";
	
		public void insertCourse(CourseDTO dto) {
			try {
				conn = getConnection(DBCP);
				
				String sql = "INSERT INTO COURSE VALUES(?,?,?,?)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, dto.getCs_Id());
				psmt.setString(2, dto.getCs_Name());
				psmt.setString(3, dto.getCs_Credit());
				psmt.setString(4, dto.getCs_Dept());
				psmt.executeUpdate();
				closeAll();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public CourseDTO selectCourse(String cs_Id) {
			
			CourseDTO dto = null;
			
			try {
				conn = getConnection(DBCP);
				String sql = "SELECT * FROM COURSE WHERE CS_ID = ?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, cs_Id);
				
				rs = psmt.executeQuery();
				
				if(rs.next()) {
					dto = new CourseDTO();
					dto.setCs_Id(rs.getString(1));
					dto.setCs_Name(rs.getString(2));
					dto.setCs_Credit(rs.getString(3));
					dto.setCs_Dept(rs.getString(4));
				}
				closeAll();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dto;
		}
		
		public void selectAllCourse() {}
		
		public void updateCourse() {}
		
		public void deleteCourse() {}
}
