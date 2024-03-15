import java.util.*;
class Letter{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter letter:");
		char letter=ob.next().charAt(0);
		//int len=ch.length();
		for(char ch=0; ch<letter-64; ch++){
			for(char ch1=65; ch1<=letter-ch; ch1++){
				
				//char ch=name.charAt(i);
				System.out.print(ch1);
			}
			System.out.println();
		}
	}
}