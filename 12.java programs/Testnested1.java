import java.util.*;

class Testnested1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Selection ");
		int set=as.nextInt();
		
		if(set>=1  && set<=3){
			
			int a=as.nextInt();
			int b=as.nextInt();
			
			if(set==1)
				System.out.print("Addition is "+(a+b));
			
			if(set==2)
				System.out.print("Subtraction is "+(a-b));
			
			if(set==3)
				System.out.print("Multiplication is "+a*b);
		}
		else
			System.out.print("Invalid Selection");
		
	}
}
		
