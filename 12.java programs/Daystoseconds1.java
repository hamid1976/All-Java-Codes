import java.util.*;

class Daystoseconds1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Days ");
		int a = as.nextInt();
		
		int Seconds=a*604800;
		
		System.out.print("Seconds will be: "+Seconds);
	}
} 