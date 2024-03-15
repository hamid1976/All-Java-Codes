import java.util.*;

class Unitbill{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Units bill ");
		int unit=as.nextInt();
		
		if(unit>=1 && unit<=100){
			int a=unit*2;
			System.out.print("Charges :"+a);
		}
		
		if(unit>100 && unit<=200){
			int a=100*2;
			int b=(unit-100)*4;
			System.out.print("\n100*2="+a);
			System.out.print("\n");
			System.out.print((unit-100)+"*4="+b);
			System.out.print("\nTotal Rs:"+(a+b));
		}
		if(unit>200 &&  unit<=300){
			int a=100*2;
			int b=100*4;
			int c=(unit-200)*6;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n");
			System.out.print((unit-200)+"*6="+c);
			System.out.print("\nTotal Rs: "+(a+b+c));
			
		}
		if(unit>300 && unit<=400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=(unit-300)*8;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n");
			System.out.print((unit-300)+"*8="+d);
			System.out.print("\nTotal Rs: "+(a+b+c+d));
		}
		if(unit>400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=100*8;
			int e=(unit-400)*10;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n100*8="+d);
			System.out.print("\n");
			System.out.print((unit-400)+"*10="+e);
			System.out.print("\nTotal Rs: "+(a+b+c+d+e));
		}
		
		
		
		
		
		
		
	}
}