import java.util.*;

class Starpattern3{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter No ");
		int a=as.nextInt();
		
		for(int i=1; i<=a; i++){
			
			for(int j=1; j<=i; j++ ){
				
				System.out.print("*");
				
			}
			System.out.println();
		}
			for(int b=1; b<=a; b++){
				
				for(int c=3; c>=b; c--){
					
					System.out.print("*");
				}
				System.out.println();
			}
			
		
		
	}
}