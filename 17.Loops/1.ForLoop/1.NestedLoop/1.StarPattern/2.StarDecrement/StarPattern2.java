import java.util.*;
class StarPattern2{
	public static void main(String args[]){
		Scanner ob=new Scanner (System.in);
		
		for (int i=anyNo; i>=1; i--){
			for(int k=1; k<=i ; k++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
// output
// *****
// ****
// ***
// **
// *	