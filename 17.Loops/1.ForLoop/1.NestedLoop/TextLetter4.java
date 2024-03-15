import java.util.*;
class TextLetter4{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
							//D
		System.out.print("Enter Name:");
		char letter=ob.next().charAt(0);
		for(int i=0; i<letter-96; i++){
			for(char ch=97; ch<=letter-i; ch++){
				System.out.print(ch);
			}
				System.out.println();
		}
	}
}