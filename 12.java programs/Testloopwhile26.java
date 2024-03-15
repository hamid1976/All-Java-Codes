import java.util.*;

class Testloopwhile26{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=2;
			while(i<=num){
				System.out.print("\n"+i);
				i+=2;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}