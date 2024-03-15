import java.util.*;

class Hourstoyear{
	
	public static void main(String arg[]){
		Scanner as = new Scanner(System.in);
		
		System.out.print("Enter Hours ");
		int a = as.nextInt();
		
		int Years=a/8760;
		
		System.out.print("Years will be: "+Years);
		
	}
}