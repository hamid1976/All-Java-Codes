import java.util.*;

class Testloopfor19{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter prime No ");
		int a=as.nextInt();
		
		
		int b=0;
		
		for(int i=2; i<=a-1; i++){
			
			if(a%i==0){
				
				b=b+1;
			}
				
		}
		
		if(b==0){
			System.out.print("prime No");
		}
		else
		{
			System.out.print("Not a Prime No");
		}
		
	}
}