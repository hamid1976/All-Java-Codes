import java.util.*;

class Bytetokilobytes{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		int a = as.nextInt();
		
		int Kilobyte=a/1024;
		
		System.out.print("Kilobyte will be: "+Kilobyte);
		
	}
}