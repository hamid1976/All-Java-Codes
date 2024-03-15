import java.util.*;

	
	public static void main(String arg[]){
		
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter 1st value");
		int a = ab.nextInt();
		
		System.out.print("Enter 2nd value");
		int b = ab.nextInt();
		
		System.out.print("Addition is: "+(a+b));
		System.out.print("\nSubtraction is: "+(a-b));
		System.out.print("\nMultipllication is: "+(a*b));
		System.out.print("\nDivision is: "+(a/b));
		System.out.print("\nRemainder is: "+(a%b));
	}
}