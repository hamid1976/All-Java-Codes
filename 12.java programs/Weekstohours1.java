import java.util.*;

class Weekstohours1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a=as.nextInt();
		
		int hours=a*168;
		
		System.out.print("\nHours will be: "+hours);
		
	}
}