import java.util.*;
class ForLoop_PrimeNo2{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		 System.out.print("Enter any No : ");
         int anyNo=ob.nextInt();
		 
		 for(int i=2;  i<anyNo;   i++){      
              if(anyNo%i==0)     
              anyNo=0;  	
         }         
         if(anyNo==0) 
		        System.out.println("Not a Prime No"); 
            else
	            System.out.println("Prime Number ");			
    }
}