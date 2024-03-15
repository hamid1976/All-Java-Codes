import java.util.*;
class TestGame2{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter your Lucky No?");
		int No=ob.nextInt();
		
	if(No==15 || No==19 || No==38 || No==86 )
	System.out.println("you win the game,receive your prize from receiptionist");
	
	else
	
	   System.out.println("Sorry!you lose the game may, receive your fare from receiptionist");
	
	
}
}