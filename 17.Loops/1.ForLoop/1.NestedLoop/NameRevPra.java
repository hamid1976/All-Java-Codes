import java.util.*;
class 
{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name=ob.next();
		int leng=name.length();
		for(int i=0; i<1; i++){
			for(int j=leng-1; j<leng; j--){
				if(j==-1){
					break;
				}
				char ch=name.charAt(j);
				System.out.print(ch);
			}
			//System.out.println();
		}
	}
}