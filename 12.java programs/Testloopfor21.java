import java.util.*;

class Testloopfor21{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any NO ");
		int num=as.nextInt();
		
		int conters=0;


		
		for(int t=2; t<=num; t++)

		if(num%t==0)
			conters++;

		
		if(conters==1)
			System.out.print("is Prime No ");
		else
			System.out.print("Not a Prime No ");
		
	}
}