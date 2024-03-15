import java.util.*;
class StarSlashline{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		
		int i=1;
		
		while(i<=num){
			int k=num;
			int j=i;
			while(i<k){
				System.out.print(" ");
				k--;
			}
			while(j<=i){
				System.out.print("*");
			j++;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}