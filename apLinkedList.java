package aparrays;

public class apLinkedList {
	
	private apnode head;
	private int size;
	
	public void addToFront(apobject apnew) {
		
		apnode apn1 = new apnode(apnew);
		apn1.setNext(head);
		head =apn1;
		size++;
	}
	
	public void printList() {
		apnode new1 = head;
		System.out.println("head-->");
		while (new1!=null) {
			System.out.println(new1);
			new1=new1.getNext();
		}
		
	}

}
