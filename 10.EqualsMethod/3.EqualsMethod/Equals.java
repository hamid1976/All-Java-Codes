import java.util.*;
class Equals{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.print("Enter your Name?");
		 int name=ob.nextInt();
          		 
		 if(name.equals(6)){
			 System.out.println("Welcome");
		 }
		 else{
			  System.out.println("Sorry! you are unauthorized");
		 }
	}
}