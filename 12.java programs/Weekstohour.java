import java.util.*;

class Weekstohour{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a = as.nextInt();
		
		int Hours=a*168;
		
		System.out.print("Hours will be: "+Hours);
		
	}
}