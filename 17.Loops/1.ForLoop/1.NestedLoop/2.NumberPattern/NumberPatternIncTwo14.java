import java.util.*;
class NumberPatternIncTwo14{
	public static void main(String arg[]){
		
		for (int i=1,p=0; i<=5; i++,p+=2){
			for(int j=5; j>=i; j--){
				System.out.print(" ");
			}
			for(int j=1; j<i ; j++){
				System.out.print(p+"");
			}
			for(int j=1; j<=i ; j++){
				System.out.print(p+"");
			}
			System.out.println();
		}
	}
}
