import java.util.*;

class Weekstoseconds{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a = as.nextInt();
		
		int Seconds=a*604800;
		
		System.out.print("Seconds will be: "+Seconds);
		
	}
}