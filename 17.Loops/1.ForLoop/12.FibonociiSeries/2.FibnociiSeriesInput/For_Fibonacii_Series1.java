import java.util.*;
class For_Fibonacii_Series1{
    public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter any No?");
		int anyNo=ob.nextInt();
		
	     int a=0,b=1;
			for(int i=1; i<=anyNo; i++){
			
			int c=a+b;
			a=b;
			b=c;
			System.out.println(""+c);
		}
    }
}