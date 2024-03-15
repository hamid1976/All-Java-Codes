import java.util.*;
class TextLetter{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		char ch=ob.next().charAt(0);
		//for(int i=0; i<ch; i++){}
		char c=65;
		for(int i=0; i<ch; i++){
			System.out.print(c);
			c++;
			if(c==ch){
				System.out.print(c);
				break;
			}
		}
	}
	
}