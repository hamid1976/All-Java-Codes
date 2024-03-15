import java.util.*;

class Operaternested1l{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Value ");
		int a=as.nextInt();
		
		System.out.print("Enter 2nd Value ");
		int b=as.nextInt();
		
		System.out.print("Enter 3nd Value");
		int c=as.nextInt();
		
		if(a<b){
			if(a<c){
				System.out.print("1st value is less ");
			}
		}
		if(b<a){
			if(b<c){
				System.out.print("2nd Value is less ");
			}
		}
		if(c<a){
			if(c<b){
				System.out.print("3nd Value is less ");
			}
		}
		
	}
}