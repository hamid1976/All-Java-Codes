import java.util.*;

class Testloopdowhile42{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		int i=1;
			do{
				System.out.println("Outer Loop "+i);
				int k=1;
				do{
					System.out.println("Inner: "+k);
					k++;
				}
				while(k<10);
				i++;
			}
			while(i<5);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
