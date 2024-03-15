import java.util.*;
class DecrementInReverse{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=ob.next();
		int len=name.length();
		for(int j=0; j<len; j++){
			for(int i=len-1; i>=j; i--){
				
				char ch=name.charAt(i);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}