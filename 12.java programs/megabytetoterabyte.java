import java.util.*;

class Megabytetoterabyte{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Megabyte ");
		int a = as.nextInt();
		
		int terabyte=a/1048576;
		
		System.out.print("terabyte will be: "+terabyte);
		
	}
}
