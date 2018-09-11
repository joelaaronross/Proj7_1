import java.util.Scanner;
		//Call App
public class ContactListAPP {
		//Welcome
	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List Application!\n");
				
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		//Input
		System.out.println("Enter first name:  ");
		String firstname = sc.next();

		System.out.println("Enter last name:  ");
		String lastname = sc.next();
		
		System.out.println("Enter Email:  ");
		String email = sc.next();
		
		System.out.println("Enter Phone:  ");
		String phone = sc.next();
		
		System.out.println("-------------------------------------");
		System.out.println("-----Current Contact-----------------");
		System.out.println("-------------------------------------");
		System.out.println("Name:  "+firstname +lastname);
		System.out.println("Email Address:  "+email);
		System.out.println("Phone Number:   "+phone);
		//Display
		System.out.println("--------------------------------------");
		
		
		
		System.out.print("Continue? (y/n): ");
		choice=sc.next();
		}
		//Bye!
		sc.close();
		System.out.println("Goodbye!");
	
	}
}