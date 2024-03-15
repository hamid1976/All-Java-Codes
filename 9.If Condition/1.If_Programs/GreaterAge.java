import java.util.*;
class GreaterAge{
	public static void main(String arg[]){
		Scanner ob = new Scanner (System.in);
		System.out.println("Enter three Age : ");
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = ob.nextInt();
		
		if (a>b && a>c)
			System.out.print("Age1 greater ");
		if (b>a && b>c)
			System.out.print("Age2 greater ");
		if (c>a && c>b)
			System.out.print("Age3 greater ");
	}
}