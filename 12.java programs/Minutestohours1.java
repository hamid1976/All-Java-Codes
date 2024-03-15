import java.util.*;

class Minutestohours1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a=as.nextInt();
		
		int hours=a/60;
		
		System.out.print("\nHours will be: "+hours);
		
	}
}