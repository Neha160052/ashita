
// Write a class with FirstName, LastName & age field. Print FirstName, LastName & age using static block, static method & static variable respectively.


public class Question1 {
	
	static String FirstName = "Ashita";
	static String LastName = "Gupta";
	public static int age = 21;
	
	static {
	System.out.println("Age is: "+ age);
	}
	
	public static void displayName() {
		System.out.println("Firstname: "+FirstName +" Lastname: "+LastName);
	}
	
	public static void main(String[] args) {
			displayName();
	}
}
