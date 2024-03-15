import java.util.*;

class faizan{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		System.out.print("Enter Operater ");
		int a=as.nextInt();
		int b=as.nextInt();
		
		System.out.print("1.+\n2.-\n3.*\n4./\n5.%\nEnter Two Number ");
		String sel=as.next();
		
		switch(sel){
			case "+": System.out.print("Addition is : "+(a+b));break;
			case "-": System.out.print("Subtraction is : "+(a-b));break;
			case "*": System.out.print("Multiplication is : "+(a*b));break;
			case "/": System.out.print("Divisor is : "+(a/b));break;
			case "%": System.out.print("Remainder is : "+(a%b));break;
			default: System.out.print("Invalid Operater");
		}
		
	}
}