import java.util.*;

class Testloopdowhile8{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int a=0, c, b=1;
			int i=1;
			do{
			
				
				c=a+b;
				
				System.out.println(" "+c);
				
				a=b;
				b=c;
				i++;
			}
			while(i<=num);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
