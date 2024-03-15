import java.util.*;

class Testloopwhile23{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter rous ");
		int ro=as.nextInt();
		
		System.out.print("Enter Colums ");
		int co=as.nextInt();
		
		
		int i=1;
		
		while(i<=ro){
			
			int k=1, str=0;
			
			while(k<=co){
				
				str=k*i;
				System.out.print(str+" ");
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