import java.util.*;

class Testloopdowhile21{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Colums ");
		int co=as.nextInt();
		
		
		int i=1;
		
		do{
			
			int k=1, str=0;
			
			do{
				
				str=k*i;
				System.out.print(str+" ");
				k++;
			}
			while(k<=co);
			System.out.println();
			i++;
		}
		while(i<=ro);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
