import java.util.*;
class Condition{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter 1st Age:");
		int age1=ob.nextInt();
     
        System.out.print("Enter 2nd age:");
		int age2=ob.nextInt();

        int max=age1>age2?age1:age2;
		System.out.println("The Maximum Age is"+max);
		
                			
	}
}