package com.java.jpa.student;

import javax.persistence.*;

@Entity

@Table(name="EmployeeDetails")//Table name

public class EmployeeEntity {

  @Id

  private int empno;//Primary Key

  private String name;

  private String designation;
  private Double sal;



  public EmployeeEntity(int empno, String name, String designation, Double sal) {
	super();
	this.empno = empno;
	this.name = name;
	this.designation = designation;
	this.sal = sal;
}



public EmployeeEntity() {

    super();

  }



public int getEmpno() {
	return empno;
}



public void setEmpno(int empno) {
	this.empno = empno;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getDesignation() {
	return designation;
}



public void setDesignation(String designation) {
	this.designation = designation;
}



public Double getSal() {
	return sal;
}



public void setSal(double i) {
	this.sal = i;
}



}

