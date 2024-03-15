import java.util.*;

class TestAtm{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
 
 
 

		   System.out.print("\nEnter The Rupees ");
		   int atm=as.nextInt();
		   
		   int fivethousand=atm/5000;
		   atm = atm%5000;
		   int thousand=atm/1000;
		   atm = atm%1000;
		   int fivehundred=atm/500;
		   atm = atm%500;
		   int hundred=atm/100;
		   atm = atm%100;
		   int fifty=atm/50;
		   atm = atm%50;
		   int twoty=atm/20;
		   atm = atm%20;
		   int ten=atm/10;
		   atm = atm%10;
		   int five=atm/5;
		   atm = atm%5;
		   int two=atm/2;
		   atm = atm%2;
		   int one=atm/1;
		   atm = atm%1;
		   
		   if(fivethousand>0)
			   System.out.print("\nFive Thousand "+(fivethousand));
		   
		   if(thousand>0)
			   System.out.print("\nThousand "+(thousand));
		   
		   if(fivehundred>0)
			   System.out.print("\nFive Hundred "+(fivehundred));
		   
		   if(hundred>0)
			   System.out.print("\nHundred "+(hundred));
		   
		   if(fifty>0)
			   System.out.print("\nFifty "+(fifty));
		   
		   if(twoty>0)
			   System.out.print("\nTwoty "+(twoty));
		   
		   if(ten>0)
			   System.out.print("\nTen "+(ten));
		   
		   if(five>0)
			   System.out.print("\nFive "+(five));
		   
		   if(two>0)
			   System.out.print("\nTwo "+(two));
		   
		   if(one>0)
			   System.out.print("\nOne "+(one));
	   
		   
		   
	   
	}
}