import java.util.*;

class Calculater4{
	
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
							System.out.print("\nRemiander is :"+a%b);
							else
					        	if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("x") && !c.equals("X") && !c.equals("/") && !c.equals("\\") && !c.equals("%"));
							else{
						    	System.out.print("\nInvalid Operater");
							}
						
						
	}
}