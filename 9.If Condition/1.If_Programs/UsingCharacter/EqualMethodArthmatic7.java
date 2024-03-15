import java.util.*;
class EqualMethodArthmatic7{
	public static void main(String arg []){
		Scanner ob = new Scanner (System.in);
		
		System.out.print("Enter num1 :");
		int	a= ob.nextInt();
			System.out.print("Enter num2 :");
		int	b = ob.nextInt();
			System.out.print("Enter Operater :");
		String str = ob.next();
		char c = str.charAt(0);
			
		if(c=='+')
			   System.out.print("Addition :"+(a+b));
		if(c=='-')
			   System.out.print("Subtraction :"+(a-b));
		if(c=='*')
			   System.out.print("Multiplication :"+(a*b));
		if(c=='X')
			   System.out.print("Multiplication :"+(a*b));
    	if(c=='x')
			   System.out.print("Multiplication :"+(a*b));
		if(c=='/')
			   System.out.print("Division :"+(a/b));
        if(c=='\\')
			System.out.print("Division :"+(a/b));
		if(c=='%')
			System.out.print("Remmender :"+(a%b));
		if(c!='+'&&c=='-'&&c!='*'&&c!='X'&&c!='x'&&c!='/' && c!='\\')
			System.out.print("Invalid");
	}
}