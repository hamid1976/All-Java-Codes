import java.util.*;

class Hourstoseconds2{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a = as.nextInt();
		
		int Seconds=a*3600;
		
		System.out.print("Second will be: "+Seconds);
		
	}
}