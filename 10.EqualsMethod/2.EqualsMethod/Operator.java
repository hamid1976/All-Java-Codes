import java.util.*;
class Operator{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.println("Enter 1st value:");
		 int a=ob.nextInt();
			
		System.out.println("Enter 2nd value:");
	    int b=ob.nextInt();
		
		
		System.out.print("Enter your Operator?");
		String operator=ob.next();
		
		 
		 if(operator.equals("+")){
			 
			 System.out.print("Addition="+(a+b));
		     
		 }
		 if(operator.equals("-")){
		
			
			 System.out.print("Subtration : "+(a-b));
			 
		}
		if(operator.equals("*")){

			 
			 System.out.print("Multiplication : "+(a*b));
		
			
		}
	    if(operator.equals("/")){
			
			 
			 System.out.print("Division : "+(a/b));
			 
		}
		if(operator.equals("%")){
		
			 
			 System.out.print("Remainder : "+(a%b));
			 
		}
	}
}