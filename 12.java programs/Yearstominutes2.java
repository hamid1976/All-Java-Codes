import java.util.*;

class Yearstominutes2{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Years ");
		int a=as.nextInt();
		
		int minutes=a*525600;
		
		System.out.print("\nMinutes will be: "+minutes);
		
	}
}
