package AssistedPracticeProject;

public class typeCastingProgram {
public static void main(String[] args) {
	
	//Implicit conversion
	System.out.println("The Implicit Type Casting Process:");
	char a='P';
	System.out.println("The char value of A is : "+a);
	
	int b=a;
	System.out.println("The int value of A is : "+b);
	
	float c=a;
	System.out.println("The float value of A is : "+c);
	
	double d=a;
	System.out.println("The double value of A is : "+d);
	
	long e=a;
	System.out.println("The long value of A is : "+e);

	
	
	//Explicit Conversion
		System.out.println("The Explicit Type Casting Process:");
		
		double x = 93.9;
		int y=(int)x;
		System.out.println("The int value of 93.9 is : "+y);
		
		
		int l=50;
		char z=(char)l;
		System.out.println("The char value of 50 is : "+z);
	
}
}
