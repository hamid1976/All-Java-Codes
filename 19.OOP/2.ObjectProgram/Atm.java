import java.util.*;

class Atm{
	
	public static void main(String arg[]){
		
		Testatm ob1=new Testatm();
		
		ob1.Set(8888);
		
		ob1.Calculater();
		
		
	}
}


class Testatm{
	
	int rupees;
	
	void Set(int r){
		
		rupees=r;
	}
	
	void Calculater(){
		
		
		
		int fivethousand=rupees/5000;
		  rupees =  rupees%5000;
		int thousand=rupees/1000;
		 rupees= rupees%1000;
		int  fivehundred=rupees/500;
		rupees= rupees%500;
		int  hundred=rupees/100;
		rupees=rupees%100;
		int  fifty=rupees/50;
		rupees=rupees%50;
		int  twoty=rupees/20;
		rupees=rupees%20;
		int  ten=rupees/10;
		rupees=rupees%10;
		int  five=rupees/5;
		rupees=rupees%5;
		int  two=rupees/2;
		rupees=rupees%2;
		int  one=rupees/1;
		rupees=rupees%1;
		

	
	    if(fivethousand>0)
			
	      System.out.print("\nFivethousand: "+fivethousand);
			  
		
	  if(thousand>0)
		  
		  System.out.print("\nThousand    : "+thousand);
	  
	  if(fivehundred>0)
		  
		  System.out.print("\nFive Hundred: "+fivehundred);
	  
	   if(hundred>0)
		 
		  System.out.print("\nHundred     : "+hundred);
	  
	   if(fifty>0)
		   
		  System.out.print("\nFifty       : "+fifty);
	  
	   if(twoty>0)
		  
		  System.out.print("\nTwenty      : "+twoty);
	  
	   if(ten>0)
		 
		  System.out.print("\nTen         : "+ten);
	  
	   if(five>0)
	
		  System.out.print("\nFive        : "+five);
	  
	   if(two>0)
		  
		  System.out.print("\nTwo         : "+two);
	  
	   if(one>0)
		   
		  System.out.print("\nOne         : "+one);
	}
	
	
}

