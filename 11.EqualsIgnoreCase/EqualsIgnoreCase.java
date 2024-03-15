import java.util.*;
class EqualsIgnoreCase{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.print("Enter your Name?");
		 String name=ob.next();
		 
		 if(name.equalsIgnoreCase("Ali")){
			 System.out.println("Welcome");
		 }
		 else{
			  System.out.println("Sorry! you are outsider");
		 }
	}
}