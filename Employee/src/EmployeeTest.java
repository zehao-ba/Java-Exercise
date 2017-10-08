import java.io.*;
public class EmployeeTest {
	public static void main(String[] args){
		Employee one = new Employee("Junior Developer");
		Employee two = new Employee("Senior Developer");
		
		one.empAge(22);
		one.empDesignation("Beginner");
		one.empSalary(5000);
		one.printEmp();
		
		two.empAge(32);
		two.empDesignation("Expert");
		two.empSalary(10000);
		two.printEmp();		
	}
}
