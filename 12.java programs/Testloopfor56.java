import java.util.*;

class Testloopfor56{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter last Table No ");
		int a=as.nextInt();
		System.out.print("Enter Counter No ");
		int b=as.nextInt();
		
		for(int i=2; i<=a; i++){
			System.out.println("Table: "+i );
			for(int k=1; k<=b; k++){
				System.out.println(i+" X "+k+" = "+(i*k));
			}
		}
		
	}
}