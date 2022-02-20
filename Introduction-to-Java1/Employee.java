
//Question 5. Create a class named Employee with fields firstname,lastname,age and designation. 
// The class should:
// - have all types of constructors to initialize the object
// - class should also have setter methods to update a particular field
// - Override its toString method to display a meaningful message using all these fields.


public class Employee{
	private String firstName, lastName, designation;
	private int age;
	
	public Employee() {
		firstName = "Ashita";
		lastName = "Gupta";
		age = 21;
		designation = "Trainee";
	}
	
	public Employee(String firstName, String lastName,int age,String designation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.designation = designation;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@override
	public String toString() {
		return "Name: "+firstName+" "+lastName+"\nAge: "+age+"\nDesignation: "+designation;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		Employee e2 = new Employee("ABC", "XYZ", 22, "student");
		System.out.println(e2.toString());
		e2.setFirstName("JKL");
		System.out.println(e2.toString());
	}
}
