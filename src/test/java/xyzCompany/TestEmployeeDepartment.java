package xyzCompany;

public class TestEmployeeDepartment {

	public static void main(String[] args) 
	{
		
		Department it = new Department("IT");
		Department sales = new Department("Sales");
		
		Employee raj = new Employee("Raj", 7);
		Employee naga = new Employee("Naga", 6);
		Employee sanju = new Employee("Sanju", 3);
		Employee lucky = new Employee("Lucky", 2);
		Employee avi = new Employee("Avi", 8);
		
		it.addEmployee(sanju);
		it.addEmployee(naga);
		it.addEmployee(raj);
		
		sales.addEmployee(lucky);
		sales.addEmployee(avi);
		
		sales.describe();
		it.describe();
	}

}
