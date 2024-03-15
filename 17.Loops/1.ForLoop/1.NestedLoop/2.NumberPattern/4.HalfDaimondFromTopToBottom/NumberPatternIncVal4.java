import java.util.*;
class NumberPatternIncVal4{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for (int i=1; i<=anyNo; i++){
			for(int j=anyNo; j>=i; j--){
				System.out.print(" ");
			}
			for(int j=1; j<i ; j++){
				System.out.print(i+"");
			}
			for(int j=1; j<=i ; j++){
				System.out.print(i+"");
			}
			System.out.println();
		}
	}
}
// output
    // 1
   // 222
  // 33333
 // 4444444
// 555555555