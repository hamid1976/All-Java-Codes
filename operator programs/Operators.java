import java.util.*;
class Operators{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		  
		
	        System.out.print("Enter Operator:");
			int Operator=ob.nextInt();
			
			
		 
		 if( a+b == +){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();

			System.out.print("Addition : "+ (a+b));
		 }
		 if( a-b == -){
			 System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Subtraction : "+ (a-b));
		 }
		 if( a*b == *){
			  System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Multiplication : "+ (a*b));
		 }
		  if( a/b == /){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Division : "+ (a/b));
		  }
		  if( a%b == %){
			  System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Remainder : "+ (a%b));
		  }
			
			
			
		  
	}
}