import java.util.*;
class EnterRowCol{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=ob.nextInt();
		System.out.print("Enter Colunm:");
		int col=ob.nextInt();
		
		int i=0;
		while(i<row){
			int j=0;
			while(j<col){
				System.out.print("*");
				j++;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}