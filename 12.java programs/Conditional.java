import java.util.*;

class Conditional{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any No ? ");
		int num=as.nextInt();
		
		int  per = num<0? -(num):num;
		
		System.out.print("Absolute Value is "+per);
		
	}
}