import java.util.*;

class Daystominutes1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Days ");
		int a = as.nextInt();
		
		int Minutes=a*1440;
		
		System.out.print("Minutes will be: "+Minutes);
		
	}
}