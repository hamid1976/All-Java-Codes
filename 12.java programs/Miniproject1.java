import java.util.*;

class Miniproject1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		
		while(ch=='y' || ch=='Y'){
		
		System.out.print("\n\n main menu\n1.Calculator\n2.unit Convertor\n3.Season\n4.Alphabetic Play Land\n5.Atm\n6.Employ Salary Calculator\n7.Hesco Bill Calculator\n8.Transport.(Troly Load)\n9.Age comparator\n10.Loop Series\n11.About Developer\n12.Exit\n");
		System.out.print("\nEnter Selection ");
		int mini=as.nextInt();
		
		
		 //    (==1.Calculator Start ==)
		while(mini==1){
			
			System.out.println("\n\n   Calculator");
			System.out.print("1.Calculator(menu)\n2.Calculator(Operater)\n3.back\n\nEnter Selection ");
			int cl=as.nextInt();
			
			//(== Calculation(menu) Start ==)
			while(cl==1){
				System.out.println("\n\n  Calculator(menu)");
				System.out.print("1.Addition\n2.subtraction\n3.Multiplication\n4.Divisor\n5.Remainder\n6.Back\n\nEnter Selection ");
				int menu=as.nextInt();
				
				if(menu==1){
					System.out.print("\nEnter Two value ");
					int ad1=as.nextInt();
					int ad2=as.nextInt();
					
					System.out.print("Addition is: "+(ad1+ad2));
					
					
				}
				if(menu==2){
					System.out.print("\nEnter Two value ");
					int sb1=as.nextInt();
					int sb2=as.nextInt();
					
					System.out.print("Subtraction is: "+(sb1-sb2));
					
				}
				if(menu==3){
					System.out.print("\nEnter Two value ");
					int ml1=as.nextInt();
					int ml2=as.nextInt();
					
					System.out.print("Multiplication is: "+ml1*ml2);
				}
				if(menu==4){
					System.out.print("\nEnter Two value ");
					int dv1=as.nextInt();
					int dv2=as.nextInt();
					
					System.out.print("divison is: "+dv1/dv2);
				}
				if(menu==5){
					System.out.print("\nEnter Two value ");
					int rm1=as.nextInt();
					int rm2=as.nextInt();
					
					System.out.print("Remainder is: "+rm1%rm2);
				}
				if(menu==6){break;}
				
			}
		//	(== Calculation(menu) End ==)
		
	   //   (== Calculation(Operater) Start ==)
			if(cl==2){
				System.out.print("\nEnter Two Value ");
				int op1=as.nextInt();
				int op2=as.nextInt();
				System.out.print("Enter Operater ");
				String op3=as.next();
				
				if(op3.equals("+")){
					System.out.print("Addition is: "+(op1+op2));
				}
				if(op3.equals("-")){
					System.out.print("Subtration is: "+(op1-op2));
				}
				if(op3.equals("*")){
					System.out.print("Multiplication is: "+(op1*op2));
				}
				if(op3.equals("x")){
					System.out.print("Multiplication is: "+(op1*op2));
				}
				if(op3.equals("X")){
					System.out.print("Multiplication is: "+(op1*op2));
				}
				if(op3.equals("/")){
					System.out.print("Divison is: "+(op1/op2));
				}
				if(op3.equals("\\")){
					System.out.print("Divison is: "+(op1/op2));
				}
				if(op3.equals("%")){
					System.out.print("Remainder is: "+(op1%op2));
				}
				
			}
      //    (== Calculation(Operater) End ==)
			
			if(cl==3){
				break;
			}
			
			
			
			
			}
			//(==1.Calculator End ==)
			
			//(==2.unit convertor Start==)
			while(mini==2){
				System.out.println("\nUnit convertor");
				System.out.println("1.Feet To Inches\n2.Inches To Feet\n3.Kilo To Gram\n4.Gram To Kilo\n5.Year To Days\n6.Day To Year\n7.Back\n");
				System.out.print("Enter Selection ");
				int uc=as.nextInt();
				
				//(== Feet to Inches Start ==)
				if(uc==1){
					System.out.print("\nEnter Feet ");
					int feet=as.nextInt();
					
					int inches=feet*12;
					
					System.out.println("Inches will be: "+inches);
				}
				//(== Feet to Inches End ==)
				
				//(== Inches to Feet Start ==)
					if(uc==2){
					System.out.print("\nEnter Inches ");
					int inches1=as.nextInt();
					
					int feet1=inches1/12;
					
					System.out.println("Feet will be: "+feet1);
				}
				//(== Inches to Feet End ==)
				
				//(== Kilo to Gram Start ==)
				if(uc==3){
					System.out.print("\nEnter Kilo ");
					int kilo=as.nextInt();
					
					int gram=kilo*1000;
					
					System.out.println("Gram will be: "+gram);
				}
				//(== Kilo To gram End ==)
				
				//(== Gram To Kilo Start ==)
				if(uc==4){
					System.out.print("\nEnter Gram ");
					int gram1=as.nextInt();
					
					int kilo1=gram1/1000;
					
					System.out.println("Kilo will be: "+kilo1);
				}
				//(== Gram To Kilo End ==)
				
				//(== Year To Day Start ==)
				if(uc==5){
					System.out.print("\nEnter Years ");
					int years=as.nextInt();
					
					int Days=years*365;
					
					System.out.println("Days will be: "+Days);
				}
				//(== Years To Days End ==)
				
				//(== Days To years Start ==)
				if(uc==6){
					System.out.print("\nEnter Days ");
					int days1=as.nextInt();
					
					int years1=days1/365;
					
					System.out.println("Years will be: "+years1);
				}
				//(== Days To years End ==)
				
				if(uc==7){break;}
			}
			//(==2.unit convertor End==)
			
			//(==3.Season Start ==)
			if(mini==3){
				
		      System.out.print("Enter Season No ");
    		int Month=as.nextInt();
		
    		String season;
		
    		switch(Month){
    			case 11:
    			case 12:
	    		case 1:
		    	season = "Season is Winter";break;
    			case 2:
    			case 3:
    			case 4:
    			season = "Season is Spring";break;
    			case 5:
    			case 6:
    			case 7:
    			season = "Season is Summer";break;
    			case 8:
    			case 9:
    			case 10:
    			season = "Season is Autumn";break;
    			default:
    			season = "Invalid Month";
    		}
    		System.out.println(season);
		
			}
			//(==3.Season End ==)
			
			//(== 4.Alphabetic palay land Start ==)
			if(mini==4){
				System.out.print("Enter Alphabet ");
				String alphabet=as.next();
				
				switch(alphabet){
			case "A": 
			case "a": System.out.print("apple");break;
			case "B":
			case "b": System.out.print("boll");break;
			case "C":
			case "c": System.out.print("cup");break;
			case "D":
			case "d": System.out.print("dog");break;
			case "E":
			case "e": System.out.print("egg");break;
			case "F":
			case "f": System.out.print("Fogg");break;
			case "G":
			case "g": System.out.print("google");break;
			case "H":
			case "h": System.out.print("Houre");break;
			case "I":
			case "i": System.out.print("Ice-cream");break;
			case "J":
			case "j": System.out.print("Juice");break;
			case "K":
			case "k": System.out.print("Kangaroo");break;
			case "L":
			case "l": System.out.print("lion");break;
			case "M":
			case "m": System.out.print("Mouse");break;
			case "N":
			case "n": System.out.print("Nurse");break;
			case "O":
			case "o": System.out.print("Orange");break;
			case "P":
			case "p": System.out.print("Parrot");break;
			case "Q": 
			case "q": System.out.print("Queen");break;
			case "R":
			case "r": System.out.print("Rainbow");break;
			case "S":
			case "s": System.out.print("Spider");break;
			case "T":
			case "t": System.out.print("Tree");break;
			case "U":
			case "u": System.out.print("Umbrella");break;
			case "V":
			case "v": System.out.print("Van");break;
			case "W":
			case "w": System.out.print("Whale");break;
			case "X":
			case "x": System.out.print("X-ray");break;
			case "Y": 
			case "y": System.out.print("Yankee");break;
			case "Z":
			case "z": System.out.print("Zoo");break;
			default: System.out.print("Invalid Alphabet");
		}
			}
			//(== 4.Alphabetic palay land End ==)
			
			//(== 5.Atm Start ==)
			if(mini==5){
				   System.out.print("\nEnter the Rupees  ");
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
			//(== 5.Atm End  ==)
			
			
			//(== 6.Employ Salary Calculation Start ==)
			if(mini==6){
				 System.out.print("\nEnter Employees Basic Salary ");
		   int em=as.nextInt();
		   
		   int house=em*45/100;
		   int medical=em*15/100;
		   int bonns=em*5/100;
		   int grosspay=em+house+medical+bonns;
		   int incometax=em*3/100;
		   double zukawat=em*2.5/100;
		   int convance=em*8/100;
		   
		   System.out.print("\nHouse Rent 45%       : "+house+"\nMedical Allowance 15%: "+medical+"\nBonns 5%             : "+bonns+"\nGross Pay            : "+grosspay+"\nIncome Tax 3%        : "+incometax+"\nZukawak 2.5%         : "+zukawat+"\nConvance Allowace 8% : "+convance);
		   
			}
			//(== 6.Employ Salary Calculation End ==)
			
			//(== Hesco Bill  Calculator Start ==)
			if(mini==7){
				System.out.print("Enter Units bill ");
		int unit=as.nextInt();
		
		if(unit>=1 && unit<=100){
			int a=unit*2;
			System.out.print("Charges :"+a);
		}
		
		if(unit>100 && unit<=200){
			int a=100*2;
			int b=(unit-100)*4;
			System.out.print("\n100*2="+a);
			System.out.print("\n");
			System.out.print((unit-100)+"*4="+b);
			System.out.print("\nTotal Rs:"+(a+b));
		}
		if(unit>200 &&  unit<=300){
			int a=100*2;
			int b=100*4;
			int c=(unit-200)*6;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n");
			System.out.print((unit-200)+"*6="+c);
			System.out.print("\nTotal Rs: "+(a+b+c));
			
		}
		if(unit>300 && unit<=400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=(unit-300)*8;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n");
			System.out.print((unit-300)+"*8="+d);
			System.out.print("\nTotal Rs: "+(a+b+c+d));
		}
		if(unit>400){
			int a=100*2;
			int b=100*4;
			int c=100*6;
			int d=100*8;
			int e=(unit-400)*10;
			System.out.print("100*2="+a);
			System.out.print("\n100*4="+b);
			System.out.print("\n100*6="+c);
			System.out.print("\n100*8="+d);
			System.out.print("\n");
			System.out.print((unit-400)+"*10="+e);
			System.out.print("\nTotal Rs: "+(a+b+c+d+e));
		}
			}
			//(== Hesco Bill  Calculator End ==)
			
			
			//(== Transport (Troly Loa ) Start ==)
			if(mini==8){
				 System.out.print("\nEnter Troly load ");
		   int bill=as.nextInt();
		   
		   
		   int Totalincome=bill*800;
		   int Driver=bill*150;
		   int Tax=Totalincome*10/100;
		   int Disel=bill*210;
		   int Profit=Totalincome-(Driver+Tax+Disel);
		   
		   System.out.print("\nTotal Income: "+Totalincome+"\nDriver      : "+Driver+"\nTax 10%     : "+Tax+"\nDisel       : "+Disel+"\nProfit      : "+Profit);
		   
			}
			//(== Transport (Troly Loa ) End ==)
			
			//(== Age Comparator Start ==)
			if(mini==9){
				 System.out.print("\nEnter 1st age ");
		   int age=as.nextInt();
		   
		   System.out.print("Enter 2nd age ");
		   int age2=as.nextInt();
		   
		   if(age>age2)
			   System.out.print("\n1st age is greater");
		   if(age2>age)
			   System.out.print("\n2nt age is greater");
			}
			//(== Age Comparator End ==)
			
			//(== 10.Loop Series Start ==)
			while(mini==10){
				System.out.println("\nLoop Serici ");
				System.out.println("1.Even No . Series\n2.Odd NO Series\n3.sqr/cub Series\n4.Table Series\n5.Factorial Series\n6.Fibonaicii Series\n7.prime No Series\n8.Star Series/Unknown Series\n9.Back\n");
				System.out.println("Enter Selection ");
				int ls=as.nextInt();
				
				//(== 1.Even Series Start ==)
				if(ls==1){
					System.out.print("Enter any No ");
		int num=as.nextInt();
		
		for(int k=2; k<=num; k+=2){
			
			System.out.print("\n"+k);
					
				}
				}
				//(== 1.Even Series End ==)
				
				//(== 2.Odd NO Start ==)
				if(ls==2){
					System.out.print("Enter any No ");
		int num=as.nextInt();
		
		for(int k=1; k<=num; k+=2){
			
			System.out.print("\n"+k);
				}
				}
				//(== 2.Odd NO End ==)
				
    			//(== 3.sgr / cube Start ==)
    			if(ls==3){
					System.out.print("Enter any No  ");
		int num=as.nextInt();
		
		System.out.print("Num\tsqr\tcube\n");
		
		for(int a=1; a<=num; a++){
			
			System.out.println((a)+"\t"+(a*a)+"\t"+(a*a*a));
				}
				}
    			//(== 3.sgr / cube End ==)
				
				//(== 4.Table Series Strat ==)
				if(ls==4){
					System.out.print("Enter Table no ");
		int t=as.nextInt();
		
		
		System.out.print("Enter Counter No ");
		int c=as.nextInt();
		
		for(int a=1; a<=c; a++){
			System.out.println(t+" X "+a+" = "+(a*t));
				}
				}
				//(== 4.Table Series End ==)
				
				
				//(== 5.Factorial Series Start ==)
				if(ls==5){
					System.out.print("Enter Any No ");
            		int a=as.nextInt();
		
            		int str=1;
            		for(int i=1; i<=a; i++){
				
          			str= str*i;
		
            		System.out.println(str);
            		}
				}
				//(== 5.Factorial Series End ==)
				
				//(== 6.Fibonaicii Series Start ==)
				if(ls==6){
					System.out.print("Enter Any No ");
            		int num=as.nextInt();
		
            	    int a=0, b=1;
		
            		int c;
            		for(int i=1;  i<=num; i++){
			
	        		c=a+b;
			
            		System.out.println(""+c);	
        			a=b;
	        		b=c;
		
            		}
        		}
				//(== 6.Fibonaicii Series End ==)
				
				//(== 7.Prime NO Series Start ==)
				if(ls==7){
					System.out.print("Enter Any No ");
            		int num=as.nextInt();
		
		
		
            		for(int i=1; i<=num; i++){
        			int counter=0;
			
        		    	for(int k=2; k<=i-1; k++){
				
     		    		if(i%k==0){
		    			counter=counter+1;
        				}
						
            			}
				
            				if(counter==0)
        					System.out.println(i);
				
            		}
				}
				//(== 7.Prime NO Series End  ==)
				
				//(== 8.Star Series /Unknown Serres  ==)
				while(ls==8){
					System.out.println("\n1.Star\n2.Star\n3.Star\n4.unknown Series\n5.unknown\n6.Alphabetic Series\n7.Name Series\n8.Reverse Name Series\n9.Multiplication Table\n10.Star in Mutiplication Table\n11.Back\n");
					System.out.print("Enter Selection ");
					int su=as.nextInt();
					
					//(== 1.Star Start ==)
					if(su==1){
						System.out.print("\nEnter the Number ");
						int sr=as.nextInt();
						
				    		String str="";
		
            		for(int i=1; i<=sr; i++){
			
	            		str+="*";
    	        		System.out.println(str);
    		}
					}
					//(== 1.Star End ==)
					
					
					//(== 2.Str Start ==)
					if(su==2){
						
				    	System.out.print("Enter any No ");
                 		int a=as.nextInt();
		
                		for(int i=1; i<=a; i++){
			
             			for(int k=5; k>=i; k--){
        				System.out.print("*");
            			}
             			System.out.println();
                		}
					}
					//(== 2.Str End ==)
					
					
					//(== 3.Star Start ==)
					if(su==3){
						System.out.print("Enter Rous ");
                		int ro=as.nextInt();
		
                		System.out.print("Enter Columns ");
                		int co=as.nextInt();
		
                		for(int i=1; i<=ro; i++){
			
	             		for(int k=1; k<=co; k++){
				
	               			System.out.print("*");
            			}
                 			System.out.println();
                		}
					}
					//(== 3.Star End ==)
					
					
					//(== 4.Unknown Series Start ==)
					if(su==4){
						System.out.print("Enter No ");
                		int num=as.nextInt();
		
                	    int a=0, b=0;
		
	
                		System.out.print(a+"\n");
		
                		for(int i=0; i<=num; i++){
			
             			a=a+3+b;
             			b=b+2;
				
             			System.out.println(""+a);
            			}
		

					}
					//(== 4.Unknown Series End ==)
					
					
					//(== 5.Unknown Series Start ==)
					if(su==5){
						System.out.print("Enter No ");
                		int num=as.nextInt();
		
                	    int a=2,b=0;
		
	
                		System.out.print(a+"\n");
		
                		for(int i=1; i<=num; i++){
	            		 a=a+3+b;
	            		 b=b+2;	
	            		 System.out.println(""+a);
			 
			
                		}
					}
					//(== 5.Unknown Series End ==)
					
					
					//(== 6.Alphabetic Series Start ==)
					if(su==6){
						System.out.print("\nEnter Alphabetic letter ");
						char letter=as.next().charAt(0);
						
						for(int i=0; i<=letter-65; i++){
							
							for(char ch1=65; ch1<=letter-i; ch1++){
								System.out.print(ch1);
							}
							System.out.println();
						}
					}
					//(== 6.Alphabetic Series End ==)
					
					
					//(== 7.Name Series Start ==)
					if(su==7){
						System.out.print("Enter the Name ");
                 		String name=as.next();
		
		
                		int leng=name.length();
		
                		String str=" ";
		
		
                		for(int i=leng-1; i>=0; i--){
			
	                		for(int k=0; k<=i; k++){
				
                 				str=str+name.charAt(k);
                				System.out.print(k);
				
			
				
                 			}
                		System.out.println();		
                		}
					}
					//(== 7.Name Series End ==)
					
					
					//(==8.Reverse Name Start ==)
					if(su==8){
						System.out.print("Enter the reverse Name ");
	
                		String name=as.next();
		
                		int leng=name.length();
		
                		String rev="";
		
		
                		for(int i=leng-1; i>=0; i--){
			
                			rev=rev+name.charAt(i);
			
			
	
                		}
                		System.out.println(rev);
					}
					//(==8.Reverse Name End ==)
					
					
					//(== 9.Mulitiplication Table Start ==)
					if(su==9){
						
            	    	System.out.print("Enter Any No ");
                		int a=as.nextInt();
		
                		String str="";
		
                		for(int i=0; i<=a; i++){
			
                			str=i+"  "+(i+i)+"  "+(i+i+i);
			
                 			System.out.println(str);
                			if(i%20==0){
				
             				System.out.println("Press Enter key to countiness ");
                			String	c=as.nextLine();
                			}
			
                 		}
		
					}
					//(== 9.Mulitiplication Table End ==)
					
					
					//(== 10.Stars in Multiplication Table Start ==)
					if(su==10){
						System.out.print("Enter last Table No ");
                		int a=as.nextInt();
                 		System.out.print("Enter Counter No ");
                		int b=as.nextInt();
		
                		for(int i=2; i<=a; i++){
                			System.out.println("Table: "+i );
                			for(int k=1; k<=b; k++){
                				System.out.println(i+" X "+k+" = "+(i*k));
                			}
                		}
					}
					//(== 10.Stars in Multiplication Table End ==)
					
					
					//(== 11.Back Start ==)
					if(su==11){break;}
					//(== 11.Back End ==)
					
					
				}
				//(== 8.Star Series /Unknown Series End ==)
				
				
				//(== 9.Back Start ==)
				if(ls==9){break;}
				//(== 9.Back End ==)
				
				
				
				
			}
			//(== 10.Loop Series End ==)
			
			if(mini==11){
				System.out.println("\nName         : Faizan Hussain");
				System.out.println("SurName       : J---");
				System.out.println("Contact Number: 03144124925 ");
				System.out.println("Email         : --------  ");
				System.out.println("Address       : --------  ");
			}
			 
		
			//(==12.Exit Start ==)
			if(mini==12){
				System.exit(0);
		}
		//(==12.Exit End ==)
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}