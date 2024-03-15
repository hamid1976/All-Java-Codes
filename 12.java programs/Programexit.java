import java.util.*;

class Programexit{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Visual Basic works");
		int a=as.nextInt();
		
		if(a>=100){
			
			System.out.print("\nMarks must be in 0 to 100");
			System.exit(0);
		}
		if(a<100){
			System.out.print("\n seconds Marks less be in 0 to 100");
			System.exit(0);
			
		}
		
	}
}
		
		
	