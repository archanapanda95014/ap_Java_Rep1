package aparrays;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int size;

	public void addToFront(Employee employee) {

		EmployeeNode node1 = new EmployeeNode(employee);
		node1.setNext(head);
		head = node1;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean isEmpty(){
		return head==null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head-> ");
		while (current != null) {
			System.out.print(current + "-->");
			current = current.getNext();
		}
	}
}
