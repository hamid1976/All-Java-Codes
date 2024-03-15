import java.util.*;

class Marksheet2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Java Marks: ");
		int a=as.nextInt();
		
		System.out.print("Enter Oracle Marks: ");
		int b=as.nextInt();
		
		System.out.print("Enter VB Marks: ");
		int c=as.nextInt();
		
		System.out.print("Enter Php Marks: ");
		int d=as.nextInt();
		
		System.out.print("Enter C Marks: ");
		int f=as.nextInt();
		
		
		int obtained=a+b+c+d+f;
		int percentage=100*obtained/500;
		
		System.out.print("Obtained Marks: "+obtained+"\nTotal Marks: "+500+"\nPercentage: "+percentage);
		
	}
}