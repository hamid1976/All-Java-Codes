import java.util.*;

class Testloopwhile40{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Total NO ");
			int num=as.nextInt();
			
			int str=0, i=1;
			while(i<=num){
				
				System.out.print("Enter "+i+" item price ");
				int b=as.nextInt();
				str+=b;
				i++;
				
			}
			System.out.print("Total sum: "+str);
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
