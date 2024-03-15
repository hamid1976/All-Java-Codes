import java.util.*;

class Minutestoyears1{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a=as.nextInt();
		
		int years=a/525600;
		
		System.out.print("\nYears will be: "+years);
	}
}