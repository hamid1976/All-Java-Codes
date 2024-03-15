import java.util.*;
class TestAbsolute{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter any No?");
		int num=ob.nextInt();
		
		num=num<0? -(num): num;
		System.out.println("Absolute value is:"+num);
	}
}