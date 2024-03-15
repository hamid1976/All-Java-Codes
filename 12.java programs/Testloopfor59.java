import java.util.*;

class Testloopfor59{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
	//	System.out.print("Enter the Name ");
		String name="faizan";
		
		
		int leng=name.length();
		
		String str=" ";
		
		
		for(int i=leng-1; i>=0; i--){
			
			for(int k=0; k<=i; k++){
				
				str=str+name.charAt(k);
				System.out.print(k);
				
			
				
			}
		System.out.println();		
		}
		
		
		
	}
}