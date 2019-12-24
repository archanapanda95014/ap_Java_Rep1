package aparrays;

import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeStackLL {

	private LinkedList<Employee> stack1;

	public EmployeeStackLL() {
		stack1 = new LinkedList<Employee>();
	}

	public void push(Employee e) {
		stack1.push(e);
	}

	public Employee pop() {
		Employee a = stack1.pop();
		return a;
	}
	public void peek() {
		stack1.peek();
	}
	
	public boolean isEmpty() {
		return stack1.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> It1 = stack1.listIterator();
		while (It1.hasNext()) {
			System.out.println(It1.next());
		}
	}

}
