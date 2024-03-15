import java.util.*;

class Testchar4{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter the reverse Name ");
	
		String name=as.next();
		
		int leng=name.length();
		
		String rev="";
		
		
		for(int i=leng-1; i>=0; i--){
			
			rev=rev+name.charAt(i);
			
			
	
		}
		System.out.println(rev);
		
		
		
		
	}
}