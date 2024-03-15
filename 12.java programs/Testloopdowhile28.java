import java.util.*;

class Testloopdowhile28{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Table No ");
			int num=as.nextInt();
			
			System.out.print("Enter Counter No ");
			int b=as.nextInt();
			
			int i=1;
			do{
				System.out.println(num+" X "+i+" = "+(num*i));
				i++;
			}
			while(i<=b);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
