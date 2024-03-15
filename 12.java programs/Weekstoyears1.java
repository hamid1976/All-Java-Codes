import java.util.*;

class Weekstoyears1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a = as.nextInt();
		
		int Years=a/52;
		
		System.out.print("Years will be: "+Years);
		
	}
}