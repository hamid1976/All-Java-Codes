import java.util.*;

class Yearstoseconds1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a=as.nextInt();
		
		int seconds=a*31536000;
		
		System.out.print("\nSeconds will be: "+seconds);
		
	}
}