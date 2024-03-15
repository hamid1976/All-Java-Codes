import java.util.*;

class TestRelationop8{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Units? ");
		int a=as.nextInt();
		
		if(a>=1 && a<=100){
			System.out.println("Bill is : "+a);
		}
			
			if(a>=100 && a<=200 ){
				System.out.print("2nd Bill is : "+(2*a -100));
			}
			
			if(a>=200 && a<=300 ){
				System.out.print("3nd Bill is : "+(3*a -300));
			}
				
	}
}