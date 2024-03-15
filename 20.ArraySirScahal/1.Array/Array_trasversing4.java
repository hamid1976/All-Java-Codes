import java.util.*;
class Array_trasversing4{
   public static void main(String args[]){  
    int sum=0;
	Scanner ob=new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
	int size=ob.nextInt();
	
	int data[]=new int[size];	//declaration  
	
	System.out.println("Enter " + size + " items :");
        for(int i=0; i<data.length; i++){
		   System.out.print("data["+i+"]:"); 
           data[i] = ob.nextInt();
		}   
		
        System.out.println("\nTraversing ");
        for(int i=0; i<data.length; i++){
          // System.out.println(data[i]);
		    System.out.print("\ndata["+i+"]:"+data[i]); 
			sum+=data[i];
        } 
        System.out.println("\nTotal Sum:"+sum);		
   }
}
