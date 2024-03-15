import java.util.*;

class Testprogram{
	
	public static void main(String arg[]){
		
	
	    Scanner as=new Scanner(System.in);
	
	    System.out.print("Enter the Number  ");
	    int a=as.nextInt();
		int fivethousand=a/5000;
		int thousand=a/1000;
		int  fivehundred=a/500;
		int  hundred=a/100;
		int  fifty=a/50;
		int  twoty=a/20;
		int  ten=a/10;
		int  five=a/5;
		int  two=a/2;
		int  one=a/1;
		

	
	    if(a -5000<0)
			
		  System.out.print("\nFivethousand: ");
		  else
	      System.out.print("\nFivethousand: "+fivethousand);
	  
	  if(a -1000<0)
		  
		  System.out.print("\nThousand: ");
		  else
		  System.out.print("\nThousand: "+(thousand));
	  
	  if(a -500<0)
		  
		  System.out.print("\nFive Hundred: ");
	  else
		  System.out.print("\nFive Hundred: "+(fivehundred));
	  
	   if(a -100<0)
		  System.out.print("\nHundred: ");
	  else
		  System.out.print("\nHundred: "+(hundred));
	  
	   if(a -50<0)
		  System.out.print("\nFifty: ");
	  else
		  System.out.print("\nFifty: "+(fifty));
	  
	   if(a -20<0)
		  System.out.print("\nTwoty: ");
	  else
		  System.out.print("\nTwoty: "+(twoty));
	  
	   if(a -10<0)
		  System.out.print("\nTen: ");
	  else
		  System.out.print("\nTen: "+(ten));
	  
	   if(a -5<0)
		  System.out.print("\nFive: ");
	  else
		  System.out.print("\nFive: "+(five));
	  
	   if(a -2<0)
		  System.out.print("\nTwo: ");
	  else
		  System.out.print("\nTwo: "+(two));
	  
	   if(a -1<0)
		  System.out.print("\nOne: ");
	  else
		  System.out.print("\nOne: "+(one));
	   
	  
	  
		
	}
}
	   
	
