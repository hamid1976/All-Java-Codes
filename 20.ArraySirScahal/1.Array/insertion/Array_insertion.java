import java.util.*;
class Array_insertion{
   public static void main(String args[]){  
	Scanner ob=new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
	int size=ob.nextInt();
	
	int data[]=new int[size]; 
		    System.out.println("Enter " + size + " items ");
			
	  for(int i=0; i<data.length; i++){
				// System.out.print("data["+i+"]:");
				 data[i] = ob.nextInt();
	  }
	  System.out.println("\nTraversing ");
        for(int i=0; i<data.length; i++){
        	    System.out.println("data["+i+"]:"+data[i]); 
		
        }
		System.out.println("which Item you want to insert Enter item:");
                 int item=ob.nextInt();				 
                
		System.out.println("Enter Location:");
        for( int k=0; k<data.length; k++){				 
                 data[k]=ob.nextInt();
		if(item==k){
		
				item=k ;
              //   break;
			 
			//item=+data[k]+1;
			// item=data[k]+1;
		//data[k]+=k+1;
			 //System.out.println( " is greater and its location is :"+(loc-item));
		}
		break;
		}
		System.out.println("Item succesfully inserted");
		System.out.println("\nTraversing ");
        for(int i=0; i<data.length; i++){
        	    System.out.println("data["+i+"]:"+data[i]); 
		
        }
   }
}