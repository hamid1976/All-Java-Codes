import java.util.*;
class EvenSeries{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Values:");
			int a=ob.nextInt();
			int i=2;
			while(i<=a){
			System.out.println(i);
			i+=2;
			}
			System.out.println("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			