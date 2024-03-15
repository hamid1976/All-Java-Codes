import java.util.*;

class YeartoWeeks{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a = as.nextInt();
		
		int Weeks=a*52;
		
		System.out.print("Weeks will be: "+Weeks);
		
	}
}