import java.util.*;

class Yearstominutes1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a = as.nextInt();
		
		int Minutes=a*525600;
		
		System.out.print("Minutes will be: "+Minutes);
		
	}
}