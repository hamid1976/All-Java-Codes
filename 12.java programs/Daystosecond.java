import java.util.*;

class Daystosecond{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Days ");
		int a = as.nextInt();
		
		int Seconds=a*86400;
		
		System.out.print("Seconds will be: "+Seconds);
		
	}
}