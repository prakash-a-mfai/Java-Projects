package com.Entity;

public class Employee {
      private int id;
      private String name;
      private String dept;
      public Employee(int id,String name,String dept) {
    	  this.id=id;
    	  this.name=name;
    	  this.dept=dept;
      }
      
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +  "";
	}
	
      
}
