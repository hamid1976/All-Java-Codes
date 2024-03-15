import java.util.*;
class Age3
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
		
		if(a<b)
            System.out.println("1st Age is greater");
		if(b>a)
			System.out.println("2nd Age is greater");
		if(c>b)
			System.out.println("3rd Age is greater");
		if(d>c)
			System.out.println("4th Age is greater");
		if(e>d)
			System.out.println("5th Age is greater");
	}
}