import java.util.*;

class Secondstodays1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Seconds ");
		int a=as.nextInt();
		
		int days=a/86400;
		
		System.out.print("\nDays will be: "+days);
		
	}
}