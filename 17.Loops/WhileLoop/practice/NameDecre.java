import java.util.*;
class NameDecre{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any name:");
		String name=ob.next();
		int len=name.length();
		int i=0;
		
		while(i<=len){
			int j=len;
				int k=0;
			while(j>i){
				char ch=name.charAt(k);
				System.out.print(ch);
			k++;
			j--;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}