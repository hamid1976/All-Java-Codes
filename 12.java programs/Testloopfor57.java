import java.util.*;

class Testloopfor57{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int a=as.nextInt();
		
		for(int i=1; i<=a; i++){
			
			for(int k=5; k>=i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}