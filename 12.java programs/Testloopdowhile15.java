import java.util.*;

class Testloopdowhile15{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{System.out.print("Enter Any no ");
			int a=as.nextInt();
			
			int i=1;
			
			do{
				
				
				int k=a;
				do{
					
					System.out.print("*");
					k--;
				}
				while(k>=i);
					
				System.out.println();
				i++;
			}
			while(i<=a);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
