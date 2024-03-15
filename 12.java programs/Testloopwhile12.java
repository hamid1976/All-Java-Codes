import java.util.*;

class Testloopwhile12{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter Nomber ");
			int a=as.nextInt();
			
			if(a>0)
				System.out.println("Positive");
			else
				System.out.println("Nagative");
			
			
			System.out.println("Do you want to run system again Enter the y/n");
			ch=as.next().charAt(0);
		}
		
		
		
	}
}