import java.util.*;

class Testloopfor5{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No  ");
		int num=as.nextInt();
		
		System.out.print("Num\tsqr\tcube\n");
		
		for(int a=1; a<=num; a++){
			
			System.out.println((a)+"\t"+(a*a)+"\t"+(a*a*a));
		}
		
	}
}