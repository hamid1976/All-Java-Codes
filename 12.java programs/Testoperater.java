import java.util.*;

class Testoperater{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age ");
		int age1=as.nextInt();
		
	//	System.out.print("Enter 2nd Age ");
		int age2=as.nextInt();
		
		int max=age1>age2?age1:age2;
		
		System.out.print("The Maximum Age is: "+max);
		
	}
}