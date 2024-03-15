import java.util.*;

class Weektoyears{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter the Weeks");
		int a=as.nextInt();
		
		int years=a/52;
		int day=a/7;
		int hours=a/168;
		int minute=a*1080;
		int seconds=a*604800;
		
		
		System.out.print("Years will be: "+years);
		System.out.print("\nDays will be: "+day);
		System.out.print("\nHours will be: "+hours);
		System.out.print("\nSeconds will be: "+seconds);
		
		
		
		
		
		
	}
}