import java.util.*;

class Testoperater10{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Two Value");
		
		int a=as.nextInt();
		int b=as.nextInt();
		
		
		
		
		System.out.print("Enter Operater ");
		String op=as.next();
		
		char c=op.charAt(0);
		
		String per= c=='+' ?"Addition  is "+(a+b):
		            c=='-' ?"Subtracation is "+(a-b):
					c=='*' ?"Multiplication is "+(a*b):
					c=='x' ?"Multiplication is "+(a*b):
					c=='X' ?"Multiplication is "+(a*b):
					c=='/' ?"Divison is "+(a/b):
					c=='\\'?"Divison is "+(a/b):
					c=='%' ?"Remainder is "+(a%b):"Invalid Operater";
	
		
		System.out.print(per);
		
	}
}
