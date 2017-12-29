package com.scp.CriteriaAPI;

public interface EmployeeInterface
{
	void insertEmployee(Employee e) throws MyException;
	void searchEmployee(int empId)throws MyException;
	void showEmployeeSomeDetails()throws MyException;
	void getAllEmployee()throws MyException;
	void getEmployeeOfMaxSal(int sal)throws MyException;
	void sortEmployeeBySal()throws MyException;
	void paginationEmployee()throws MyException;
}