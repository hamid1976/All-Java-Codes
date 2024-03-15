import java.util.*;
class AgeCompare{
	public static void main(String arg[])
		{
			Scanner ob=new Scanner(System.in);
			
			System.out.print("Enter 1st Age?");
            int a=ob.nextInt();
			
			System.out.print("Enter 2nd Age?");
            int b=ob.nextInt();
			
			if(a==b)
				System.out.println("Both are equals");
			if(a>b)
				System.out.println("First Age is Greater");
			if(b>a)
				System.out.println("Second Age is Greater");
				
		}
}