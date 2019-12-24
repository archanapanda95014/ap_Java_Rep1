package aparrays;

public class apnode {
	
	private apobject apObj1;
	private apnode next;
	
	public apnode(apobject apObj1) {
		super();
		this.apObj1 = apObj1;
	}

	public apobject getApObj1() {
		return apObj1;
	}

	public void setApObj1(apobject apObj1) {
		this.apObj1 = apObj1;
	}

	public apnode getNext() {
		return next;
	}

	public void setNext(apnode next) {
		this.next = next;
	}

	@Override
	public String toString() {
//		return "apnode [apObj1=" + apObj1 + "]";
		return apObj1.toString();
	}

}
