import java.util.*;
class EnterLastLetter{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Any Letter:");
		char letter=ob.next().charAt(0);
		
		int h=64;
		while(h<=letter){
			int j=letter;
				char i=65;
			while(j>h){
				System.out.print(i);
				j--;
				i++;
			}
			System.out.println();
            h++;
		}
		
     			
	}
}