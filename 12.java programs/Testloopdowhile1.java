import java.util.*;

class Testloopdowhile1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
			System.out.print("Enter Two value "); 
			int a=as.nextInt();
			int b=as.nextInt();
			
			System.out.println("Addition "+(a+b));
			
			System.out.print("Do you want to run system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
		
		
	}
}