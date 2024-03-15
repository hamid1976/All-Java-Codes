import java.util.*;

class Secondstoweek{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Seconds ");
		int a = as.nextInt();
		
		int Weeks=a/604800;
		
		System.out.print("Weeks will be: "+Weeks);
		
	}
}