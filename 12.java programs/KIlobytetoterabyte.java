import java.util.*;

class Kilobytetoterabyte{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Kilobyte ");
		int a=as.nextInt();
		
		int terabyte=a/1073741824;
		
		System.out.print("\nTerabyte will be: "+terabyte);
		
	}
}