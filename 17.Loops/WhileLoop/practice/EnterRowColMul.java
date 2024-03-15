import java.util.*;
class EnterRowColMul{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Row:");
		int row=ob.nextInt();
		System.out.print("Enter Colunm:");
		int col=ob.nextInt();
		
		int i=1;
		while(i<=row){
			int j=1;
			while(j<=col){
				System.out.print(i*j+"\t");
				j++;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}