//Develop an application using JPA
//
//try to insert employee Information(empno,name,designation,sal ..etc) into database
//
//and also fetch all the data from the database then display on console
//
//


package com.java.jpa.find;
import javax.persistence.*;
public class FindEmployee {

  public static void main(String args[])

  {
   EmployeeOperation empop=new EmployeeOperation();
  System.out.println( empop.addEmployee(101, "Aditya", "SDET", 20000));
  System.out.println( empop.addEmployee(102, "Kartik", "SDET", 25000));
  System.out.println( empop.addEmployee(103, "chirag", "SDET", 30000));
  empop.display();
  
   

	

  }
}
