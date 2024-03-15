import java.util.*;
class UseOper{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter two values ?");
		
		int a = ob.nextInt();
		int b = ob.nextInt();
		
		System.out.print("Enter operator ? ");
		String s = ob.next();
		
		char op = s.charAt(1);
		if(op=='+')
			System.out.print(a+b);
		if(op=='-')
			System.out.print(a-b);
		if(op=='*')
			System.out.print(a*b);
		if(op=='/')
			System.out.print(a/b);
		if(op=='%')
			System.out.print(a%b);
	}
}
		
		
