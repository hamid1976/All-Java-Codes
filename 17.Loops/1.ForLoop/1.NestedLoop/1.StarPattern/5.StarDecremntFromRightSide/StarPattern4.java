import java.util.*;
class StarPattern4{
	public static void main(String arg[]){
		Scanner ob=new Scanner (System.in);
		
		System.out.print("Enter any No:");
		 int anyNo=ob.nextInt();
		
		for(int i=1; i<=anyNo; i++){
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			for(int j=anyNo; j>=i; j--){
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