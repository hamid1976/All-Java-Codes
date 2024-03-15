import java.util.*;

class Testloopwhile10{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int a=0, c, b=1;
			
			for(int i=1; i<=num; i++){
				
				c=a+b;
				
				System.out.println(" "+c);
				
				a=b;
				b=c;
			}
			
			
			
			System.out.print("Do you want to run this system again Enter the y/n ");
			ch=as.next().charAt(0);
			
			
		}
		
		
		
	}
}