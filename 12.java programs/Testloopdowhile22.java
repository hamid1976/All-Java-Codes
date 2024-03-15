import java.util.*;

class Testloopdowhile22{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
		int  num=as.nextInt();
		
		int i=1;
		
		do{
			
			int k=2, counter=0;
			
			do{
				
				if(i%k==0){
					counter=counter+1;
				}
				k++;
			}
			while(k<=i-1);
			if(counter==0){
				System.out.println(i);
			}
			i++;
		}
		while(i<=num);
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
