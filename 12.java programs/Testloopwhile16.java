import java.util.*;

class Testloopwhile16{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter any No ");
		int a=as.nextInt();
		
		for(int i=1; i<=a; i++){
			
			for(int k=a; k>=i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.print("Do you want to run this system again Enter the 'y' ");
		ch=as.next().charAt(0);
		}
		
		
		
	}
}