import java.util.*;
class NameIncPra{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=ob.next();
		int leng=name.length();
		for(int i=0; i<leng; i++){
			for(int j=0; j<=i; j++){
				char ch=name.charAt(j);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}