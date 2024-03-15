import java.util.*;

class Testloopdowhile43{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Table NO  ");
			int table=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int counter=as.nextInt();
			
			int i=2;
			do{
				
				System.out.println("Table: "+i);
				int k=1;
				do{
					System.out.println(i+" X "+k+" = "+(i*k));
					k++;
				}
				while(k<=counter);
				i++;
			}
			while(i<=table);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
