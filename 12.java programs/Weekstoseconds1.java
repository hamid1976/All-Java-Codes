import java.util.*;

class Weekstoseconds1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a=as.nextInt();
		
		int seconds=a*604800;
		
		System.out.print("\nSeconds will be: "+seconds);
		
	}
}