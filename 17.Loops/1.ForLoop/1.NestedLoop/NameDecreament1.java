import java.util.*;
class NameDecreament1{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=ob.next();
		int leng=name.length();
		
		for(int i=leng-1; i<leng; i--){
			if(i==-1){
				break;
			}
			for(int j=0; j<=i; j++){
				char ch=name.charAt(j);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}