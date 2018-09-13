
public class DynamicArray {
	
	public static void main(String args[]) {
		
		ArrayList myArrLst = new ArrayList();

		System.out.println(myArrLst.get(0));
		for (int i=0;i<10;i++)
			myArrLst.add(i);
		
		myArrLst.add(100);
		
		for (int i=90;i<200;i++)
			myArrLst.add(i);
		
		for (int i=0;i<myArrLst.size();i++)
			System.out.print(myArrLst.get(i)+" ");
		
	}
	
}