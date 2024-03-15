import java.util.*;
class Square{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Values:");
			int a=ob.nextInt();
			//System.out.print("Odd \t Even");
			int i=1;
			//int j=1;
			while(i<=a){
			int c=i*i;
			System.out.println(""+c);
			i++;
			}
			System.out.println("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			