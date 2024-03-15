import java.util.*;
class TestOPerator_OOP{
	
	switch(op){
			 break;
		case '+':ob.add();
			Scanner ob=new Scanner(System.in);
			System.out.println("Addition");
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Enter Operator:");
			String str=ob.next();
				char Op=str.charAt(0);
			System.out.println("Addition : "+ (a+b));
		    break;
			
		case '-':ob.sub();
			Scanner ob=new Scanner(System.in);
			System.out.println("Subtraction");
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Enter Operator:");
			String str=ob.next();
				char Op=str.charAt(0);
			System.out.println("Subtraction : "+ (a-b));
		    break;
		case 'x':	
		case 'X':	
		case '*':ob.Mul();
			Scanner ob=new Scanner(System.in);
			System.out.println("Multiplication");
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Enter Operator:");
			String str=ob.next();
				char Op=str.charAt(0);
			System.out.println("Multiplication : "+ (a*b));
		    break;
		case '\\':
		case '/':ob.Div();
			Scanner ob=new Scanner(System.in);
			System.out.println("Division");
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Enter Operator:");
			String str=ob.next();
				char Op=str.charAt(0);
			System.out.println("Division : "+ (a/b));
		    break;
		case '%':ob.Rem();
			Scanner ob=new Scanner(System.in);
			System.out.println("Remainder");
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			
			System.out.print("Enter Operator:");
			String str=ob.next();
				char Op=str.charAt(0);
			System.out.println("Remainder : "+ (a%b));
		    break;
	}
	public static void main(String arg[]){
		 TestOPerator_OOP ob=new  TestOPerator_OOP();
		 switch(sel){
			 case 1:ob.add();
			 break;
			 case 2:ob.sub();
			 break;
			 case 3:ob.Mul();
			 break;
			 case 4:ob.Div();
			 break;
			 case 5:ob.Rem();
			 break;
			 ob.op();
			 break;
		 }
	}
}
      