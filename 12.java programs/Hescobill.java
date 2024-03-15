import java.util.*;

class Hescobill{
	
	public static void main(String arg[]){
		
		
	
	    Scanner as=new Scanner(System.in);

	    System.out.print("Enter Hesco  bill ");
	    int a=as.nextInt();
	
	    if(a>=1 && a<100)
			
		    System.out.print("Hesco bill is "+a);
	
	    if(a>=100 && a<200)
		    System.out.print("Hesco bill is "+(2*a -200));
	
	    if(a>=200 && a<300)
		    System.out.print("Hesco bill is "+(3*a -300));
	
	    if(a>=300 && a<400)
		    System.out.print("Hesco bill is "+(4*a -400));
	
	    if(a>=400 && a<500)
		    System.out.print("Hesco bill is "+(5*a -500));
	}
}
	
