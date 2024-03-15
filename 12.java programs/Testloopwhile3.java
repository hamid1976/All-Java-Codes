import java.util.*;

class Testloopwhile3{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Two Value ");
			int a=as.nextInt();
			int b=as.nextInt();
			System.out.print("Enter Operater ");
			String c=as.next();
			
			if(c.equals("+"))
				System.out.println("Addition is: "+(a+b));
			
			if(c.equals("-"))
				System.out.println("Subtracation is: "+(a-b));
			
			if(c.equals("*"))
				System.out.println("Multiplication is: "+a*b);
			
			if(c.equals("x"))
				System.out.println("Multiplication is: "+a*b);
			
			if(c.equals("X"))
				System.out.println("Multiplication is: "+a*b);
			
			if(c.equals("/"))
				System.out.println("Divison is: "+a/b);
			
			if(c.equals("\\"))
				System.out.println("Divison is: "+a/b);
			
			if(c.equals("%"))
				System.out.println("Remainder is: "+a%b);
			
			System.out.print("Do you want to do more calculation y/n ");
			ch=as.next().charAt(0);
		}
		
		
	}
}