import java.util.*;

class Testloopfor49{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		
		System.out.print("Enter Total No of items ");
		int a=as.nextInt();
		
		int str=0;
		
		for(int i=1; i<=a; i++){
			
			System.out.print("Enter "+i+" item price ");
			int b=as.nextInt();
			str+=b;
			
		}
		
		System.out.print("Total sum: "+str);
		
	}
}