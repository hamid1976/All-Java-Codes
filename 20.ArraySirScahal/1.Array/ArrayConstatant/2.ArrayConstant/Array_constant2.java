import java.util.*;
class Array_constant2{
   public static void main(String args[]){  
	Scanner ob=new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
	int size=ob.nextInt();
	
	int data[]=new int[size]; 
		    System.out.println("Enter " + size + " items ");
			
				int max=data[0];
			    int loc=0;
			for( int k=0; k<data.length; k++){
					data[k]=ob.nextInt();
				if (data[k]> max){
					max=data[k];
					loc=k;
				}
			}	
			System.out.println(max + " is greater and its location is :"+(loc+1));
            			
			// int min=data[0];
			// int location=0;
			// for(int i=0; i<data.length; i++){
				
		         // if (data[i]< min){
					 // min=data[i];
					 // location=i;
				 // }
			// }
			// System.out.println(min + " is less then and its location is:"+(location+1));
							
			
			}
   }