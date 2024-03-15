import java.util.*;
class Factorial{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any no:");
		int num=ob.nextInt();
		int i=0;
		int f=1;
		while(i<num){
			f+=f*i;
			i++;
		}
			System.out.println(f);	
	}
}