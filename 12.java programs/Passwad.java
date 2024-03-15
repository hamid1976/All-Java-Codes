import java.util.*;

class Passwod{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter the Passwad ");
		String a=as.next();
		
		char b=a.charAt(3);
		
		if(b=='Z')
			System.out.print("Your Passwad correct ");
		else
			System.out.print("Your Passwad Invalid ");
		System.exit(0);
		
	}
}
		