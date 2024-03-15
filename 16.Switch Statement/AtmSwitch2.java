 import java.util.*;
class AtmSwitch2{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);


     System.out.println("Enter rupees:");	
		int remrupees=ob.nextInt();
		
		switch(remrupees){
			if(rupees >=5000) {
			 case 5000:  int fivethousand=rupees%5000;
			          System.out.println("fivethousand="+remrupees/5000);
			          break;
			}
			if(rupees >=1000){		  
		     case 2:  int thousand=remrupees%1000;
			          System.out.println("thousand="+remrupees/1000);
			          break;
			}
			if(rupees >=500){		  
		    case 3:  int fivehundread=remrupees%500;
			         System.out.println("fivehundread="+remrupees/500);
			         break;
			}
			if(rupees >=100){  
		    case 4: int hundread=remrupees%100;
			        System.out.println("hundread="+remrupees/100);
			        break;
			}
			if(rupees >=50){  
	         case 5: int fifty=remrupees%50;
			         System.out.println("fifty="+remrupees/50);
			         break;
			}
			if(rupees >=20){  
		     case 6:  int twenty=remrupees%20;
			          System.out.println("twenty="+remrupees/20);
			          break;
			}
			if(rupees >=10){  
		     case 7:  int ten=remrupees%10;
                      System.out.println("ten="+remrupees/10);
			          break;
			}
			if(rupees >=5){
		     case 8: int five=remrupees%5;
			 System.out.println("five="+remrupees/5);
			  break;
			}
			if(rupees >=2){  
		     case 9:  int two=remrupees%2;
			 System.out.println("two="+remrupees/2);
			  break;
			}
			if(rupees >=1){  
		     case 10:  int one=remrupees%1;
			 System.out.println("one="+remrupees/1);
			  break;
			}
           default :System.out.println("invalid input");
		
		 }
		 }