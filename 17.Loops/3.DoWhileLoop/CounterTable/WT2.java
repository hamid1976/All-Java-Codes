import java.util.*;
class WT2{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		char ch='y';
		do{
			System.out.print("Enter Table NO:");
			int table=ob.nextInt();
			System.out.print("Enter Counter No:");
			int counter=ob.nextInt();
			int i=1;
			do{
				System.out.println(table+"*"+i+"="+(table*i));
				i++;
			}while(i<=counter);
			
			System.out.print("Do you want to run agin Y/N:");
			ch=ob.next().charAt(0);
		}while(ch=='Y'||ch=='y');
	}
}