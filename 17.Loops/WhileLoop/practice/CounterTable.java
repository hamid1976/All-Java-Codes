import java.util.*;
class CounterTable{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Table no:");
		int table=ob.nextInt();
		System.out.println("Enter Counter no:");
		int counter=ob.nextInt();
		int i=1;
		while(i<=counter){
		System.out.println(table+"x"+i+"="+(i*table));
            i++;
		}
		
     			
	}
}