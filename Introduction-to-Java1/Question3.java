import java.util.Scanner;

//Write a java program to show following menu to the user:
//*******Menu*******
//1. Calculate Area of Circle
//2. Calculate Circumference of a Circle
//3. Exit.
//Choose an option (1-3): 
//Take radius as user input.


public class Question3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("--------Menu------- \n 1. Calculate Area of Circle \n 2. Calculate Circumference of a Circle \n 3. Exit. \n Choose an option (1-3):");
		int a = sc.nextInt();
		switch(a) {
			case 1:
			    System.out.println("Enter radius");
		        int r = sc.nextInt();
				System.out.println("Area of circle: " + (pi*r*r));
				break;
			case 2:
			    System.out.println("Enter radius");
	        	r = sc.nextInt();
				System.out.println("Circumference of circle: " + (2*pi*r));
				break;
			case 3:
				System.out.println("Exit..");
				break;
			default:
				System.out.println("invalid input");
		}
		
	}

}
