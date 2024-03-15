import java.util.*;
class x{
	public static void main(String arg[]){
		 Scanner ob=new Scanner(System.in);
		 
		  
         System.out.print("Enter Last Letter: ");
         String name=ob.next();
		
		 
		  for(int i=1;i<=5;i++){
         
          for(int j=1;j<=5-i+1;j++){
				   
				   System.out.print((char)(j+64));
			   }
			    
		 System.out.println("");
	    }   
	}
}
// ABCDE
// ABCD
// ABC
// AB
// A