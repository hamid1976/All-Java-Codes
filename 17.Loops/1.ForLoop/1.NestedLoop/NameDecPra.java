import java.util.*;
class NameDecPra{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=ob.next();
		int leng=name.length();
		for(int i=0; i<leng; i++){
			for(int j=i; j<=leng-1; j++){
				char ch=name.charAt(j);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}