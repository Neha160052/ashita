import java.util.Scanner;

// Write a program to read user input until user writes XDONE and then show the entered text by the user on command line

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		String inputS = "";
		System.out.println("Enter String and to exit enter XDONE");
		while(!input.contentEquals("XDONE")) {
			input = sc.next();
			if(input.contentEquals("XDONE"))
				break;
			else
				inputS = inputS + " " + input;
		}
		
		System.out.println(inputS);
		
	}

}
