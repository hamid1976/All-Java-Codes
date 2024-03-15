import java.util.*;
class operCondOp{
	public static void main (String arg []){
		Scanner ob = new Scanner (System.in);
		
		System.out.print("Enter 1st value");
		int a= ob.nextInt();
		System.out.print("Enter 2nd Value");
		int b=ob.nextInt();
		System.out.print("Enter operator");
		String str = ob.next();
		char op =str.charAt(0);
		String s = "invalid";
		
		String  ans = op == '+'? ("a plus b "+(a+b)) :
		              op == '-'? ("a sub b "+(a-b)):
		              op == '*'? ("a into b "+(a*b)):
		              op == 'x'? ("a into b "+(a*b)):
		              op == 'X'? ("a into b "+(a*b)):
		              op == '/'? ("a divide b "+(a/b)):
		              op == '\\'? ("a divide b "+(a/b)):
		              op == '%'? ("a remnder b"+a%b):"invlid";
		
		System.out.println(ans);
	}
}
		