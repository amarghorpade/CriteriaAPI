package com.scp.CriteriaAPI;

public class CriteriaAPIDemo 
{
	/**
	 * Criteria is used for only select..
	 * 
	 */
	
	public static void main(String[] args) throws MyException 
	{
		EmployeeInterfaceImpl empImpl= new EmployeeInterfaceImpl();
		/*
		Employee emp1= new Employee(101, "Amar Ghorpade", 25000, 20001);
		Employee emp2= new Employee(102, "Ashwini Ghorpade", 5300, 9001);
		Employee emp3= new Employee(103, "Sagar Naik", 2500, 3001);
		Employee emp4= new Employee(302, "Mandar Kulkarni", 8300, 9001);
		Employee emp5= new Employee(301, "Sandeep Patil", 22200, 20001);
		Employee emp6= new Employee(402, "Akshay Jadhav", 4600, 8001);
		
		empImpl.insertEmployee(emp1);
		empImpl.insertEmployee(emp2);
		empImpl.insertEmployee(emp3);
		empImpl.insertEmployee(emp4);
		empImpl.insertEmployee(emp5);
		empImpl.insertEmployee(emp6);
		*/
		
		//empImpl.searchEmployee(101);
		//empImpl.getEmployeeOfMaxSal(8000);
		empImpl.showEmployeeSomeDetails();
		//empImpl.getAllEmployee();
	}
}