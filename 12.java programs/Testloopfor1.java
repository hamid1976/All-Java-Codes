import java.util.*;

class Testloopfor1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any NO ");
		int num=as.nextInt();
		
		for(int i=0; i<=num; i+=5){
			
			System.out.print("\n"+i);
			
			
		}
		System.out.print("\nGood bye");
		
	}
}