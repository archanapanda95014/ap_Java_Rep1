package aparrays;

public class EmployeeLLTest {

	public static void main(String[] args) {
		
		EmployeeLinkedList list1 = new EmployeeLinkedList();
		
		System.out.println(list1.isEmpty());
		
		Employee archana = new Employee("Archana","Panda",64);
		Employee shiv = new Employee("Shiv","Pachori",65);
		Employee priya = new Employee("Priya","P",6);
		Employee luv = new Employee("Apoorbv","Poofy",4);
		Employee kush = new Employee("Adarsh","UCI",16);
		
		list1.addToFront(archana);
		list1.addToFront(shiv);
		list1.addToFront(priya);
		list1.addToFront(luv);
		list1.addToFront(kush);
		
//		System.out.println(list1.getSize());
//		System.out.println(list1.isEmpty());
		
		list1.removeFromFront();
		list1.removeFromFront();
		list1.printList();
		
		
		
	}

}
