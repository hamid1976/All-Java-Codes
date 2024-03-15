import java.util.*;

class Secondstominutes{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Seconds ");
		int a = as.nextInt();
		
		int Minutes=a/60;
		
		System.out.print("Minutes will be: "+Minutes);
		
	}
}