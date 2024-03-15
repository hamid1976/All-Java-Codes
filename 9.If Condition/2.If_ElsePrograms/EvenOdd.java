import java.util.*;
class EvenOdd{
	public static void main(String arg[])
		{
			Scanner ob=new Scanner(System.in);
			
	  int number;
  
        System.out.print("Enter the number you want to check:");
        number=ob.nextInt();
		
	    if(number % 2 == 0)
        {
            System.out.println(number+" is even number");
        }
        else 
        {
            System.out.println(number+" is odd number");
        }
    }
}
