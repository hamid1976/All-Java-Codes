import java.util.*;

class Hourstominutes1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a=as.nextInt();
		
		int minutes=a*1440;
		
		System.out.print("\nMinutes will be: "+minutes);
		
	}
}