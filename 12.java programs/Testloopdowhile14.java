import java.util.*;

class Testloopdowhile14{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
			System.out.print("Enter any No ");
		int a=as.nextInt();
		
		for(int i=1; i<=a; i++){
			
			for(int k=a; k>=i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
