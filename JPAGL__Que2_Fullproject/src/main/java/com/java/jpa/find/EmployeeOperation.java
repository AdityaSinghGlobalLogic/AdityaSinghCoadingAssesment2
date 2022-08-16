package com.java.jpa.find;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.java.jpa.student.EmployeeEntity;

public class EmployeeOperation 
{
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

	    EntityManager em=emf.createEntityManager();
	    
	public String addEmployee(int empno,String name,String designation,double i)
	{
		em.getTransaction().begin();
		EmployeeEntity empent=new EmployeeEntity();
		empent.setEmpno(empno);
		empent.setName(name);
		empent.setDesignation(designation);
		empent.setSal(i);
	    em.persist(empent);

		em.getTransaction().commit();
		
		return "Employee Added";
		
	}
	public  void display()
	{
		 Query q= em.createQuery("from EmployeeEntity");

		    List <EmployeeEntity> list= q.getResultList();

		    for(EmployeeEntity se:list)

		    {

		     System.out.println(se.getEmpno()+" "+se.getName()+" "+se.getDesignation()+" "+se.getSal());
		  }
		
	}

}


	

