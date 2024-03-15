import java.util.*;
class conditional2{
	public static void main (String arg []){
		Scanner ob = new Scanner (System.in);
		System.out.println("Enter two age");
		System.out.print(" 1st age ");
		int age1 = ob.nextInt();
		System.out.print("2nd age ");
		int age2 = ob.nextInt();
	    int max = age1>age2 ? "age1 is greater": age2>age1 ? "age2 is greater":"age 1 and age is equal";
		
		System.out.print(max);
	}
}
		
 