import java.util.*;

class Minutestoweek{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a = as.nextInt();
		
		int Weeks=a/10080;
		
		System.out.print("Weeks will be: "+Weeks);
		
	}
}