import java.util.*;
class Hesco_Program{
	
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
	
		
			System.out.print("Enter units?");
		    int units=ob.nextInt();
           
		    if(units <= 100)
				units = units*2;
			else if(units <= 200)
				units = (100*2)+(units - 100)*4;
			else if(units <=300)
				units = (100*2)+(100*4)+ (units - 200)*6;
			else if(units <= 400)
				units =(100*2)+(100*4)+(100*6)+(units - 300)*8;
			else if(units >= 400)
				 units=(100*2)+(100*4)+(100*6)+(100*8)+(units - 400) * 10;
			
			
			System.out.print("Net bill="+ units);
		
	}
}