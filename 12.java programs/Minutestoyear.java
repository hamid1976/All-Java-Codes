import java.util.*;

class Minutestoyear{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Minutes ");
		int a = as.nextInt();
		
		int Years=a/525600;
		
		System.out.print("Years will be: "+Years);
		
	}
}