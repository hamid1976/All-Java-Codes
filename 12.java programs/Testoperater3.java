import java.util.*;

class Testoperater3{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		
		System.out.print("Enter 1st Age ");
		int age1=as.nextInt();
		
		System.out.print("Enter 2nd Age ");
		int age2=as.nextInt();
		
		
		String str=age1>age2?"1st Age is Greater":age2>age1?"2nd age is greater":"Both equals";
		
		System.out.print(str);
		
	}
}
		