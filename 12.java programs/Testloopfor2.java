import java.util.*;

class Testloopfor2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int num=as.nextInt();
		
		for(int k=2; k<=num; k+=2){
			
			System.out.print("\n"+k);
		}
		
	}
}