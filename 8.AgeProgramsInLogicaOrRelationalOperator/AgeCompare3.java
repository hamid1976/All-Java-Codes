import java.util.*;
class AgeCompare3{
	public static void main(String arg[])
		{
			Scanner ob=new Scanner(System.in);
			
			System.out.print("Enter 1st Age?");
            int a=ob.nextInt();
			
			System.out.print("Enter 2nd Age?");
            int b=ob.nextInt();
			
			if(a<=b)
				System.out.println("1st Age is less or equal to 2nd Age");
			if(a>=b)
				System.out.println("1st Age is Greater than or equal to 2nd Age");
			if(b!=a)
				System.out.println("2nd Age is not equal to 1st age");
				
		}
}