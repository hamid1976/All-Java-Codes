import java.util.*;

class Terabytetobyte{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Terabyte ");
		long a = as.nextInt();
		
		long Byte=a*1099511627776;
		
		System.out.print("Byte will be: "+Byte);
		
	}
}
