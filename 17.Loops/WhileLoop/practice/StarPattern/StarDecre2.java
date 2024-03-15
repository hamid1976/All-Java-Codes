import java.util.*;
class StarDecre2{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		
		int i=1;
		
		while(i<=num){
			int k=1;
			int j=num;
			while(i>k){
				System.out.print(" ");
				k++;
			}
			while(j>=i){
				System.out.print("*");
			j--;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}