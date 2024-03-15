import java.util.*;

class Testoperater{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Two Value");
		
		int a=as.nextInt();
		int b=as.nextInt();
		
		String op=as.nextInt();
		
		String per='+'?"Addition is "+(a+b):"";
		
		System.out.print(per);
