import java.util.*;
class conditional3{
	public static void main (String arg []){
		Scanner ob = new Scanner (System.in);
		System.out.println("Enter two age");
		System.out.print(" 1st age ");
		int age1 = ob.nextInt();
		System.out.print("2nd age ");
		int age2 = ob.nextInt();
		System.out.print("3rd age ");
		int age3 = ob.nextInt();
		System.out.print("4th age ");
		int age4 = ob.nextInt();
		System.out.print("5th age ");
		int age5 = ob.nextInt();
	    int max = age1>age2 && age1>age3 && age1>age4 &&age1>age5 ? age1: age2>age3 && age2>age4 && age2>age5 &&age1>age2 ? age2: age3>age1 && age3>age2 && age3>age4 && age3>age5 ?age3: age4>age1 && age4>age2 && age4>age3 && age4>age5 ? age4: age5;
		
		System.out.print("the maximum age is "+max);
	}
}
		
 