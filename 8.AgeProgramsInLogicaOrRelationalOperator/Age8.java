import java.util.*;
class Age8
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
		System.out.print("Enter 4th Age?");
		int d=ob.nextInt();
		System.out.print("Enter 5th Age?");
		int e=ob.nextInt();
		
		if(a>b) {
		if(a>c) {
		if(a>d) {
		if(a>e){
			          System.out.println("1st Age is greater");
		     }
           }			 
		}    
	 }
	     if(b>a){
		 if(b>c){
	     if(b>d){
		 if(b>e){
			 
						System.out.println("2nd Age is greater");
				}
               }				
			 } 
	    }
           
		   if(c>a){
		   if(c>b){
		   if(c>d){
		   if(c>e){
			   
						 System.out.println("3rd Age is greater");
					}
                  }					
			   }   
		  }
						 
		
				   
		   if(d>a){
		   if(d>b){
		   if(d>c){
		   if(d>e){
		               System.out.println("4th Age is greater");
					}
                  }					
			   }   
		  }
			
	        		   
		   if(e>a){
		   if(e>b){
		   if(e>c){
		   if(e>d){
		               System.out.println("5th Age is greater");
					}
                  }					
			   }   
		  }
}
}