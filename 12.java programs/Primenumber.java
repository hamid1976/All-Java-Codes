import java.util.*;

class Primenumber{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any No ");
		int a=as.nextInt();
		
		int str=0;
		
		for(int i=2; i<=a; i++){
			
			if(a%i==0) continue;
				str=+1;
			
			
		
			
			
		}
		if(str==0){
			System.out.println("\nPrime number ");
		}
			else{
				System.out.print("No prime Number");
			
		}
		
		
	}
}