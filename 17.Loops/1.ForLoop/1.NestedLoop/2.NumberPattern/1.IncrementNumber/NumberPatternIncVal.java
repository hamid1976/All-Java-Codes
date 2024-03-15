import java.util.*;
class NumberPatternIncVal{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any No:");
		int anyNo=ob.nextInt();
		
		for (int i=1; i<=anyNo; i++){
			    for(int j=1; j<=i ; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
// output
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
 