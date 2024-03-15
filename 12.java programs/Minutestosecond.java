import java.util.*;

class Minutestosecond{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a = as.nextInt();
		
		int Seconds=a*60;
		
		System.out.print("Seconds will be: "+Seconds);
		
	}
}