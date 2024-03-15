import java.util.*;

class Yearstoseconds{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a = as.nextInt();
		
		int Seconds=a*1536000;
		
		System.out.print("Seconds will be: "+Seconds);
		
	}
}