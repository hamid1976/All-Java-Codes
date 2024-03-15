import java.util.*;
class 	PositiveorNegative{
	public static void main(String arg[]){
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter value ");
	int a = ob.nextInt();
	if(a>=0)
		System.out.print("Positive :"+a);
		
	if (a<0)
		System.out.print("Negative :"+a);	
     }
}