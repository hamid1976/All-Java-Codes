import java.util.*;

class Operater1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Value ");
		int a=as.nextInt();
		
		System.out.print("Enter 2nd Value ");
		int b=as.nextInt();
		
		System.out.print("Enter Operater ");
		String s=as.next();
		
		char op=s.charAt(0);
		
		if(op=='+')
			System.out.print("Addition is :"+(a+b));
		else
			if(op=='-')
			System.out.print("Subtraction is :"+(a-b));
		else
			if(op=='*' || op=='x' || op=='X')
				System.out.print("Multiplication is :"+a*b);
			else
				if(op=='/' || op=='\\')
					System.out.print("Divion is :"+a/b);
				else
					System.out.print("Invalid Operater");
				
	}
}