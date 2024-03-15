import java.util.*;
class Array_insertion1{
      public static void main(String args[]){  
	      Scanner ob=new Scanner(System.in);
	
	      System.out.print("Enter Array size : ");
	      int size=ob.nextInt();
	
	      int data[]=new int[size]; 
		  System.out.println("Enter " + size + " items ");
			
	      for(int i=0; i<data.length; i++){
				data[i] = ob.nextInt();
	      }
		  
	      System.out.println("\nTraversing ");
		  
          for(int i=0; i<data.length; i++){
        	   System.out.println("data["+i+"]:"+data[i]); 
		
          }
		 
		  System.out.println("which Item you want to insert Enter item:");
          int item=ob.nextInt();				 
                
		  System.out.println("Enter Location:");
		  int loc=ob.nextInt();
        
		  if(loc>=0 && loc<data.length){
			 
			 for(int i=data.length-1;i>loc;i--){
				data[i]=data[i-1];
			 }
			 data[loc]=item;
             
		
		     System.out.println("Item succesfully inserted");
		     System.out.println("\nTraversing ");
             for(int i=0; i<data.length; i++){
        	    System.out.println("data["+i+"]:"+data[i]); 
		     }
		  }
   }
}