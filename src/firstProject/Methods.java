package firstProject;

public class Methods {

	public static void main(String[] args) {	
	
		sayHello("Bruno");
		System.out.println(returnOne());
}

	static int returnOne() {
		return 1;
	}
	
	static void sayHello(String name) {
		System.out.println("hello " + name);
	}

}
