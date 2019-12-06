package xyzCompany;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private String departmentName ;
	private double budget = 50000;
	
	Department(String departmentName )
	{
		this.departmentName = departmentName;
	}
	
	List<Employee> emps = new ArrayList<Employee>();
	
	public void addEmployee(Employee emp)
	{
		emps.add(emp);
		
		if(emp.getGrade()>=6)
		{
			this.budget += 150000;
		}
		else {
			this.budget += 100000;
		}
			
	}
	
	 public void describe()
	 {
		 String temp = "Department_Name : " + this.departmentName
				 + "\n budget : " + this.budget 
				 + "\n Employees : ";
		 for (Employee x : emps)
		 {
			 temp += x.toString() + " ";
		 }
		 System.out.println(temp) ;
	 }
	
}
