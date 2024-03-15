import java.util.*;
class StarPattern2of2{
	public static void main(String arg[]){
		Scanner ob=new Scanner (System.in);
		
		System.out.print("Enter any No:");
		 int anyNo=ob.nextInt();
		
		for (int i=anyNo; i>=1; i--){
			
			for(int k=1; k<=i ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// output
// *****
// ****
// ***
// **
// *