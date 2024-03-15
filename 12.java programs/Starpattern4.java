import java.util.*;

class Starpattern4{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter  No ");
		int num=as.nextInt();
		
		
		for(int i=1; i<=num; i++){
			
			for(int j=3; j>=i; j-- ){
			
			System.out.print(" ");
				
			}
			
			
			for(int b=1; b<=i; b++){
				
				System.out.print("*");
			}
			
			System.out.println("");
		
		}
	}
}