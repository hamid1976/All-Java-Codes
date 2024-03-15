import java.util.*;

class Logical2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st value ");
		int a=as.nextInt();
		
		System.out.print("Enter 2nd value ");
		int b=as.nextInt();
		
		System.out.print("Enter Operator ");
		String c=as.next();
			
			if(c.equals("X") || c.equals("*") || c.equals("x"))
				System.out.print("\nMultiplication is:"+(a*b));
			
			if(c.equals("+"))
				System.out.print("\nAddition is:"+(a+b));
			
			if(c.equals("-"))
				System.out.print("\nSubtraction is:"+(a-b));
			
			if(c.equals("/") || c.equals("\\"))
				System.out.print("\nDivion is:"+(a/b));
			
			
			if(c.equals("%"))
				System.out.print("\nRemainder is:"+(a%b));
			
			
			
			
			
			
			
			
		
	}
}

			