package Frame;

public class EmployeeController {
	
	private Employee model;
	private EmployeeView view;
	
	public EmployeeController(Employee model,EmployeeView view)
	{
		this.model=model;
		this.view=view;
	}
	
	//gettersetter;
	public void setEmployeeId(String id) {
		model.setid(id);    
	}
	public String getEmployeeId() {
		return model.getid();
	}
	
	public void setEmployeeName(String name) {
		model.setname(name);
	}
	public String getname() {
		return model.getname();
	}
	
	public void setEmployeedep(String dep) {
		model.setdep(dep);
	}
	public String getDep() {
		return model.getdep();
	}
	
	
	public void showupdates() {
		view.printEmployeeDetails(model.getid(),model.getname(),model.getdep());
	}

}
