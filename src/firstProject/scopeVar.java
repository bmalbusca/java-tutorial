package firstProject;

public class scopeVar {
	
	static int x; //global
	
	public static void main(String[] args) {
		int y =5; //local
		Some(); // method 
		System.out.println(x + y);
	}
	
	static void Some() { 
		x=10;
	}

}
