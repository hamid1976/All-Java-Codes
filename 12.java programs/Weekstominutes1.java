import java.util.*;

class Weekstominutes1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Weeks ");
		int a=as.nextInt();
		
		int minutes=a*10080;
		
		System.out.print("\nMinutes will be: "+minutes);
		
	}
}