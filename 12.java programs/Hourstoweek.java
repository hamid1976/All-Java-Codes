import java.util.*;

class Hourstoweek{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a = as.nextInt();
		
		int Weeks=a/168;
		
		System.out.print("Weeks will be: "+Weeks);
		
	}
}