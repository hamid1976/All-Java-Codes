import java.util.*;

class Starpattern1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		System.out.print("Enter No ");
		int num=as.nextInt();
		
		for(int i=1; i<=4; i++){
			
		for(int j=1; j<=i; j++){
			
			System.out.print("*");
		}	
		System.out.println("");
		}
		
	}
}