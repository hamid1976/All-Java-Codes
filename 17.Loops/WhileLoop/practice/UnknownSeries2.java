import java.util.*;
class UnknownSeries2{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		int i=1;
		while(i<=num){
			System.out.println(i*i-1);
            i++;
		}
			
	}
}