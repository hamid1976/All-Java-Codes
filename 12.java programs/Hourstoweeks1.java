import java.util.*;

class Hourstoweeks1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a=as.nextInt();
		
		int weeks=a/168;
		
		System.out.print("\nWeeks will be: "+weeks);
		
	}
}