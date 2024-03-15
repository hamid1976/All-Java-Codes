import java.util.*;

class Testloopdowhile10{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Nomber ");
			int a=as.nextInt();
			
			if(a>0)
				System.out.println("Positive");
			else
				System.out.println("Nagative");
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
