import java.util.*;
class Age5
{
    public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter 1st Age?");
		int a=ob.nextInt();
		System.out.print("Enter 2nd Age?");
		int b=ob.nextInt();
		System.out.print("Enter 3rd Age?");
		int c=ob.nextInt();
		
		if(a>b) {
		  if(a>c) {
			          System.out.println("1st Age is greater");
		          
		}    
	 }
	     if(b>a) {
			 if(b>c){
						System.out.println("2nd Age is greater");
					
			 } 
	    }
           
		   if(c>a){
			   if(c>b){
						 System.out.println("3rd Age is greater");
					 
			   }   
		  }
						 
				   
		
		
	
}
}