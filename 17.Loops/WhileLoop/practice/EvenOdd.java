import java.util.*;
class EvenOdd{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		int i=2;
		int j=1;
		System.out.println("Even \tOdd");
		while(i<=num){
			System.out.println(i+"\t"+j);
			i+=2;
			j+=2;
			
			
		}
	}
}