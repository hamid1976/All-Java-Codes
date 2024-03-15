import java.util.*;

class Hourstominute{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a = as.nextInt();
		
		int Minutes=a*1440;
		
		System.out.print("Minutes will be: "+Minutes);
		
	}
}