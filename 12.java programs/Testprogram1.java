
import java.util.*;

class Testprogram1{
	
	public static void main(String arg[]){
		
	
	    Scanner as=new Scanner(System.in);
	
	    System.out.print("Enter the Number  ");
	    int a=as.nextInt();
		int fivethousand=a/5000;
		  a =  a%5000;
		int thousand=a/1000;
		 a=a%1000;
		int  fivehundred=a/500;
		a=a%500;
		int  hundred=a/100;
		a=a%100;
		int  fifty=a/50;
		a=a%50;
		int  twoty=a/20;
		a=a%20;
		int  ten=a/10;
		a=a%10;
		int  five=a/5;
		a=a%5;
		int  two=a/2;
		a=a%2;
		int  one=a/1;
		a=a%1;
		

	
	    if(fivethousand>0)
			
	      System.out.print("\nFivethousand: "+fivethousand);
			  
		
	  if(thousand>0)
		  
		  System.out.print("\nThousand: "+(thousand));
	  
	  if(fivehundred>0)
		  
		  System.out.print("\nFive Hundred: "+(fivehundred));
	  
	   if(hundred>0)
		 
		  System.out.print("\nHundred: "+(hundred));
	  
	   if(fifty>0)
		   
		  System.out.print("\nFifty: "+(fifty));
	  
	   if(twoty>0)
		  
		  System.out.print("\nTwenty: "+(twoty));
	  
	   if(ten>0)
		 
		  System.out.print("\nTen: "+(ten));
	  
	   if(five>0)
	
		  System.out.print("\nFive: "+(five));
	  
	   if(two>0)
		  
		  System.out.print("\nTwo: "+(two));
	  
	   if(one>0)
		   
		  System.out.print("\nOne: "+(one));
	   
	  
	  
		
	}
}
	   
	
