import java.util.*;
class EqualMethodArthmatic2{
	public static void main(String arg []){
		Scanner ob = new Scanner (System.in);
		char ch;
		do{
			System.out.print("Enter Operater :");
			String Airthmatic = ob.next();
			
			char s=Airthmatic.charAt(0);
			
			System.out.print("Enter num :");
			int b = ob.nextInt();
			System.out.print("Enter num :");
			int a = ob.nextInt();
			
			
			if(s=='+')
				  System.out.println("Addition :"+(a+b));
			else if(s=='-')
				  System.out.println("Subtraction :"+(a-b));
			else if(s=='X'||s=='x'||s=='*')
				  System.out.println("Multiplication :"+(a*b));
			else if(s=='/')
				  System.out.println("Division :"+(a/b));
			else  if(s=='%')
				  System.out.println("Remmender :"+(a%b));
			else 
				System.out.println("Invalid  Operator");
			
			System.out.print("do you want to do more Calculat Airthmatic Y/n");
			ch=ob.next().charAt(0);
			
		}while(ch=='y'||ch=='Y');
	}
}