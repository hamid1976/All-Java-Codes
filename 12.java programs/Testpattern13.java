import java.util.*;

class Testpattern13{
	
	public static void main(String arg[]){
		
		int n=5;
		int x;
		int y;
		
		for(int i=1; i<=n; i++){
			x=i;
			y=n-i+1;
			
			
			for(int k=1; k<=n; k++){
				
			if(k%2==1){
				System.out.print(x+" ");
			}
			else{
				System.out.print(y+" ");
			}
			x=x+n;
			y=y+n;
				

				
			}
		
			
			
			System.out.println();
		}
		
	}
}