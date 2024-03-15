import java.util.*;
class Reverse{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=ob.next();
		int len=name.length();
		for(int i=len-1; i<len; i--){
			if(i==-1){
				break;
			}
			char ch=name.charAt(i);
			System.out.print(ch);
		}
	}
}