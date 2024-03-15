import java.util.*;

class Testloopdowhile20{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Colums ");
		int co=as.nextInt();
		
		int i=0;
		
		do{
			
			int k=0;
			
			do{
				
				System.out.print(" * ");
				k++;
			}
			while(k<co);
			System.out.println();
			i++;
		}
		while(i<ro);
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
