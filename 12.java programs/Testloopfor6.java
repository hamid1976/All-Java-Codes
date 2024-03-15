import java.util.*;

class Testloopfor6{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("enter Table No ");
		int num=as.nextInt();
		
		for(int a=1; a<=num;  a++){
			
			System.out.println("2x"+(a)+"="+(a+a));
		}
		
	}
}