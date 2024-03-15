import java.util.*;

class Megabytetobyte{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Megabyte ");
		int a = as.nextInt();
		
		int Byte=a*1048576;
		
		System.out.print("Byte will be: "+Byte);
		
	}
}