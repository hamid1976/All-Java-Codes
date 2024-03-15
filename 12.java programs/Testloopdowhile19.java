import java.util.*;

class Testloopdowhile19{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter your Name ");
		String name=as.next();
		
		int leng=name.length();
		
		int i=leng-1;
		
		do{
			
			int k=0;
			
			do{
				
				System.out.print(name.charAt(k));
				k++;
			}
			while(k<=i);
			System.out.println();
			i--;
		}
		while(i>=0);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
