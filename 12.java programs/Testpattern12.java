import java.util.*;

class Testpattern12{
	
	
	public static void main(String arg[]){
		int str1=5;
		int str=1;
		
		for(int i=1; i<=str1; i++){
			str=i;
			for(int k=1; k<=str1; k++){
				
				System.out.print(str+" ");
				
				str+=str1;
					
			}
			
			
			System.out.println();
		
		}
		
	}
}