//Develop an application using JPA
//
//try to insert employee Information(empno,name,designation,sal ..etc) into database
//
//and also fetch all the data from the database then display on console
//
//


package com.java.jpa.find;
import java.util.List;

import javax.persistence.*;

import com.java.jpa.student.*;

public class FindEmployee {

  public static void main(String args[])

  {
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

	    EntityManager em=emf.createEntityManager();
	    
	    //transaction Begin

	    em.getTransaction().begin();

	    //Inserting The Employee Details;
	    
	    EmployeeEntity s1=new EmployeeEntity();

	    s1.setEmpno(101);

	    s1.setName("Gaurav");

	    s1.setDesignation("SDET");
	    
	    s1.setSal(200000);
	    
	    //Inserting The Employee Details;

	    EmployeeEntity s2=new EmployeeEntity();


	    s2.setEmpno(102);

	    s2.setName("Aditya");

	    s2.setDesignation("SDET");
	    
	    s2.setSal(250000);
	    
	    //Inserting The Employee Details;

	    EmployeeEntity s3=new EmployeeEntity();

	    s3.setEmpno(103);

	    s3.setName("Rahul");

	    s3.setDesignation("SDET");
	    
	    s3.setSal(350000);
	    
	    //persist the data using persist method:

	    em.persist(s1);

	    em.persist(s2);

	    em.persist(s3);

	em.getTransaction().commit();


	//Retriving the Employee details from employee table;

	 Query q= em.createQuery("from EmployeeEntity");

	    List <EmployeeEntity> list= q.getResultList();

	    for(EmployeeEntity se:list)

	    {

	     System.out.println(se.getEmpno()+" "+se.getName()+" "+se.getDesignation()+" "+se.getSal());
	  }

}
}
