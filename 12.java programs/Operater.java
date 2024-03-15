import java.util.*;

class Operater{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Value ");
		int a=as.nextInt();
		
		System.out.print("Enter 2nd Value ");
		int b=as.nextInt();
		
		System.out.print("Enter Operater ");
		String c=as.next();
		
		
		if(c.equals("+"))
			System.out.print("\nAddition is "+(a+b));
		
		
		if(c.equals("-"))
			System.out.print("\nSubtiraction is "+(a-b));
		
		
		if(c.equals("*") || c.equals("x") || c.equals("X"))
			System.out.print("\nMultiplication is "+(a*b));
			
		
		
		if(c.equals("/") || c.equals("\\"))
			System.out.print("\nDivion is "+(a/b));
			
		
		
		if(c.equals("%"))
			System.out.print("\nRemainder is "+(a%b));
		
		if(c.equals("+")|| c.equals("-")|| c.equals("*")||c.equals("X")||c.equals("x")||c.equals("/")||c.equals("\\")||c.equals("%"))
			System.out.print("");
		else
			System.out.print("Invalid Operater");
		
		
		
	//	if( c.equals("a") || c.equals("b") || c.equals("c") || c.equals("d") || c.equals("e") || c.equals("f") || c.equals("g") || c.equals("h") || c.equals("i") || c.equals("j") || c.equals("k") || c.equals("l") || c.equals ("m") ||c.equals("n") ||c.equals("o") ||c.equals("p") ||c.equals("q") ||c.equals("r") ||c.equals("s") ||c.equals("t") ||c.equals("u") ||c.equals("v") ||c.equals("w") ||c.equals("y") ||c.equals("z"))
	//		System.out.print("Invalid Operater ");
		
		
		
		
		
		
		
		
	}
}