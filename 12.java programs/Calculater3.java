import java.util.*;

class Calculater3{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st value ");
		int a=as.nextInt();
		
		System.out.print("Enter 2nd value ");
		int b=as.nextInt();
		
		System.out.print("Enter Operater ");
		String c=as.next();
		
		if(c.equals("+"))
			System.out.print("\nAddition is :"+(a+b));
		else
			if(c.equals("-"))
				System.out.print("\nSubtracation is :"+(a-b));
			else
				if(c.equals("*") || c.equals("x") || c.equals("X"))
					System.out.print("\nMultiplication is :"+a*b);
				else
					if(c.equals("/") || c.equals("\\"))
						System.out.print("\nDivion is :"+a/b);
				    else
						if(c.equals("%"))
							System.out.print("\nRemainder is :"+a%b);
						else
						if(c!="+" && c!="-" && c!="*" && c!="x" && c!="X" && c!="/" && c!="\\" && c!="%")
							System.out.print("\nInvalid Operater");
						
						
						
	}
}