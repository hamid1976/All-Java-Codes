import java.util.*;
class AirthmaticUse2
{
	public static void main(String arg []){
	
      Scanner ob = new Scanner (System.in);
	  
      System.out.println("1.Addition :");
	  System.out.println("2.Subtraction :");
	  System.out.println("3.Multiplication :");
	  System.out.println("4.Division :");
	  System.out.println("5.Remender :");
	  
	  System.out.print("Enter Selection:");
	  
	     int       a = ob.nextInt();
	  
	  if(a==1)
		              System.out.print("Enter var1 :");
		     int  b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	         int  c = ob.nextInt();
	                  System.out.println("Addition :"+(b+c));
	  
	  if(a==2)
		              System.out.print("Enter var1 :");
		     int  b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	         int  c = ob.nextInt();
                      System.out.println("Subtraction :"+(b-c));
	  
	  if(a==3)
		               System.out.print("Enter var1 :");
		     int  b = ob.nextInt();
	                   System.out.print("Enter var2 :");
	         int  c = ob.nextInt();
	                   System.out.println("Multiplication:"+(b*c));
	  
	  if(a==4)
		                System.out.print("Enter var1 :");
		     int  b = ob.nextInt();
	                    System.out.print("Enter var2 :");
	         int  c = ob.nextInt();
	                    System.out.println("Division :"+(b/c));
	  
      if(a==5)
		                 System.out.print("Enter var1 :");
		     int  b = ob.nextInt();
	                     System.out.print("Enter var2 :");
	         int  c = ob.nextInt();
		                 System.out.println("Remainder :"+(b%c));
	}
}