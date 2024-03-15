import java.util.*;

class Testloopfor63{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any No ");
		int num=as.nextInt();
		
		
		
		for(int i=1; i<=num; i++){
			int counter=0;
			
			for(int k=2; k<=i-1; k++){
				
				if(i%k==0){
					counter=counter+1;
				}
				
				
				
			}
				
				if(counter==0)
					System.out.println(i);
			
		
		
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}
}