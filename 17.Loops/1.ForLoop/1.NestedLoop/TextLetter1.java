import java.util.*;
class TextLetter1{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		char ch=ob.next().charAt(0);
			char c=65;
				
		for(char j='A'; j<=ch; j++){
			for(int i=ch; i>=j; i--){
				 if(ch>=c){
					 System.out.print(c);
					 c++ ;
				 }
			}
			c=65;
			System.out.println();
		}
	}
}