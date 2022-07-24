package PracticeProject_EmailValidation;

// Importing Scanner and Array List.
import java.util.ArrayList;
import java.util.Scanner;

public class ValidationOfAnEmail {
	public static void valid(ArrayList<String>list) {
		//Getting input mail id from the user.
		System.out.println("Enter the mail ID: ");
		Scanner input = new Scanner(System.in);
	      String sc=input.next();
	      
	      //Checking the email is present or not.
	      int count=0;
		  for(String element:list) {
	    	  if(element.equals(sc)) {
	    		  count=1;
	    		  break;
	    	  }
	      }
		//Result to be printed.
		if(count==1)
		{
			System.out.println("Email ID is valid");
		}
		else
		{
			System.out.println("The given Email ID is not valid");
		}
	}
	// List of Email ID.
	public static void main(String[] args) {
		ArrayList <String> email=new ArrayList<String>();
		  email.add("ram@gmail.com");
	      email.add("sam@yahoo.in");
	      email.add("study@apple.com");
	      email.add("sleep@icloud.com");
	      email.add("repeat@outlook.com");
	      
	      //ValidationOfAnEmail a =new ValidationOfAnEmail();
	      ValidationOfAnEmail.valid(email);  
	}
}