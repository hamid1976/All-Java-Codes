import java.util.*;

class Testloopfor16{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any No ");
		int num=as.nextInt();
		
	    int a=0, b=1;
		
	
		
		int c;
		for(int i=1;  i<=num; i++){
		
			
			c=a+b;
	
				
		System.out.println(""+c);	
			a=b;
			b=c;
		
			
		
		}
		
	}
}