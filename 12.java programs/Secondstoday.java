import java.util.*;

class Secondstoday{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Seconds ");
		int a = as.nextInt();
		
		int Days=a/86400;
		
		System.out.print("Days will be: "+Days);
		
	}
}