import java.util.*;

class Minutestodays{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a = as.nextInt();
		
		int Days=a/1440;
		
		System.out.print("Days will be: "+Days);
		
	}
}