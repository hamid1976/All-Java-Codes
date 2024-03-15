import java.util.*;
class For_Fibonacii_Series{
    public static void main(String arg[]){
		
	      int n1=0,n2=1,count=20;
		  System.out.print(n1+" "+n2);
		  
		  for(int i=1;i<=count;i++){
			  
					int sum = n1 + n2;
                    n1 = n2;
                    n2 = sum;
					System.out.print( "  "+sum);
		}
	}
}	
		    