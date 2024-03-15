import java.util.*;

class Testloopwhile22{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Colums ");
		int co=as.nextInt();
		
		int i=0;
		
		while(i<ro){
			
			int k=0;
			
			while(k<co){
				
				System.out.print(" * ");
				k++;
			}
			System.out.println();
			i++;
		}
		System.out.print("Do you want to run this system again Enter y  ");
			ch=as.next().charAt(0);
			
		}
		
	}
}