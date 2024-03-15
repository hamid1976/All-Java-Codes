import java.util.*;
class Loop_MiniProject{
	public static void main(String arg[])
	{
	Scanner ob=new Scanner(System.in);
	char ch='y';
	while(ch=='y'||ch=='Y'){
		
	 System.out.println("1.calculator\n2.Unit Converter\n3.Seasson\n4.Alphabetic playland\n5.Atm\n6.Employee Salary calc\n7.Hesco bill\n8.Trollyload\n9.Age compare\n10.loop series\n11.About Developer\n12.Exit");
	 System.out.println("Enter selection");
	 int selection=ob.nextInt();
	 
	 while(selection==1){
	 System.out.println("\n\nCalculator");
	 System.out.println("1.calculator(menu)\n2.Calculator(operator)\n3.back\n\nEnter Selection");
	 int Clmu=ob.nextInt();
     while(Clmu==1){
		 System.out.println("\n\nCalculator(menu)");
		 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n6.back\nEnter Selection");
	     int selected=ob.nextInt();

			if(selected==1){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Addition : "+ (a+b));
		    }
		    if(selected==2){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Subtration : "+ (a-b));
		    }
	        if(selected==3){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Multiplication : "+ (a*b));
		    }
		    if(selected==4){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Division : "+ (a/b));
		    }
		    if(selected==5){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
						
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Remainder : "+ (a%b));
		    }
		    if(selected==6){
            break;
		    }
}//end (==Calculation(menu)  End==)
//   (==Calculation(Operator)  Start==)
	        if(Clmu==2){
				System.out.println("\n\nCalculator(Operator)");
				
				System.out.print("Enter 1st value:");
				int a=ob.nextInt();
				
				System.out.print("Enter 2nd value:");
				int b=ob.nextInt();
				
				System.out.print("Enter Operator:");
				String str=ob.next();
				char Op=str.charAt(0);
				String s="Invalid";
				
				String ans =Op=='+'?("Addition:"+(a+b)):
				            Op=='-'?("subtraction:"+(a-b)):
						    Op=='*'?("Multiplication:"+(a*b)):
						    Op=='/'?("Division:"+(a/b)):
						    Op=='%'?("Remainder:"+(a%b)):"Invalid";
			   System.out.println(ans);
			   
}//calculator operater end
     			
	

	if(Clmu==3){
		break;
	
	
}//end if Clmu==3
}//end while selection
//(==1. Calculator End==)
//(==2.Unit Converter Starts==)
	 while(selection==2){
		System.out.println("\nUnit Converter"); 
		System.out.println("1.feet to inch\n2.inch to feet\n3.kilo to gram\n4.gram to kilo\n5.back");
		
		
		System.out.print("Enter your selection:");
        int UnitCon=ob.nextInt();
		 
		 
		 if(UnitCon==1){
			    System.out.print("Enter feet:");
			    int feet=ob.nextInt();
			    int inch=feet*12;
				System.out.println("inch="+inch);
		 }
     	 if(UnitCon==2){
                System.out.println("Enter inch:");
				int a=ob.nextInt();
			    int b=a/12;
				System.out.println("feet="+b);
		 }
         if(UnitCon==3){
                System.out.print("Enter kilo:");
				int kilo=ob.nextInt();
				int gram=kilo*1000;
				System.out.println("gram="+gram);
		 }
         if(UnitCon==4){
        	    System.out.print("Enter gram:");		   
			    int c=ob.nextInt();
			    int d=c/1000;
			    System.out.println("kilo="+d); 
         }	
		
	     if(UnitCon==5){
		       break;
	           } 
}//end while selection 2 of unit converter
	 
		
	   if(selection==3){
		 System.out.println("\n\nSeassons");
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
}//end seasson switch
}//end seasson selection==3
	 
	    if(selection==4){
	    System.out.println("\n\nAlphabetic Playland");
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
}//end switch of alphabetic leeter
}//end ALphabetic letter selection==4
	 if(selection==5){
		 System.out.println("\n\nAtm Program");
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
		
		 System.out.println("Fivethousand="+fivethousand);
		 System.out.println("Thousand="+thousand);
		 System.out.println("Fivehundread="+fivehundread);
		 System.out.println("Hundread="+hundread);
	     System.out.println("Fifty="+fifty);
		 System.out.println("Twenty="+twenty);
		 System.out.println("Ten="+ten);
		 System.out.println("Five="+five);
		 System.out.println("Two="+two);
		 System.out.println("One="+one);
}//end Atm if  selection==5
	 if(selection==6){
		   System.out.println("\n\nEmploybasicpay(Program)");
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
}//end Employee basic pay if  selection==6
	 if(selection==7){
		 System.out.println("\n\nHesco Bill(Program)");
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
}//end Hesco if selection==7
	         
