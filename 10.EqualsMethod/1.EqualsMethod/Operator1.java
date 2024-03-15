import java.util.*;
class Operator1{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter your Operator?");
		String operator=ob.next();
		
		 
		 if(operator.equals("+")){
			 System.out.println("Enter 1st value:");
			 int a=ob.nextInt();
			
			 System.out.println("Enter 2nd value:");
			 int b=ob.nextInt();
			 
			 System.out.print("Addition="+(a+b));
		     int Addition=ob.nextInt();
		
		 }
		 if(operator.equals("-")){
		     System.out.println("Enter 1st value:");
			 int a=ob.nextInt();
			
			 System.out.println("Enter 2nd value:");
			 int b=ob.nextInt();
			
			 System.out.print("Subtration : "+(a-b));
			 int Subtration=ob.nextInt();
		}
		if(operator.equals("*")){
			 System.out.print("Enter 1st value:");
			 int a=ob.nextInt();
			
			 System.out.print("Enter 2nd value:");
			 int b=ob.nextInt();
			 
			 System.out.print("Multiplication : "+(a*b));
			 int Multiplication=ob.nextInt();
			
		}
	    if(operator.equals("/")){
			 System.out.print("Enter 1st value:");
			 int a=ob.nextInt();
			
			 System.out.print("Enter 2nd value:");
			 int b=ob.nextInt();
			 
			 System.out.print("Division : "+(a/b));
			 int Division=ob.nextInt();
		}
		if(operator.equals("%")){
			 System.out.print("Enter 1st value:");
			 int a=ob.nextInt();
						
			 System.out.print("Enter 2nd value:");
			 int b=ob.nextInt();
			 
			 System.out.print("Remainder : "+(a%b));
			 int Remainder=ob.nextInt();
		}
	}
}