 import java.util.*;
class Switch_Selection_MiniProject{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
	 System.out.println("1.calculator\n2.seasson\n3.Alphabetic Playland\n4.UnitConverter\n5.Marksshhet\n6.Atm\n7.Trollyload\n8.Employbasicpay\n9.Hescobill");
	 int sel=ob.nextInt();
	 System.out.println();
	 
	 switch(sel){
	 case 1:
	 System.out.println("1.calculator(menu)\n2.Calculator(operator)");
	 int sel1=ob.nextInt();
	 
	 switch(sel1){
     case 1:
	 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
	 int selcal=ob.nextInt();
	 System.out.println();
	 
	 switch(selcal){
	 case 1:
	 System.out.println("Enter two values?");
	 int a=ob.nextInt();
	 int b=ob.nextInt();
	 System.out.println("Addition="+(a+b));
	 break;
	 case 2:
	 System.out.println("Enter Two values?");
	 int a1=ob.nextInt();
	 int b1=ob.nextInt();
	 System.out.println("Subtraction="+(a1-b1));
	 break;
	 case 3:
	 System.out.println("Enter Two values?");
	 int a2=ob.nextInt();
	 int b2=ob.nextInt();
	 System.out.println("Multiplication="+(a2*b2));
	 break;
	 case 4:
	 System.out.println("Enter Two Values?");
	 int a3=ob.nextInt();
	 int b3=ob.nextInt();
	 System.out.println("Division="+(a3/b3));
	 break;
	 case 5:
	 System.out.println("Enter Two values?");
	 int a4=ob.nextInt();
	 int b4=ob.nextInt();
	 System.out.println("Remainder="+(a4%b4));
	 break;
	 
	 default:System.out.println("Invalid selection");
	 break;
	 }
	 
	 break;
	 
	 case 2:
	 System.out.println("Enter Two values?");
	 int c=ob.nextInt();
	 int d=ob.nextInt();
	 
	 System.out.println("Enter Operator?");
	 char op=ob.next().charAt(0);
	 
	 switch(op){
	 case '+':
	 System.out.println("Addition="+(c+d));
	 break;
	 case '-':
	 System.out.println("Subtraction="+(c-d));
	 break;
	 case '*':
	 case 'x':
	 case 'X':
	 System.out.println("Multiplication="+(c/d));
	 break;
	 case '/':
	 case '\\':
	 System.out.println("Division="+(c/d));
	 break;
	 case '%':
	 System.out.println("Remainder="+(c/d));
	 break;
	 
	 default:
	 System.out.println("Invalid Operstor");
	 break;
	 }//End calculator operator
	 break;
	 
	 default:
	 System.out.println("Invalid selection");
	 break;
	 }//End main calculator
	 break;
	 
	 case 2:
	 System.out.println("Enter Month?");
	 int Month=ob.nextInt();
	 
	 switch(Month){
	 
	 case 11:
	 case 12:
	 case 1:
	 System.out.println("Season is winter");
	 break;
	 
	 case 2:
	 case 3:
	 case 4:
	 System.out.println("Season is Spring");
	 break;
	 
	 case 5:
	 case 6:
	 case 7:
	 System.out.println("Season is Summer");
	 break;
	 
	 case 8:
	 case 9:
	 case 10:
	 System.out.println("Season is Automn");
	 break;
	 default:
	 System.out.println("Invalid Month");
	 break;
	 }//End Month
	 
	 break;
	 default:
	 System.out.println("Invalid selection");
	 break;
	 
     
	 case 3:
	System.out.print(" Enter letter? ");
		char letter=ob.next().charAt(0);
		
	switch(letter){
			case'a':
		    case'A':System.out.println("A for Apple");
			        break;
			case'b':        
            case'B':System.out.println("B for Ball");
			        break;
            case'c':
            case'C':System.out.println("C for Cat");
			        break;
            case'd':
            case'D':System.out.println("D for Dog");
			        break;
            case'e':
            case'E':System.out.println("E for Elephent");
			        break;
            case'f':
            case'F':System.out.println("F for Furniture");
			        break;
            case'g':
            case'G':System.out.println("G for Game");
			        break;
            case'h':
            case'H':System.out.println("H for House");
			        break;
            case'i':
            case'I':System.out.println("I for Ice");
			        break;
            case'j':
            case'J':System.out.println("J for Jug");
			        break;
            case'k':
            case'K':System.out.println("K for Kite");
			        break;
            case'l':
            case'L':System.out.println("L for Lemon");
			        break;
            case'm':
            case'M':System.out.println("M for Mouse");
			        break;
            case'n':
            case'N':System.out.println("N for Net");
			        break;
            case'o':
            case'O':System.out.println("O for Orange");
			        break;
		    case'p':
		    case'P':System.out.println("p for Pineapple");
			        break;
	        case'q':
		    case'Q':System.out.println("Q for Quiz");
			        break;
		    case'r':
			case'R':System.out.println("R for Roll");
			        break;
			case's':
			case'S':System.out.println("S for Stairs");
			        break;
			case't':
		    case'T':System.out.println("T for Tape");
			        break;
			case'u':
			case'U':System.out.println("U for Umbrella");
			        break;
			case'v':
			case'V':System.out.println("V for Ven");
			        break;
		    case'w':
			case'W':System.out.println("W for Waffer");
			        break;
			case'x':
			case'X':System.out.println(" X for Xperia");
			        break;
			case'y':
			case'Y':System.out.println("Y for Yellow");
			        break;
			case'z':
			
			case'Z':System.out.println("Z for Zebra");
			        break;
					
			       					
			default:System.out.println("Invalid letter");
			break;
		}//end Alphabetic letter
		break;
		case 4:
		System.out.println("1.feet to inch\n2.inch to feet\n3.kilo to gram\n4.gram to kilo");
		
		
		System.out.print("Enter your selected:");
        int selected=ob.nextInt();
		  
		switch(selected){
			 
			 case 1:
				System.out.print("Enter feet:");
			    int feet=ob.nextInt();
			    int inch=feet*12;
				System.out.println("inch="+inch);
			 break;
			 
			 case 2:
				System.out.println("Enter inch:");
				int a=ob.nextInt();
			    int b=a/12;
				System.out.println("feet="+b);
			 break;
			
			 case 3:
				  System.out.print("Enter kilo:");
				  int kilo=ob.nextInt();
				  int gram=kilo*1000;
				  System.out.println("gram="+gram);
			  break;
			
			 case 4:
			   System.out.print("Enter gram:");		   
			   int c=ob.nextInt();
			   int d=c/1000;
			   System.out.println("kilo="+d); 
			 break;
			  
		default:System.out.println("invalid choice");	
             break;			
		}//end Unit Converter
	break;
	case 5:
	System.out.println("Enter The Marks  ");	
		
		System.out.println("Enter The Marks of Java ?  ");	
		int Java=ob.nextInt();
		System.out.println("Enter The PHP Marks?");
		int PHP=ob.nextInt();
		System.out.println("Enter The Science Marks?");
		int Science=ob.nextInt();
	    System.out.println("Enter The History Marks?");
	    int History=ob.nextInt();
	    System.out.println("Enter The Geography Marks?");
		int Geography=ob.nextInt();
		System.out.println("Total="+(500));
		int ObtainedMarks=(Java+PHP+Science+History+Geography);
		System.out.println("ObtainedMarks="+ObtainedMarks); 
		int Percentage=(ObtainedMarks)*100/500;
	    System.out.println("Percentage="+Percentage);
	    
        if(Percentage>=90 && Percentage<=100)
		    System.out.println("Grade is A1");
		if(Percentage>=80 && Percentage<90)
            System.out.println("Grade is A");
	    if(Percentage>=70 && Percentage<80)
		    System.out.println("Grade is B");
	    if(Percentage>=60 && Percentage<70)
		    System.out.println("Grade is C");
		if(Percentage>=50 && Percentage<60)
			System.out.println("Grade is D");
		if(Percentage>=40 && Percentage<50)
			System.out.println("Grade is E");
		if(Percentage<=39)
			System.out.println("Fail");
	break;
	case 6:
	System.out.println("Enter rupees:");	
		int remrupees=ob.nextInt();
			
	    int fivethousand=remrupees/5000;
	    remrupees=remrupees%5000;
	   
	    int thousand=remrupees/1000;
	    remrupees=remrupees%1000;
	   
	    int fivehundread=remrupees/500;
        remrupees=remrupees%500;
	   
	    int hundread=remrupees/100;
	    remrupees=remrupees%100;
	   
	    int fifty=remrupees/50;
	    remrupees=remrupees%50;
	   
	    int twenty=remrupees/20;
	    remrupees=remrupees%20;
	   
	    int ten=remrupees/10;
	    remrupees=remrupees%10;
	   
	    int five=remrupees/5;
	    remrupees=remrupees%5;
	   
	    int two=remrupees/2;
	    remrupees=remrupees%2;
	   
	    int one=remrupees/1;
	    remrupees=remrupees%1;
		
		 System.out.println("fivethousand="+fivethousand);
		 System.out.println("thousand="+thousand);
		 System.out.println("fivehundread="+fivehundread);
		 System.out.println("hundread="+hundread);
	     System.out.println("fifty="+fifty);
		 System.out.println("twenty="+twenty);
		 System.out.println("ten="+ten);
		 System.out.println("five="+five);
		 System.out.println("two="+two);
   break;
   case 7:	
   System.out.println("Enter The Trollyload  ?");
		 int Trollyload=ob.nextInt();
		
	     int Total=Trollyload*800;
	   
	     int driver=Trollyload*150;
	     int tax=Trollyload*80;
	     int diesel=Trollyload*210;
	   
	     int sum=driver+tax+diesel;
	   
	     System.out.println("tax="+tax);
	     System.out.println("driver="+driver);
	     System.out.println("diesel="+diesel);
	   
	     System.out.println("Profit="+(Total-sum));
	     System.out.println("Total="+Total);  
   break;
   case 8:
   System.out.println("Enter Employbasicpay:");
		  int Employbasicpay=ob.nextInt();
		 
		  int Medicalallowance=15*Employbasicpay/100;
		  int Houserent=45*Employbasicpay/100;
		  int Bonus=5*Employbasicpay/100;
		  int Grosspay=(Employbasicpay+Medicalallowance+Houserent+Bonus);
		  int Incometax=5*Employbasicpay/100;
		  int Zakat=2*Employbasicpay/100;
		  int Convenceallowance=8*Employbasicpay/100;
		  int Networth=Grosspay-(Incometax+Zakat+Convenceallowance);
		 
		  System.out.println("Medicalallowance="+Medicalallowance);
		  System.out.println("Houserent="+Houserent);
		  System.out.println("Bonus="+Bonus);
		  System.out.println("Grosspay="+Grosspay);
		  System.out.println("Incometax="+Incometax);
		  System.out.println("Zakat="+Zakat);
		  System.out.println("Convenceallowance="+Convenceallowance);
		  System.out.println("Networth="+Networth);
	break;
    case 9:
    System.out.print("Enter units?");
		    int units=ob.nextInt();
			int value=0;
           
		    if(units>=1 && units<=100)
				value = units*2;
			System.out.println("20*2="+40);
			if(units >= 101 && units<=200){
				value = (100*2)+(units- 100)*4;
			System.out.println("100*2="+200);
			System.out.println("20*4="+80);
			}
			if(units>=201 && units<=300){
				value = (100*2)+(100*4)+ (units - 200)*6;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("20*6="+120);
			}
			if(units>=301 && units<=400){
				value =(100*2)+(100*4)+(100*6)+(units - 300)*8;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("100*6="+600);
			System.out.println("20*8="+160);
			}
			if(units > 400){
				 value=(100*2)+(100*4)+(100*6)+(100*8)+(units - 400) * 10;
			System.out.println("100*2="+200);
			System.out.println("100*4="+400);
			System.out.println("100*6="+600);
			System.out.println("100*8="+800);
			System.out.println("20*10="+200);
			}
			
			
			System.out.print("Net bill="+ value);
    break;
	 
	 
	 
	 
     }//End main selection

  }//End main method
}//End class