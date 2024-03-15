import java.util.*;

class Testoperater6{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 5 Ages ");
		
		int age1=as.nextInt();
		int age2=as.nextInt();
		int age3=as.nextInt();
	//	int age4=as.nextInt();
//		int age5=as.nextInt();
		
	
		int it1=(age1>age2)?(age1>age3?age1:age3):(age2>age3?age2:age3);
		
		
		System.out.print(it1+"  1st is Greater");
	//	System.out.print(it2+"2st is Greater");
	//	System.out.print(it3+"3st is Greater");
	//	System.out.print(it4+"4th is Greater");
		
		
	//	System.out.print(it2+"2nd is Greater");
	//	System.out.print(it3+"3nd Greater");
	//	System.out.print(it4+"4th Greater");
	//	System.out.print(it5+"5th Greater");
	



   // String it1=age1>age2?"1st"  :age2>age1 ?"2nd"  :age1>age3?"1st"  :age3>age1?"3nd"  :age1>age4?"1st" :age4>age1?"4th" :age1>age5?"1st" :age5>age1?"5th":"" ;
		
	//	int it1=age1>age2?age1:age2;
	//	int it2=age2>age1?age2:age1;
		
	//	int it3=age1>age3?age1:age3;
	//	int it4=age3>age1?age3:age1;

	
	}
}
 