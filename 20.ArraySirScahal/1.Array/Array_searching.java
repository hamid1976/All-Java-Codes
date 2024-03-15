import java.util.*;
class Array_searching{
   public static void main(String args[]){  
	Scanner ob=new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
	int size=ob.nextInt();
	
	int data[]=new int[size]; 
		    System.out.println("Enter " + size + " items ");
		 
        for(int i=0; i<data.length; i++){
				 data[i] = ob.nextInt();  
		}
				 System.out.println("which Item you want to search Enter item:");
                 int item=ob.nextInt();				 
                 int i;
				 
        for( i=0; i<data.length; i++){
			 if(item==data[i]){
				 System.out.println("\nIts location is " + (i+1)) ;
                 break;
			 }
		}
             if(i==size)
            	System.out.println("\n"+item+" Not found");		
		
   }
}