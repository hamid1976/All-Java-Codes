import java.util.*;

class Minutestodays1{
	
	public static  void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a=as.nextInt();
		
		int days=a/1440;
		
		System.out.print("\nDays will be: "+days);
		
	}
}