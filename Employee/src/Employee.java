import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name){
		this.name = name;
	}
	
	public void empAge(int empAge){
		age = empAge;
	}
	
	public void empDesignation(String empDes){
		designation = empDes;
	}
	
	public void empSalary(double empSal){
		salary = empSal;
	}
	
	public void printEmp(){
		System.out.println("Employee name is "+name);
		System.out.println("Employee age is "+age);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee designation is "+designation);
				
	}
			
}
