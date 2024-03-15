import java.util.*;

class Yearstohours2{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a=as.nextInt();
		
		int hours=a*8760;
		
		System.out.print("\nHours will be: "+hours);
		
	}
}