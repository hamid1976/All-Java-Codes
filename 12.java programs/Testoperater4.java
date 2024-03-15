import java.util.*;

class Testoperater4{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age ");
		int age=as.nextInt();
		
		
		String it1=(age<90 || age>=100 ?"":"A-1");
	
		
		String it2=age<80 || age>=90?"":"A";
	
		
		String it3=age<70 || age>=80?"":"B";
	
		
		String it4=age<60 || age>=70 ?"":"C";

		
	    String it5=age<50 || age>=60?"":"D";

		
		String it6=age<40 || age>=50 ?"":"E";
	
		
		String it7=age<1 || age>=40 ?"":"F";

		
		
		System.out.print(it1+"");
		System.out.print(it2+"");
		System.out.print(it3+"");
		System.out.print(it4+"");
		System.out.print(it5+"");
		System.out.print(it6+"");
		System.out.print(it7);
		
		
		
		
		
		
		
		
		
	}
}
	