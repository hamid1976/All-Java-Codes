import java.util.*;

class Testloopdowhile2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		int fact=1;
		do{
		System.out.print("Enter Any No ");
			int a=as.nextInt();
			
			for(int i=1; i<=a; i++){
				
				fact*=i;
				
				System.out.println(fact);
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
