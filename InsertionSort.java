package aparrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] InsSort = {4,7,2,3,8,9,11,0,-12};
		
		
		for (int firstUnsortedIndex=1;firstUnsortedIndex<InsSort.length;firstUnsortedIndex++) {
			
			int newElement = InsSort[firstUnsortedIndex];
			int i;
			for (i=firstUnsortedIndex;i>0&&InsSort[i-1]>newElement;i--) {
				InsSort[i]=InsSort[i-1];
			}
			InsSort[i]=newElement;
			
		}
		for (int j=0;j<InsSort.length;j++) {
			System.out.println(InsSort[j]);
		}

	}


}
