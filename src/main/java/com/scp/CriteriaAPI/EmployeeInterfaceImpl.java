package com.scp.CriteriaAPI;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeInterfaceImpl implements EmployeeInterface {

	public void insertEmployee(Employee e) throws  MyException 
	{
		Session session= Hibernateutil.getSessionFactory().openSession();
		Transaction trans= session.beginTransaction();
		session.save(e);
		trans.commit();
		//Hibernateutil.resourceCleanupActivities(session, trans);
	}


	public void getAllEmployee() throws MyException {
		Session session= Hibernateutil.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List list= criteria.list();
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee)itr.next();
			System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getEmpSal()+"  "+e.getDeptId());;
		}
		
	}

	
	public void searchEmployee(int id) throws  MyException 
	{
		Session session= Hibernateutil.getSessionFactory().openSession();
		
		Criteria criteria=session.createCriteria(Employee.class);
		Criterion criterion=Restrictions.eq("empId", id);
		criteria.add(criterion);
		
		List list= criteria.list();
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee)itr.next();
			System.out.println("\n");
			System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getEmpSal()+"  "+e.getDeptId());;
		}
		
	}

	public void getEmployeeOfMaxSal(int sal) throws MyException {
		Session session= Hibernateutil.getSessionFactory().openSession();

		
		Criteria criteria=session.createCriteria(Employee.class);
		Criterion criterion=Restrictions.gt("empSal", sal);
		criteria.add(criterion);
		
		List list= criteria.list();
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee)itr.next();
			System.out.println(e.getEmpId()+"  "+e.getEmpName()+"  "+e.getEmpSal()+"  "+e.getDeptId());;
		}
		
	}


	public void showEmployeeSomeDetails() throws MyException 
	{
		Session session= Hibernateutil.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
	
		/**
		 * If we want some columns from the database then we need to use Projection.
		 * for each row we need projection object then we add it into ProjectionList.
		 * that ProjectionList wil be set to criteria by using setProjection.
		 * 
		 */
		
		Projection proj1= Projections.property("empId");
		Projection proj2= Projections.property("empName");
		
		ProjectionList plist= Projections.projectionList();
		plist.add(proj1);
		plist.add(proj2);
		
		criteria.setProjection(plist);
		List list= criteria.list();
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			Object[] obj = (Object[])itr.next();
			for(int i=1; i< obj.length; i++)
			System.out.println(obj[0]+"  "+obj[1]);;
		}
	}
}
