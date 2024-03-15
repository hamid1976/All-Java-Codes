import java.util.*;

class Testloopdowhile38{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Total NO ");
			int num=as.nextInt();
			
			int str=0, i=1;
			do{
				
				System.out.print("Enter "+i+" item price ");
				int b=as.nextInt();
				str+=b;
				i++;
				
			}
			while(i<=num);
			System.out.print("Total sum: "+str);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
