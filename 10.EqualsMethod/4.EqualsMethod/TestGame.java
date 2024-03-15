import java.util.*;
class TestGame{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter your Secret code?");
		String code=ob.next();
		
	if(code.equals("5Ak67") || code.equals("8KQLZ") || code.equals("BF67G") || code.equals("HIK89"))
	System.out.println("Welcome sir in the Hall");
	
	else
	
	   System.out.println("Sorry!you are outsider you may not allowed in the hall");
	
	
}
}