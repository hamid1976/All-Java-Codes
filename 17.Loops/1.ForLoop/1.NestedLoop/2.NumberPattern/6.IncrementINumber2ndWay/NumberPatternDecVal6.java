import java.util.*;
class NumberPatternDecVal6{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for (int i=1,p=anyNo; i<=anyNo; i++,p--){
			for(int j=1; j<=i; j++){
				System.out.print(p+"");
			}
			System.out.println();
		}
	}
}
// output
// 5
// 44
// 333
// 2222
// 11111