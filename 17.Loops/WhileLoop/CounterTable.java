import java.util.*;
class CounterTable{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Table:");
			int t=ob.nextInt();
			System.out.print("Enter Counter:");
			int c=ob.nextInt();
			int i=1;
			while(i<=c){
			//int c=i*i;
			int d=i*t;
			System.out.println(t+ "*" +i+"="+d);
			i++;
			}
			System.out.print("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			