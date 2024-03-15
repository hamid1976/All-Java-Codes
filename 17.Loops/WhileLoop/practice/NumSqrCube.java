import java.util.*;
class NumSqrCube{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		int i=1;
		System.out.println("Num \t Sqr \t Cube");
		while(i<=num){
			System.out.println(i+" \t "+i*i+" \t "+i*i*i);	
			i++;
		}
	}
}