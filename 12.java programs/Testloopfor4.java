import java.util.*;

class Testloopfor4{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int num=as.nextInt();
		
		System.out.print("Odd\tEven\n");
		for(int a=1;  a<=num;   a++){
			
				
			
			System.out.println(a+"\t"+(++a));
			
		}
		
	//	System.out.print("\n\tEven");
	//	for( int a=2; a<=num; a+=2){
	//		System.out.print(a+"\n");
	//	}
		
	}
}