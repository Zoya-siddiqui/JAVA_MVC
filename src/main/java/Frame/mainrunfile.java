package Frame;

public class mainrunfile {
	
	public static void main(String[] args) 
	{
	
		Employee model=myemployeebeforeupdateset(); //method for setting the value
		EmployeeView view=new EmployeeView();
		EmployeeController contro=new EmployeeController(model,view);
		
			contro.showupdates();
			contro.setEmployeeId("1");
			contro.setEmployeeName("saniya");
			System.out.println("---------------------");
			System.out.println("employee details after update");
			contro.showupdates();
}
		
		private static Employee myemployeebeforeupdateset () {
			Employee emp=new Employee();
			emp.setid("121");
			emp.setname("zoyaji");
			emp.setdep("sleeping");
			
			return emp;
		}
}
