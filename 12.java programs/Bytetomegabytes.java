import java.util.*;

class Bytetomegabytes{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		int a = as.nextInt();
		
		int Megabyte=a/1048576;
		
		System.out.print("Megabyte will be: "+Megabyte);
		
	}
}