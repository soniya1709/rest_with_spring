package com.prowings.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addEmployee(Employee entity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction txn = session.beginTransaction();
			session.save(entity);
			txn.commit();
			session.close();
			return true;
		}catch (Exception e) {
			System.out.println("Not able to store employee!!!!");
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp=new Employee();
		try
		{
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Query<Employee> q=session.createQuery("From Employee where id=:id");
		q.setParameter("id", id);
		emp=q.uniqueResult();
		txn.commit();
		session.close();
		return emp;
		}
		catch(Exception e) {
			System.out.println("Not able to fetch employee!!!!");
			e.printStackTrace();
			return emp;
			}
		
	}

}
