import java.util.*;

class Bytetogagabytes{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Byte ");
		double a = as.nextInt();
		
		double Gagabyte=a/1073741824;
		
		System.out.print("Gagabyte will be: "+Gagabyte);
		
	}
}