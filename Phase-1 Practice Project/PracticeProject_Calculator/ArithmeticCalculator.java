package PracticeProject_Calculator;

//Importing Scanner for getting input from the user.
import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main (String[] args) {
		//Getting input of 2 numbers and option of the operator to perform.
		Scanner inputNum1 = new Scanner (System.in);
		Scanner inputNum2 = new Scanner (System.in);
		Scanner inputOp = new Scanner (System.in);
		float num1, num2, Op;
				
			System.out.println("First Number:");
			num1 = inputNum1.nextFloat();
			System.out.println("Second Number:");
			num2 = inputNum2.nextFloat();
			System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
			System.out.print("\nEnter your choice: ");
	        Op = inputOp.nextInt();
	        
	        //TypeCasting from float to double datatype.
	        double result = 0;
	        double n1=num1;
	        double n2=num2;
	        
	        //Arithmetic Operations.
	        if (Op==1)
	        	result=n1 + n2;
	        else if (Op==2)
	        	result=n1 - n2;
	        else if (Op==3)
	        	result=n1 * n2;
	        else if (Op==4)
	        	result=n1 / n2;
	        
	        //Result.
	        	System.out.println("Result=" +(double)result);
	}
}