import java.util.*;

class Weekstominute{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a = as.nextInt();
		
		int Minutes=a*10080;
		
		System.out.print("Minutes will be: "+Minutes);
		
	}
}