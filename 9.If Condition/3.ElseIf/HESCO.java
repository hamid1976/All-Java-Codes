import java.util.*;
class HESCO{
	public static void main (String arg []){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter unit ");
		
		int a =ob.nextInt();
		int b;
		
		if(a>=1 && a<=100)
			System.out.print("unit is"+a);
	    
		else if(a>=101 && a<=200)
	        System.out.print("unit is "+(a*2-100));
		
		else if (a>=201 && a<=300)
			System.out.print("unit is "+(a*3-300));
		
		else if (a>=301 && a<=400)
			System.out.print("unit is "+(a*4-600));
		else 
		System.out.print("Invalid unit number ");
		
	}
}