import java.util.*;
class TestException{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter 1st Value:");
		int a=ob.nextInt();
		System.out.print("Enter 2nd Value:");
		int b=ob.nextInt();
		
		try{
			int c=a/b;
			System.out.println("Division="+c);
			
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("Error="+e);
		}
		System.out.println("Good Bye");
	}
}