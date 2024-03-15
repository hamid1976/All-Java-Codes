import java.util.*;

class Testloopdowhile18{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch1;
		
		do{
		System.out.print("Enter Alphabetic letter ");
		char letter=as.next().charAt(0);
		
		int i=0;
		
		do{
			
			char ch=65;
			
			do{
				
				System.out.print(ch);
				ch++;
				
			}
			while(ch<=letter-i);
			System.out.println();
			i++;
		}
		while(i<letter-64);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch1=as.next().charAt(0);
		}
		while(ch1=='y' || ch1=='Y');
		
		
	}
}
