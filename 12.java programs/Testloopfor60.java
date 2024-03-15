import java.util.*;

class Testloopfor60{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Last letter ");
		int  a=as.nextInt();
		
		
		
	
		 
		 char ch='A';
		 
		 for(int i=a; i>=1; i--){
			 
			  ch='A';
			 for(int k=1; k<=i; k++){
				 
				 System.out.print(ch);
				
				 ch++;
			 }
			  System.out.println();
			 
			 
		 }
		
		
	}
		
}




