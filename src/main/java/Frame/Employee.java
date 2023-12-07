package Frame;

public class Employee {
	
	private String EmployeeId;
	private String EmployeeName;
	private String Department;
	
	public void setid(String id) {
		EmployeeId=id;
	}
	public String getid() {
		return EmployeeId;
	}
	
	public void setname(String name) {
		EmployeeName=name;
	}
	public String getname() {
		return EmployeeName;
	}
	
	public void setdep(String dep) {
		Department =dep;
	}
	public String getdep() {
		return Department;
	}
}
