package com;

public class Employee {
	
private int id;
private String name;
private float salary;
private Address add;

	
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


public float getSalary() {
	return salary;
}


public void setSalary(float salary) {
	this.salary = salary;
}


	public Employee() {
		super();
		System.out.println("Object Created Using Empty Constructor");// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public Employee(int id, String name, float salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}


	public void display(){ //Normal POJO Class
		System.out.println("Employee Class Method");
		
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
	
	
	
}
