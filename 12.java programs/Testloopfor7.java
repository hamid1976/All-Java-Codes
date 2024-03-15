import java.util.*;

class Testloopfor7{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Table No ");
		int num=as.nextInt();
		
		System.out.print("Enter Counter no ");
		int b=as.nextInt();
		
		
		for(int a=1;  a<=b; a++){
			
			
			System.out.println(num+"x"+(a)+"="+( a));
			
		}
		
	}
}