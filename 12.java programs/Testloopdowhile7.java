import java.util.*;

class Testloopdowhile7{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
			System.out.print("Enter last Tabel NO ");
			int table=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int counter=as.nextInt();
			int i=1;
			do{
				
				
				
				
				
				
					
					System.out.println(table+" X "+i+" = "+(i*table));
					i++;
				
			
			}
			while(i<=counter);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
