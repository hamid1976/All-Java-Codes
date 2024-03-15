import java.util.*;
class AgeCompare2{
	public static void main(String arg[])
		{
			Scanner ob=new Scanner(System.in);
			
	    int number;
  
        System.out.print("Enter the number you want to check:");
        number=ob.nextInt();
		
	    if(number >=0)
        {
            System.out.println(number+" is positive number");
        }
        else 
        {
            System.out.println(number+" is negative number");
        }
    }
}
