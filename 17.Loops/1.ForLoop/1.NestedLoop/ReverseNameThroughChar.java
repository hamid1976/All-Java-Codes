import java.util.*;
class ReverseNameThroughChar{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=ob.next();
		int leng=name.length();
		for(int i=leng-1; i<leng; i--){
			  if(i==-1){
				   break;
			    }
			char ch=name.charAt(i);
			System.out.print(ch);
		}
	}
}