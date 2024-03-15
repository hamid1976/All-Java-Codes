import java.util.*;
class ReverseLoopName{
	public static void main(String arg[]){
		 
	  Scanner ob = new Scanner(System.in);
         System.out.print("Enter any Name: ");
         String name=ob.nextLine();
	  
         int k=name.length();
         String s="";
     
	     for(int a=k-1; a>=0; a--){
         s=s+name.charAt(a);
         }
         System.out.println(s);
         
   
		
	}
}