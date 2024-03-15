import java.util.*;
class Max_Greater{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		
		System.out.print("Enter 1st Age:");
		int age1=ob.nextInt();
     
        System.out.print("Enter 2nd age:");
		int age2=ob.nextInt();
		
	    String str=age1>age2?("1st Age is greater:"+age1):
		("2nd Age is greater:"+age2);

		
		System.out.print(str);
		// "The Maximum Age is"
		// System.out.println
		// System.out.println
	}
}