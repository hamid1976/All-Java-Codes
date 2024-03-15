import java.util.*;
class CounterTableInNested{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Table:");
		int table=ob.nextInt();
		System.out.print("Enter Counter:");
		int counter=ob.nextInt();
				
		for(int i=1; i<=table; i++){
			System.out.println("Table No="+i);
			for(int j=1; j<=counter; j++){
					 System.out.println(i+"x"+j+"="+(i*j));		 
			}
			System.out.println();
		}
	}
}