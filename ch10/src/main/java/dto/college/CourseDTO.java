package dto.college;

public class CourseDTO {
	
	private String cs_Id;
	private String cs_Name;
	private String cs_Credit;
	private String cs_Dept;
	public String getCs_Id() {
		return cs_Id;
	}
	public void setCs_Id(String cs_Id) {
		this.cs_Id = cs_Id;
	}
	public String getCs_Name() {
		return cs_Name;
	}
	public void setCs_Name(String cs_Name) {
		this.cs_Name = cs_Name;
	}
	public String getCs_Credit() {
		return cs_Credit;
	}
	public void setCs_Credit(String cs_Credit) {
		this.cs_Credit = cs_Credit;
	}
	public String getCs_Dept() {
		return cs_Dept;
	}
	public void setCs_Dept(String cs_Dept) {
		this.cs_Dept = cs_Dept;
	}
	@Override
	public String toString() {
		return "CourseDTO [cs_Id=" + cs_Id + ", cs_Name=" + cs_Name + ", cs_Credit=" + cs_Credit + ", cs_Dept="
				+ cs_Dept + "]";
	}
}
