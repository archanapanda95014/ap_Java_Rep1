package aparrays;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Priya","daughter", 562534));
		employeeList.add(new Employee("Shiv","Pachori",1));
		employeeList.add(new Employee("Luv","bhaiya",34));
		employeeList.add(new Employee("Kush","beta",565));
		
		employeeList.forEach(employee-> System.out.println(employee));// loop the ArrayLIst
		System.out.println(employeeList.get(1));
		System.out.println(employeeList.isEmpty());//checks if empty
		
		employeeList.set(1, new Employee("New","member",6576565));// replace element at index 1
		employeeList.forEach(employee-> System.out.println(employee));
		System.out.println(employeeList.size());// gets the seize
		
		employeeList.add(3, new Employee("updated","member",6576565));// adds element at index 3- shifts the rest
		
		System.out.println(employeeList.contains(new Employee("Luv","bhaiya",34)));
		
		System.out.println(employeeList.indexOf(new Employee("Luv","bhaiya",34)));
		
		employeeList.remove(2);
		employeeList.forEach(employee-> System.out.println(employee));// loop the ArrayLIst
	}
}
