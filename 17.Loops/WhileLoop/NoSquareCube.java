import java.util.*;
class NoSquareCube{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y'){
			System.out.print("Enter Values:");
			int a=ob.nextInt();
			System.out.println("No \t Square \tCube");
			int i=1;
			while(i<=a){
			int c=i*i;
			int d=i*i*i;
			System.out.println(i+"        "+c+"             "+d);
			i++;
			}
			System.out.print("Do you want to run again y? or n?");
			ch=ob.next().charAt(0);
		}
	}
}
			