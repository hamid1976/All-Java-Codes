import java.util.*;

class Bytetokilobyte1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		int a=as.nextInt();
		
		int kilobyte=a/1024;
		
		System.out.print("\nKilobyte will be: "+kilobyte);
		
	}
}