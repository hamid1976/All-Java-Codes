import java.util.*;

class Inches1{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Inches ");
		int a = as.nextInt();
		
		int Feet=a/12;
		
		System.out.print("Feet will be: "+Feet);
		
	}
}