import java.util.*;

class Testloopfor62{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Columns ");
		int co=as.nextInt();
		
		int str=0;
		
		for(int i=1; i<=ro; i++){
			
			for(int k=1; k<=co; k++){
				
				str=k*i;
				
				System.out.print(str+" ");
				
			}
			System.out.println();
		}
		
	}
}