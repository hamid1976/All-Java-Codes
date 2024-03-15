import java.util.*;

class Secondstohour{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Seconds ");
		int a = as.nextInt();
		
		int Hours=a/3600;
		
		System.out.print("Hours will be: "+Hours);
		
	}
}