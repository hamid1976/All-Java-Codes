import java.util.*;

class Programlength{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Passwad");
		String str=as.nextLine();
		
		int leng=str.length();
		
		if(leng>8){
			String s= str.substring(3);
			System.out.print("\n1st six chars are: "+s);
		}
	}
}