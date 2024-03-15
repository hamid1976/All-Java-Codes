import java.util.*;
class TextLetter3{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
							//D
		System.out.print("Enter Name:");
		char letter=ob.next().charAt(0);
						//D 68-64=4
		for(int j=0; j<letter-64; j++){
			for(char ch=65; ch<=letter-j; ch++){
					System.out.print(ch);
			}
			System.out.println();
		}
	}
}