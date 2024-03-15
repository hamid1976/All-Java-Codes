import java.util.*;
class NumberPatternDecVal10{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for (int i=1,p=anyNo; i<=anyNo; i++,p--){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int j=anyNo; j>i ; j--){
				System.out.print(p+"");
			}
			for(int j=anyNo; j>=i ; j--){
				System.out.print(p+"");
			}
			System.out.println();
		}
	}
}
// 555555555
 // 4444444
  // 33333
   // 222
    // 1