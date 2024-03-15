import java.util.*;
class RowColunm{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter row:");
		int row=ob.nextInt();
		System.out.print("Enter Colunm:");
		int col=ob.nextInt();
				
		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
					 System.out.print("*");		 
			}
			System.out.println();
		}
	}
}