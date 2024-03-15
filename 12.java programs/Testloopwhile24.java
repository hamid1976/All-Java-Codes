import java.util.*;

class Testloopwhile24{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
		int  num=as.nextInt();
		
		int i=1;
		
		while(i<=num){
			
			int k=2, counter=0;
			
			while(k<=i-1){
				
				if(i%k==0){
					counter=counter+1;
				}
				k++;
			}
			if(counter==0){
				System.out.println(i);
			}
			i++;
		}
		System.out.print("Do you want to run this system again Enter y  ");
			ch=as.next().charAt(0);
			
		}
		
		
		
	}
}