import java.util.*;

class Bytetoterabytes{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		short a = as.nextInt();
		
		short Terabyte=a/1099511627776;
		
		System.out.print("Terabyte will be: "+Terabyte);
		
	}
}