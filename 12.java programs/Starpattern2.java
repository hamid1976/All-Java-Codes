import java.util.*;

class Starpattern2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		System.out.print("Enter No ");
		int num=as.nextInt();
		
		for(int i=1; i<=num; i++){
			
		for(int j=4; j>=i; j--){
			
			System.out.print("*");
		}	
		System.out.println("");
		}
		
	}
}