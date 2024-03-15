import java.util.*;

class Testloopwhile44{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
	
			
			int i=1;
			while(i<5){
				System.out.println("Outer Loop "+i);
				int k=1;
				while(k<10){
					System.out.println("Inner: "+k);
					k++;
				}
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
