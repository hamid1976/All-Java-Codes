import java.util.*;
class EvenorOdd2{
	public static void main(String arg []){
		Scanner ob = new Scanner(System.in);
		System.out.print("Emter Number :");
		int a , b ;
		a = ob.nextInt();
		b = a%2;
		if(b==0)
			System.out.print("Even number :"+a);
		if (b==1)
			System.out.print("Odd number  :"+a);
	}
}