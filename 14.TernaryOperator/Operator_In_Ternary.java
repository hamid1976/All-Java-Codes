import java.util.*;
class Operator_In_Ternary{
	public static void main(String agr[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter 1st value:");
		int a=ob.nextInt();
		
		System.out.print("Enter 2nd value:");
		int b=ob.nextInt();
		
		System.out.print("Enter Operator:");
		char op=ob.next().charAt(0);
		
		String str=op=='+'?("Addition="+(a+b)):
		           op=='-'?("Subtraction="+(a-b)):
				   op=='*'?("Multiplication="+(a*b)):
				   op=='x'?("Multiplication="+(a*b)):
				   op=='X'?("Multiplication="+(a*b)):
				   op=='/'?("Division="+(a/b)):
				   op=='\\'?("Division="+(a/b)):
				   op=='%'?("Remainder="+(a%b)):("Invalid operator");
				   
	   System.out.print(str);
		
		 
		
	}
}