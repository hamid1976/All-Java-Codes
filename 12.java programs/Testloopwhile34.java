import java.util.*;

class Testloopwhile34{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=1, a=0, b=0;
			
			System.out.print(a+"\n");
			while(i<num){
				
				a=a+3+b;
				b=b+2;
				System.out.println(a);
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
