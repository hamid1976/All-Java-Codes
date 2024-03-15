import java.util.*;

class Testoperater5{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 5 Ages ");
		
		int age1=as.nextInt();
		int age2=as.nextInt();
		int age3=as.nextInt();
		int age4=as.nextInt();
		int age5=as.nextInt();
		
		
		String it1=age1>age2 && age1>age3 && age1>age4 && age1>age5 ?"1st Age is Greater ":"";
		String it2=age2>age1 && age2>age3 && age2>age4 && age2>age5 ?"2nd Age is Greater  ":"";
		String it3=age3>age1 && age3>age2 && age3>age4 && age3>age5 ?"3nd Age is Greater  ":"";
		String it4=age4>age1 && age4>age2 && age4>age3 && age4>age5 ?"4th Age is Greater  ":"";
		String it5=age5>age1 && age5>age2 && age5>age3 && age5>age4 ?"5th Age is Greater  ":"";
		
		
		System.out.print(it1);
		System.out.print(it2);
		System.out.print(it3);
		System.out.print(it4);
		System.out.print(it5);
		
	}
}