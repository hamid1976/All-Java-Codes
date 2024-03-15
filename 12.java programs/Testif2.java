import java.util.*;

class Testif2{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter 1st age?");
		int age=ob.nextInt();
		
		System.out.println("Enter 2nd age?");
		int age2=ob.nextInt();
		
		if(age>age2)	
		System.out.println("1st Age is greater");
		
		else
			System.out.println("2nd Age is greater");
		
		
	}
}
		