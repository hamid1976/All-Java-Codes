import java.util.*;

class Testpattern9{
	
	public static void main(String arg[]){
		
		int str=1;
		
		
		for(int i=1; i<=5; i++){
			
			for(int k=1; k<=5; k++){
				
				str=i*k;
				
				System.out.print(str+"  ");
				
			}
			System.out.println();
		}
		
	}
}