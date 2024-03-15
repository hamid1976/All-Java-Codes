import java.util.*;

class Testloopwhile35{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int counter=0, i=1;
			while(i<=num){
				
				int result=num%i;
				if(result==0)
					counter++;
				
				i++;
			}
			if(counter==2)
				System.out.print("prime No ");
			if(counter>2)
				System.out.print("Not a prime NO ");
			
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
