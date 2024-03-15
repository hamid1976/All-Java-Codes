import java.util.*;
class NumberPatternDecVal8{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for (int i=1,p=anyNo; i<=anyNo; i++,p--){
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			for(int j=anyNo; j>=i ; j--){
				System.out.print(p+"");
			}
			System.out.println();
		}
	}
}
// 55555
 // 4444
  // 333
   // 22
    // 1