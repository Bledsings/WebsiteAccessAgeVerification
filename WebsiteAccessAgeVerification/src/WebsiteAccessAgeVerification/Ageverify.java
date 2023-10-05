package WebsiteAccessAgeVerification;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ageverify {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter your age: ");
			int age = scanner.nextInt();
			if(age < 18) {
				throw new AgeNotAllowedException ("Sorry, you are not old enough to acces this websites");
				
			}
			else {
				System.out.println("Welcome to the website!");
				
			}
		}
		
		catch (InputMismatchException | AgeNotAllowedException e) {
			System.out.println("Error: Invalid input. Please enter a valid age." );
		};
		
		
		
	}

}

class AgeNotAllowedException extends Exception{
	public AgeNotAllowedException (String message) {
		super(message);
	}
}