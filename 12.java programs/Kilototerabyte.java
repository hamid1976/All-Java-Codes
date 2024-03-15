import java.util.*;

class Kilototerabyte{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Kilobyte ");
		int a = as.nextInt();
		
		int Terabyte=a/1073741824;
		
		System.out.print("Terabyte will be: "+Terabyte);
		
	}
}