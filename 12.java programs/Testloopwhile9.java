import java.util.*;

class Testloopwhile9{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter last Tabel NO ");
			int table=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int counter=as.nextInt();
			
			for(int i=1; i<=counter; i++){
				
				
				
				
				
					
					System.out.println(table+" X "+i+" = "+(i*table));
					
				
			}
			
			System.out.print("Do you want to run this system again Enter the y/n ");
			ch=as.next().charAt(0);
			
			
			
			
		}
		
		
		
		
		
		
	}
}