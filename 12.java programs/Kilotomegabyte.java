import java.util.*;

class Kilotomegabyte{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Kilobyte ");
		int a = as.nextInt();
		
		int Megabyte=a/1024;
		
		System.out.print("Megabyte will be: "+Megabyte);
		
	}
}