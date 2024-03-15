import java.util.*;

class Daystominutes2{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Days ");
		int a=as.nextInt();
		
		int minutes=a*1440;
		
		System.out.print("\nMinutes will be: "+minutes);
		
	}
}