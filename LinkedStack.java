package aparrays;

public class LinkedStack {

	public static void main(String[] args) {
		
		Employee a1 = new Employee("Archie","Panda",101);
		Employee b1 = new Employee("Shiv","Pachori",201);
		Employee c1 = new Employee("Priya","P",301);
		
		EmployeeStackLL stackEmpAP =new EmployeeStackLL();
		
		stackEmpAP.push(a1);
		stackEmpAP.push(b1);
		stackEmpAP.push(c1);
		
		stackEmpAP.printStack();
		
		Employee x = stackEmpAP.pop();
		
		System.out.println("Popped: "+ x);
		x = stackEmpAP.pop();
		
		System.out.println("Popped: "+ x);
		x = stackEmpAP.pop();
		
		System.out.println("Popped: "+ x);
		
	}

}
