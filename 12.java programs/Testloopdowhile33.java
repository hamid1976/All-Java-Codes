import java.util.*;

class Testloopdowhile33{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int counter=0, i=1;
			do{
				
				int result=num%i;
				if(result==0)
					counter++;
				
				i++;
			}
			while(i<=num);
			if(counter==2)
				System.out.print("prime No ");
			if(counter>2)
				System.out.print("Not a prime NO ");
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
