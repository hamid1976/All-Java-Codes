import java.util.*;

class Hourstosecond{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a = as.nextInt();
		
		int Seconds=a*3600;
		
		System.out.print("Seconds will be: "+Seconds);
		
	}
}