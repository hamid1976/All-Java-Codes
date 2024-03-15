import java.util.*;

class Testloopwhile30{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Table No ");
			int num=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int b=as.nextInt();
			
			int i=1;
			while(i<=b){
				System.out.println(num+" X "+i+" = "+(num*i));
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
