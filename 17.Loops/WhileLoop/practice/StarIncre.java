import java.util.*;
class StarIncre{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		
		int i=1;
		
		while(i<=num){
			int j=1;
			while(j<=i){
				System.out.print("*");
			j++;
			}
			System.out.println();
            i++;
		}
		
     			
	}
}