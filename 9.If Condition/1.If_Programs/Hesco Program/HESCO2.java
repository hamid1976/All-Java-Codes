import java.util.*;
class HESCO2{
	public static void main (String arg []){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter unit ");
		int unit =ob.nextInt();
		
		 if(unit>=1 && unit<=100){
	        System.out.println(unit+"*2 = "+(unit*2));    
		    System.out.print("charges will be "+(unit*2));
		
		 }
		 if (unit>=101 && unit<=200){
			int b=unit-100;
			int c=b*4;
			System.out.println("100*2 = 200");
			System.out.println(b+"*4 = "+(b*4));
			System.out.println("charges will be "+(c+200));
		}
		 if (unit>=201 && unit<=300){
			int c=unit-200;
			int d=c*6;
			System.out.println("100*2 = 200");
			System.out.println("100*4 = 400");
			System.out.println(c+"*6 = "+(c*6));
			System.out.print("charges will be "+(d+600));
		 }
		 if (unit>=301 && unit<=400){
			 int d=unit%300;
			  System.out.println("100*2 = 200");
			  System.out.println("100*4 = 400");
			  System.out.println("100*6 = 600");
			  System.out.println(d+"*8= "+(d*8));
			  System.out.print("charges will be "+(unit*8-1200));
		 }
		 if (unit>=401 ){
			 int f=unit%400;
			  System.out.println("100*2 = 200");
			  System.out.println("100*4 = 400");
			  System.out.println("100*6 = 600");
			  System.out.println("100*8 = 800");
			  System.out.println(f+"*10 ="+(f*10));
			  System.out.print("charges will be "+(unit*10-2000));
		 }
		
	}
}