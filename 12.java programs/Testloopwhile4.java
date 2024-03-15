import java.util.*;

class Testloopwhile4{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		int fact=1;
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Any No ");
			int a=as.nextInt();
			
			for(int i=1; i<=a; i++){
				
				fact*=i;
				
				System.out.println(fact);
			}
				
				System.out.print("Do you want To more Factorials y/n ");
				ch=as.next().charAt(0);
			
			
			
		}
		
		
		
		
		
	}
}