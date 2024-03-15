import java.util.*;
class Age6
{
    public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
			// System.out.print("Enter Three Values?");
			// int a=ob.nextInt();
			// int b=ob.nextInt();
			// int c=ob.nextInt();
			
		System.out.print("Enter 1st Age?");
		int a=ob.nextInt();
		System.out.print("Enter 2nd Age?");
		int b=ob.nextInt();
		System.out.print("Enter 3rd Age?");
		int c=ob.nextInt();
		
			if(a>b)
				System.out.print("1st Age is greater");
			
			if(a>c)
				System.out.println("2nd Age is greater");
			
			
			if(b>c)
				 System.out.println("3rd Age is greater");
			
			
			
		// }else
			 // System.out.println("Invalid Selection");
		
	}
}	