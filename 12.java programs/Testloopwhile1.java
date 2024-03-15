import java.util.*;

class Testloopwhile1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter 1st value ");
			int a=as.nextInt();
			
			System.out.print("Enter 2nd value ");
			int b=as.nextInt();
			
			System.out.println("Addition is : "+(a+b));
			
			System.out.print("Do you want to do more calculations   y/n");
			ch=as.next().charAt(0);
		}
		
		
		
	}
}
	
	