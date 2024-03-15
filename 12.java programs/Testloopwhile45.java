import java.util.*;

class Testloopwhile45{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Table NO  ");
			int table=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int counter=as.nextInt();
			
			int i=2;
			while(i<=table){
				
				System.out.println("Table: "+i);
				int k=1;
				while(k<=counter){
					System.out.println(i+" X "+k+" = "+(i*k));
					k++;
				}
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
