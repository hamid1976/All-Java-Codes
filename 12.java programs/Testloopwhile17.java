import java.util.*;

class Testloopwhile17{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
	
		char ch='y';
		
		
		
		
			while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Any no ");
			int a=as.nextInt();
			
			int i=1;
			
			while(i<=a){
				
				int k=a;
				while(k>=i){
					
					System.out.print("*");
					k--;
					}
				System.out.println();
				i++;
			}
			System.out.print("Do you want to run this system again Enter y  ");
			ch=as.next().charAt(0);
			
			}
			
			
			
			
			
		
	


	
	}
}