	   if(selection==8){
		  System.out.println("\n\nTrollyload");
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
}//end trollyload if selection==8
	  if(selection==9){
		    System.out.println("\n\nAge Comparator");
		    System.out.print("Enter Three Number:");
				int a=ob.nextInt();
				int b=ob.nextInt();
				int c=ob.nextInt();
			if(a>b){
				if(a>c){
					System.out.println(" A is Greater");
				}
			}
			if(b>a){
				if(b>c){
					System.out.println(" B is Greater");
				}
			}
			if(c>a){
				if(c>b){
					System.out.println(" C is Greater");
				}
			}
}//end selection 9 of if Age comparator
	  while(selection==10){
		  
		  System.out.println("\n1.Even No series\n2.Odd No series\n3.Sqr_Cube_Series\n4.Table Series\n5.Fibonacci series\n6.Prime no series\n7.star series/Unknown series\n8.Back\nEnter selection");
		  int sel=ob.nextInt();
		  System.out.println();
		  if(sel==1){
		       System.out.println("\n\nEven No_series");
			   System.out.println("Enter any No?");
		       int anyNo=ob.nextInt();
		  for(int i=0; i<=anyNo; i++){
			   if(i%2==0){
			   System.out.println(""+i);
			   }
		  }//end for loop
}//end sel 1
	if(sel==2){
	      System.out.println("\n\nOdd No_series");
		  System.out.println("Enter any No?");
		  int num=ob.nextInt();
		
		  for(int k=1; k<=num; k+=2){
          System.out.print("\n"+k);
		  }
}//end sel 2	  
	 if(sel==3){
		   System.out.println("\n\nNum_Sqr_Cube  Series");
		   System.out.println("Enter any No?");
		   int num1=ob.nextInt();
		
		
		        System.out.println("Num:  Square: Cube:");
		        for(int i=1; i<=num1;       i++){
		     
				System.out.println(i+":       "+(i*i)+":      "+(i*i*i));
				
			}	//end for loop of sqr cube
}//end sel 3
	  if(sel==4){
		   System.out.println("\n\nCounter Table ");
		   System.out.print("Enter Table:");
		   int Table=ob.nextInt();
				
				System.out.print("Enter counter No:");
				int CounterNo=ob.nextInt();
				
				for (int i=1;  i<=CounterNo; i++){
				System.out.println(Table+"*"+i+"="+(Table*i));
				}
}//end sel 4 of counter table
	  if(sel==5){
		   System.out.println("\n\nFibonacci_series");
		   int n1=0,n2=1,n3,count=20;
		 
		   System.out.print(n1+" "+n2);
		   for(int i=1; i<=count; i++){
		  
		   n3=n1+n2;        
           n1=n2;    
           n2=n3; 
		   System.out.print(" "+n3);	
		   }
}//end sel 5 of fibonacci series
	  if(sel==6){
		   System.out.println("\n\nPrime No_series");
		   System.out.print("Enter any No:");
	       int num2=ob.nextInt();
				
		   int i=1;
		
		   while(i<=num2){
		   int k=2, counter=0;
		   while(k<=i-1){
				
				if(i%k==0)
					counter=counter+1;
				k++;
		    }
			
			if(counter==0){
				System.out.println(i);
			}
			i++;
		    }
}//end sel 6 of prime No
	  if(sel==8)
		  break;
		 
	    
	  while(sel==7){
		  System.out.println("1.Forloop star\n2 Reverse star2\n3.star3\n4.star4\n5.Unknown1\n6.Unknown2\n7.Alphabetic pattern\n8.Name pattern\n9.Reverse Name\n10.Multipliction Table\n11.star in multiplication Table\n12.Back\nEnter selection");
		  System.out.println();
		  int sel1=ob.nextInt();
		  if(sel1==1){
			  System.out.println("\n\nForloop star");
			  for(int i=0; i<6; i++){
			      for(int k=0; k<i; k++){
			         System.out.print("*"); 
		 }
		 System.out.println("");
		 }
}//end sel1==  1
		 if(sel1==2){
			  System.out.println("\n\nReverse star");
			  for (int i=5; i>=1; i--){
			      for(int k=1; k<=i ; k++){
				     System.out.print("*");
			}
			System.out.println("");
		 }
}//end sel1  == 2
		 if(sel1==3){
			   System.out.println("\n\nStar Pattern");
			   System.out.println("Enter any No:");
	           int anyNo=ob.nextInt();
			   int i=0;
			   while(i<=anyNo){
			   i++;
			   int j=anyNo;
			   while(j>=i){
			   j--;
			   System.out.print("*");
			   }
               System.out.println();
			   }
}//end sel1 ==  3
		  if(sel1==4){
			   System.out.println("\n\nstar Pattern 2");
			   System.out.println("Enter any No:");
			   int anyNo=ob.nextInt();
				
		       for(int i=5;  i>=1;  i--){
				   for(int j=1;  j<=i; j++){
				      System.out.print("*");
					}
				System.out.println();
				}
}//end sel1== 4
		  if(sel1==5){
			    System.out.println("\n\nUnknown series 1");
			    int n1=0,n=0,count=20;
		
		        System.out.print(n1+" ");
		        for(int i=1; i<=count; i++){
		        n1=n1+3+n;
                n=n+2;			
		        System.out.print(" "+n1);	
		  }
}//end sel1== 5
		  if(sel1==6){
			    System.out.println("\n\nUnknown series 2");
			    int n1=2,n=0,count=20;
		
		        System.out.print(n1+" ");
		        for(int i=1; i<=count; i++){
		        n1=n1+3+n;
                n=n+2;			
		        System.out.print(" "+n1);	
		  }
}//end sel1 6 unknown series2
	     if(sel1==7){
			    System.out.println("\n\nAlphabet pattern");
		        System.out.println("Enter any Alphabet: ");
                String name=ob.next();

		        for(int i=1;i<=5;i++){
                    for(int j=1;j<=5-i+1;j++){
				        System.out.print((char)(j+64));
			    }
			    System.out.println("");
	            }   
}//end sel1 7 alphabetic pattern
		if(sel1==8){
			     System.out.println("\n\nName pattern");
				 System.out.println("Enter any Name: ");
                 String name=ob.next();
		 
		         int k=name.length();
                 String s="";
		 
		         for(int i=0; i<=k-1; i++){
			     s=s+name.charAt(i);	 
		         System.out.println(s);
	    }    
}//end sel1 8 for loop NAME PATTERN
	   if(sel1==9){
		         System.out.println("\n\nReverse Name");
				 String name="Sachal";
		         int k=name.length();
                 String s="";
		         for(int i=k-1;i>=0;i--){
					 for(int j=0;  j<=i;j++){
				         System.out.print(name.charAt(j)); 
			     }
			     System.out.println();
	    }    
}//end sel1 9 Reverse name
	   if(sel1==10){
		        System.out.println("\n\nMultiplication Table");
				System.out.println("Enter Rows: ");
                int Rows=ob.nextInt();
		   
		        System.out.println("Enter Colums: ");
                int Colums=ob.nextInt();
		   
		        int i=0;
		        while (i<Rows){
			    int k=0;
			    while(k<Colums){
				   System.out.print("*");
				   k++;
			   }
			   System.out.println();
			   i++;
		       }
}//end sel1 10 
	   if(sel1==11){
		        System.out.println("\n\nstars in Multplication Table");
				System.out.println("Enter Rows: ");
                int Rows=ob.nextInt();
		   
		        System.out.println("Enter Colums: ");
                int Colums=ob.nextInt();
		   
		        int i=1;
		        while (i<=Rows){
			    int k=1,  str=0;
			    while(k<=Colums){
				str=k*i;
				System.out.print(str+"   ");
				k++;
			    }
			    System.out.println();
			    i++;
		        }
}//end sel1 11
	  if(sel1==12){
      break;
	  }
	  }//end while 7
		  }//end while 10
	  
	  if(selection==11){
		  System.out.println("\n\nAbout Developer");
		  System.out.println("Department:Information and Technology\nOrganization:Sindh University\nNumber:____________\nEmail:____________");
	  }//end selection 11
	  if(selection==12){
		  System.out.println("Your program is closed");
		  System.exit(0);
	  }//end selection 12
	  		  
	              
	         }//end main while
	    }//end main class
}//end main method