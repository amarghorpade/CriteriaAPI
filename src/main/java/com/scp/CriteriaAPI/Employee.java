package com.scp.CriteriaAPI;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CriteriaAPI_DEMO")
public class Employee {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_sal")
	private int empSal;
	@Column(name="dept_id")
	private int deptId;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String empName, int empSal, int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.deptId = deptId;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSal() {
		return empSal;
	}


	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", deptId=" + deptId + "]";
	}

	
	
}
