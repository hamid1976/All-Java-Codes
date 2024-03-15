import java.util.*;

class Yearstohours1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a = as.nextInt();
		
		int Hours=a*8760;
		
		System.out.print("Hours will be: "+Hours);
		
	}
}