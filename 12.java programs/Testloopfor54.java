import java.util.*;

class Testloopfor54{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int num=as.nextInt();
		
		int sum=20;
		
		for(int i=1; i<=num; i++){
			
			System.out.println(i);
			if(i==sum){
				
				System.out.println("Press Any key Enter to Countiness ");
				as.nextLine();
				sum+=20;
			}
		}
	
		
	}
}