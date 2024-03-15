import java.util.*;
class Array_deletionInDoWhile{
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
    for(int k=0; k<data.length; k++){
        	System.out.println("["+k+"]:"+data[k]); 
		
    }
	char again;
	do{
		    System.out.println("which Item you want to Remove  Enter Location:");
            int loc=ob.nextInt();				 
                
		
		
    if(loc>=0  && loc<data.length){
			
	        for(int i=loc;i<data.length-1;i++){
		        data[i]=data[i+1];
			}
			    data[size-1]=0;
		
		        System.out.println("Item succesfully deleted");
		        System.out.println("\nTraversing ");
            for(int i=0; i<data.length; i++){
        	     System.out.println("["+i+"]:"+data[i]); 
		
            }
	}
			else
			System.out.println("Invalid Location");
			
			System.out.print("Do you want to Delete Another Item? y/n:  ");
		    again=ob.next().charAt(0);
		
		}while(again=='y');
	
  }
}