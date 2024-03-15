import java.util.*;

class Testloopwhile2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' ||  ch=='Y'){
			
			System.out.print("Enter Two value ");
			int a=as.nextInt();
			int b=as.nextInt();
			
			System.out.println("Addition is: "+(a+b));
			System.out.println("Subtraction is: "+(a-b));
			System.out.println("Multiplication is: "+a*b);
			System.out.println("Divison is: "+a/b);
			System.out.println("Remainder is: "+a%b);
			
			System.out.print("Do you want to do more calculation Enter the y/n  ");
			ch=as.next().charAt(0);
			
			
		}
		
		
	}
}