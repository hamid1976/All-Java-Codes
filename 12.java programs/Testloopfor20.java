import java.util.*;

class Testloopfor20{
	
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int num=as.nextInt();
		
		int conter=0;
		
		for(int t=1; t<=num; t++){
			
			int result=num%t;
			
			if(result==0)
				conter++;
		}
		
		if(conter==2)
			System.out.print("prime No ");
		
		if(conter>2)
			System.out.print("NOt a parime NO ");
		
	}
}