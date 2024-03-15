import java.util.*;

class Kilobytetomegabyte1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Kilobyte ");
		int a=as.nextInt();
		
		int megabyte=a/1024;
		
		System.out.print("\nMegabyte will be: "+megabyte);
		
	}
}