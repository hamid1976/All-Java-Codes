import java.util.*;

class Testloopfor23{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Prime No ");
		int num=as.nextInt();
		
		boolean found=true;
		
		for(int t=2; t<=num/2; t++ ){
			
			if(num%t==0)
				found=false;
			
			
		
		}
		if(found==true)
				System.out.print("Prime No");
			else
				System.out.print("not prime No ");
		
	}
}