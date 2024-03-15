import java.util.*;

class Megabytetogagabyte1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Megabyte ");
		int a=as.nextInt();
		
		int gagabyte=a/1024;
		
		System.out.print("\nGagabyte will be: "+gagabyte);
	}
}