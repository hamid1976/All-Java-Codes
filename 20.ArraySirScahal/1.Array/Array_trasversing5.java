import java.util.*;
class Array_trasversing5{
   public static void main(String args[]){  
    int sum=0;
	Scanner ob=new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
	int size=ob.nextInt();
	
	int data[]=new int[size]; 
		    System.out.println("Enter " + size + " items ");
		 
        for(int i=0; i<data.length; i++){
				 System.out.print("data["+i+"]:");
				 data[i] = ob.nextInt();
		       
		      sum+=data[i];
        }   
        System.out.println("\nTraversing ");
        for(int i=0; i<data.length; i++){
        	    System.out.println("data["+i+"]:"+data[i]); 
		
        } 
        System.out.println("Total Sum:"+sum);		
   }
}