import java.util.*;
class TextLetter2{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		char ch=ob.next().charAt(0);
			char c=97;
				
		for(char j='a'; j<=ch; j++){
			for(int i=ch; i>=j; i--){
				
				
				 if(ch>=c){
					 System.out.print(c);
					 c++ ;
				 }
			}
			c=97;
			System.out.println();
		}
	}
}