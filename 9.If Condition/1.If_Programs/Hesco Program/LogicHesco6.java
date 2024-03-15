import java.util.*;
class LogicHesco6{
	public static void main (String arg []){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter unit ");
		
		int unit =ob.nextInt();
		 if(unit>=1 && unit<=100){
	    int a = unit * 2;
		System.out.print("Charges :"+a);
		 }
		 if (unit>=100 && unit<=200){
			 int a =100*2;
			 int b =(unit -100)*4;
			 System.out.print("100 * 2  ="+a);
			 System.out.print((unit-100)+"* 4+"+b);
			 System.out.print("Total rs :" +(a+b));
		 }
		 if (unit>=200 && unit<=300){
			 int a =100*2;
			 int b =100*4;
			 int c =(unit-200)*6;
			 System.out.print("100 * 2  ="+a);
			 System.out.print("100 * 4  ="+b);	
             System.out.print((unit-200)+"* 4+"+c);	
			 System.out.print("Total rs :" +(a+b+c));
		 }
		  if (unit>=200 && a<=300){
			 int a =100*2;
			 int b =100*4;
			 int c =100*6;
			 int d =(unit-300)*8;
			 System.out.print("100 * 2  ="+a);
			 System.out.print("100 * 4  ="+b);	
			 System.out.print("100 * 6  ="+c);	
             System.out.print((unit-300)+"* 8+"+c);	
			 System.out.print("Total rs :" +(a+b+c+d));
		 }
		 if (a>=400 ){
			 int a =100*2;
			 int b =100*4;
			 int c =100*6;
			 int d =100*8;
			 int e =(unit-400)*10;
			 System.out.print("100 * 2  ="+a);
			 System.out.print("100 * 4  ="+b);	
			 System.out.print("100 * 6  ="+c);	
			 System.out.print("100 * 8  ="+d);	
             System.out.print((unit-300)+"* 10+"+e);	
			 System.out.print("Total rs :" +(a+b+c+d+e));
		 }
	}
}