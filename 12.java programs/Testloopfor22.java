import java.util.*;

class Testloopfor22{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Prime NO ");
		int num=as.nextInt();
		
		boolean found=true;
		
		for(int t=2; t<=num/2; t++)
			
			if(num%t==0){
				found=false;
			break;
			}
			if(found)
				System.out.print("prime NO");
			else
				System.out.print("Not prime No ");
		
	}
}