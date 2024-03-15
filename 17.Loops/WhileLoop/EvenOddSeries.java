import java.util.*;
class EvenOddSeries{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Values:");
			int a=ob.nextInt();
			System.out.print("Odd \t Even");
			int i=2;
			int j=1;
			while(i<=a){
			System.out.println(j+"\t"+i);
			i+=2;
			j+=2;
			}
			System.out.println("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			