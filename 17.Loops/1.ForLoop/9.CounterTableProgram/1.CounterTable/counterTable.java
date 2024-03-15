import java.util.*;
class counterTable{
	public static void main(String args[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Table No?");
		int Table=ob.nextInt();
		
		System.out.print("Enter Counter No?");
		int CounterNo=ob.nextInt();
		
		
		for(int i=1; i<=CounterNo; i++){
		
		
		System.out.println(Table+" * "+i+" = "+(Table*i));
		}
		
		
	}
}
		
		