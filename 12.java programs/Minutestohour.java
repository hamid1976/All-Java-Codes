import java.util.*;

class Minutestohour{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a = as.nextInt();
		
		int Hours=a/1440;
		
		System.out.print("Hours will be: "+Hours);
		
	}
}