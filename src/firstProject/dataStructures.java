package firstProject;

public class dataStructures {

	
	public static void main(String[] args) {
		int[] myarray;
		
		myarray = new int[] {0,1,2,3};   //new int[4]
		myarray[0]= 1;
		System.out.println("array len "+ myarray.length);
		
		
		
		/*
		  for(int i =0; i<4; i++) {
			System.out.println(myarray[i]);
		}
		*/
		
		for(int n : myarray) {
			System.out.println(n);
		}
		
	}
	
}
