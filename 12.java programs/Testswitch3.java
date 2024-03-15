import java.util.*;

class Testswitch3{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Two value");
		int a=as.nextInt();
		int b=as.nextInt();
		
		System.out.print("1.+\n2.-\n3.*\n4./\n5.%\nEnter the Operater ");
		String name=as.next();
		
		switch(name){
			case "+": System.out.print("Addition is: "+(a+b));break;
			case "-": System.out.print("Subtipliction is: "+(a-b));break;
			case "*": System.out.print("Multiplication is: "+a*b);break;
			case "x": System.out.print("Multiplication is: "+a*b);break;
			case "X": System.out.print("Multiplication is: "+a*b);break;
			case "/": System.out.print("Divison is: "+a/b);break;
			case "\\": System.out.print("divison is: "+a/b);break;
			default: System.out.print("Invalid");
			}
		
	}
}