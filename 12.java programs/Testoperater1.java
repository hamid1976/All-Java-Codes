import java.util.*;

class Testoperater1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age ");
		int age1=as.nextInt();
		
	//	System.out.print("Enter 2nd Age ");
		int age2=as.nextInt();
		
		String str=age1>age2?"1st Age is Greater ":"2nd Age is Greater ";
		
		
		System.out.print(str);
		
		
	}
}