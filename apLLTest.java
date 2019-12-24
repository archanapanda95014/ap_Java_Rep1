package aparrays;

public class apLLTest {

	public static void main(String[] args) {
		
		apobject apTest1 = new apobject("Archana","Panda","561");
		apobject apTest2 = new apobject("Shiv","Panda","56156");
		
		apLinkedList apll1 = new apLinkedList();
		apll1.addToFront(apTest1);
		apll1.addToFront(apTest2);
		
		apll1.printList();

	}

}
