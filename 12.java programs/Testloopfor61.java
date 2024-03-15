import java.util.*;

class Testloopfor61{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Columns ");
		int co=as.nextInt();
		
		for(int i=1; i<=ro; i++){
			
			for(int k=1; k<=co; k++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}