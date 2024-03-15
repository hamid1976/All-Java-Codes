import java.util.*;

class Testloopwhile5{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
			
			System.out.print("Enter java Marks ");
			int a=as.nextInt();
			
			System.out.print("Enter C++ Marks ");
			int b=as.nextInt();
			
			System.out.print("Enter Oracle Marks ");
			int c=as.nextInt();
			
			System.out.print("Enter VB Marks ");
			int d=as.nextInt();
			
			System.out.print("Enter C Marks ");
			int e=as.nextInt();
			
			int marks=a+b+c+d+e;
			int java=100*marks/500;
			
			System.out.println("Obtained Marks: "+marks+"\nTotal Marks: "+500+"\nPercentage: "+java);
			
			System.out.print("Do you want to do Marks calculation y/n ");
			ch=as.next().charAt(0);
			
			
			
			
		}
		
		
		
	}
}