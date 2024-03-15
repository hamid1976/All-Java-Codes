import java.util.*;

class Oop2{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		Calculator cc=new Calculator();
		Calculatoroperater cc1=new Calculatoroperater();
		Unitconvertor cc2=new Unitconvertor();
		Season cc3=new Season();
		Alphabet cc4=new Alphabet();
		Atm cc5=new Atm();
		Employ cc6=new Employ();
		Hesco cc7=new Hesco();
		Transport cc8=new Transport();
		Age cc9=new Age();
		Loop cc10=new Loop();
		About cc11=new About();
		
		char ch='y';
		
		//(== Main menu Start==)
		while(ch=='y' || ch=='Y'){
        		
		System.out.print("\n\n main menu\n1.Calculator\n2.unit Convertor\n3.Season\n4.Alphabetic Play Land\n5.Atm\n6.Employ Salary Calculator\n7.Hesco Bill Calculator\n8.Transport.(Troly Load)\n9.Age comparator\n10.Loop Series\n11.About Developer\n12.Exit\n");
		System.out.print("\nEnter Selection ");
		int mini=as.nextInt();
		
		
		 //(==1.Calculator Start ==)
		while(mini==1){
			
			System.out.println("\n\n   Calculator");
			System.out.print("1.Calculator(menu)\n2.Calculator(Operater)\n3.back\n\nEnter Selection ");
			int cl=as.nextInt();
			
			
			//(== 1.Calculation(menu) Start ==)
			while(cl==1){
				System.out.println("\n\n  Calculator(menu)");
				System.out.print("1.Addition\n2.subtraction\n3.Multiplication\n4.Divisor\n5.Remainder\n6.Back\n\nEnter Selection ");
				int menu=as.nextInt();
				
			//	System.out.print("Enter Two Value ");
				
				switch(menu){
					case 1:System.out.print("Enter Two Value ");
					int add1=as.nextInt();
					int add2=as.nextInt();
					
					cc.add(add1,add2);break;
					 case 2:System.out.print("Enter Two Value ");
					int sub1=as.nextInt();
					int sub2=as.nextInt();
					
					cc.sub(sub1,sub2);break;
					 case 3:System.out.print("Enter Two Value ");
					int mul1=as.nextInt();
					int mul2=as.nextInt();
					 
					 cc.mul(mul1,mul2);break;
					 case 4:System.out.print("Enter Two Value ");
					int div1=as.nextInt();
					int div2=as.nextInt();
					 
					 cc.div(div1,div2);break;
					 case 5:System.out.print("Enter Two Value ");
					int rem1=as.nextInt();
					int rem2=as.nextInt();
					 
					 cc.rem(rem1,rem2);break;
					default:System.out.print("Invalid Calculation ");
				}
				if(menu==6){break;}
				
				
			}//(== 1.Calculation(menu) End ==)
			
			//(== 2.Calculator(Operater) Start==)
			if(cl==2){
			System.out.print("Enter Any No ");
			int op15=as.nextInt();
			int op16=as.nextInt();
			System.out.print("Enter Operater");
			String op17=as.next();
			cc1.operater(op17,op15,op16);}
			//(== Calculator(Operater) End==)	
			
			//(==3.Back Start ==)
			if(cl==3){break;}
			//(==3.Back End ==)
			
			
		} //(==1.Calculator End ==)
		
		//(==2.unit convertor Start==)
			while(mini==2){
				System.out.println("\nUnit convertor");
				System.out.println("1.Feet To Inches\n2.Inches To Feet\n3.Kilo To Gram\n4.Gram To Kilo\n5.Year To Days\n6.Day To Year\n7.Back\n");
				System.out.print("Enter Selection ");
				int uc=as.nextInt();
				
				switch(uc){
					case 1:System.out.print("\nEnter Feet ");
					int feet=as.nextInt();
					
					cc2.unit1(feet);break;
					case 2:	System.out.print("\nEnter Inches ");
					int inches1=as.nextInt();
					
					cc2.unit2(inches1);break;
					case 3:System.out.print("\nEnter Kilo ");
					int kilo=as.nextInt();
					
					cc2.unit3(kilo);break;
					case 4:System.out.print("\nEnter Gram ");
					int gram1=as.nextInt();
					
					cc2.unit4(gram1);break;
					case 5:System.out.print("\nEnter Years ");
					int years=as.nextInt();
					
					cc2.unit5(years);break;
					case 6:System.out.print("\nEnter Days ");
					int days1=as.nextInt();
					
					cc2.unit6(days1);break;
					default:System.out.print("Invalid Unit Convertor");
				}
				
				if(uc==7){break;}
				
				
			}//(==2.unit convertor End==)
			
			//(== 3.Season Start ==)
			
			if(mini==3){
				System.out.print("Enter Month NO ");
				int month1=as.nextInt();
				
				cc3.month(month1);}
			//(== 3.Season End ==)
			
			//(== 4.Alphabetic Start ==)
			
			if(mini==4){
				System.out.print("Enter Alphabet ");
				String alphabet=as.next();
				
				cc4.play(alphabet);}
			//(== 4.Alphabetic End ==)
			
			//(== 5.Atm Start==)
			if(mini==5){
		    System.out.print("\nEnter the Rupees  ");
	        int a=as.nextInt();
				
				cc5.rupees(a);}
			//(== 5.Atm End==)
			
			//(== 6.Employ Start==)
			if(mini==6){
		   System.out.print("\nEnter Employees Basic Salary ");
		   int em=as.nextInt();
				
				cc6.salary(em);}
			//(== 6.Employ End==)
			
			//(==7.Hesco bill Start==)
			if(mini==7){
			System.out.print("Enter Units bill ");
	    	int unit=as.nextInt();
				
				cc7.bill(unit);}
			//(==7.Hesco bill End==)
			
			//(== 8.Transport Start ==)
			if(mini==8){
			System.out.print("\nEnter Troly load ");
		   int bill=as.nextInt();
				
				cc8.troly(bill);}
			//(== 8.Transport End ==)
			
			//(== Age Start ==)
			if(mini==9){
			System.out.print("\nEnter 1st age ");
		   int age=as.nextInt();
		   
		    System.out.print("Enter 2nd age ");
		   int age2=as.nextInt();
				
				cc9.age1(age,age2);}
			//(== Age End ==)
			
			//(==10.Loop Start==)
			while(mini==10){
				System.out.println("\nLoop Serici ");
				System.out.println("1.Even No . Series\n2.Odd NO Series\n3.sqr/cub Series\n4.Table Series\n5.Factorial Series\n6.Fibonaicii Series\n7.prime No Series\n8.Back");
				System.out.println("Enter Selection ");
				int ls=as.nextInt();
				
				switch(ls){
					case 1: System.out.print("Enter any No ");
							int num=as.nextInt();
							cc10.even(num);
					break;
					case 2:System.out.print("Enter any No ");
						int num2=as.nextInt();
						cc10.odd(num2);
					break;
					case 3: System.out.print("Enter any No  ");
							int num3=as.nextInt();
						    cc10.sqr(num3);
					break;
					case 4: System.out.print("Enter Table no ");
							int t=as.nextInt();
		
							System.out.print("Enter Counter No ");
							int c=as.nextInt();
					
					cc10.table(t, c);
					break;
					case 5:System.out.print("Enter Any No ");
            		       int a=as.nextInt();
					
						   cc10.factorial(a);
					break;
					case 6:System.out.print("Enter Any No ");
            		       int num4=as.nextInt();
					
					       cc10.fibonaicii(num4);
					break;
					case 7:	System.out.print("Enter Any No ");
            		        int num5=as.nextInt();
					
							cc10.prime(num5);
					break;
				}
				if(ls==8){break;}
				
				
				
			}//(==10.Loop End==)
			
			//(== 11.About Start==)
			if(mini==11){cc11.developer();}
			//(== 11.About End==)
			
			if(mini==12){
				System.exit(0);
			}
			
		
		
		
		
		}//(== Main menu Start==)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


class Calculator{
	
	void add(int a, int b){
		
		System.out.print("Addition is: "+(a+b));
	}
	
	void sub(int a, int b){
		
		System.out.print("Subtraction is: "+(a-b));
	}
	
	void mul(int a, int b){
		
		System.out.print("Multiplication is: "+a*b);
	}
	
	void div(int a, int b){
		
		System.out.print("Divisor is: "+a/b);
	}
	
	void rem(int a, int b){
	
		System.out.print("Remainder is: "+a%b);
	}
	
	

	
}

class Calculatoroperater{
	
	void operater(String op3, int a, int b){
		
				
				 switch(op3){
					case "+":System.out.print("Addition is: "+(a+b));break;
					case "-":System.out.print("Subtration is: "+(a-b));break;
					case "x":
					case "X":
					case "*":System.out.print("Multiplication is: "+(a*b));break;
					case "\\":
					case "/":System.out.print("Divison is: "+(a/b));break;
					case "%":System.out.print("Remainder is: "+(a%b));break;
					default:System.out.print("Invalid Calculater ");
				}
				
	}
	
	
}

class Unitconvertor{
	
	void unit1(int feet){

		
		//(== Feet to Inches Start ==)
				
					
					
					int inches=feet*12;
					
					System.out.println("Inches will be: "+inches);
				
				//(== Feet to Inches End ==)
				
				
	}
	
	void unit2(int inches1){
		
		//(== Inches to Feet Start ==)
				
				
					
					int feet1=inches1/12;
					
					System.out.println("Feet will be: "+feet1);
				
				//(== Inches to Feet End ==)
				
			
	}
	
	void unit3(int kilo){
		
			//(== Kilo to Gram Start ==)
			
					
					
					int gram=kilo*1000;
					
					System.out.println("Gram will be: "+gram);
				
				//(== Kilo To gram End ==)
				
				
		
	}
	
	void unit4(int gram1){
		
		
		//(== Gram To Kilo Start ==)
				
					
					
					int kilo1=gram1/1000;
					
					System.out.println("Kilo will be: "+kilo1);
				
				//(== Gram To Kilo End ==)
				
				
	}
	
	void unit5(int years){
		
		//(== Year To Day Start ==)
				
					
					
					int Days=years*365;
					
					System.out.println("Days will be: "+Days);
				
				//(== Years To Days End ==)
				
	}
	
	void unit6(int days1){
		
		
				//(== Days To years Start ==)
		
			
					
					int years1=days1/365;
					
					System.out.println("Years will be: "+years1);
				
				//(== Days To years End ==)
	}
}

class Season{
	
	void month(int Month){
		// Scanner as=new Scanner(System.in);
		
		   // System.out.print("Enter Season No ");
    		// int Month=as.nextInt();
		
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
}

class Alphabet{
	
	void play(String alphabet){
		// Scanner as=new Scanner(System.in);
		
		//(== 4.Alphabetic palay land Start ==)
			
				
				
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
}

class Atm{
	
	void rupees(int a){
		// Scanner as=new Scanner(System.in);
		
			//(== 5.Atm Start ==)
			
		
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
			
			//(== 5.Atm End  ==)
	}
}

class Employ{
	
	void salary(int em){
	//	Scanner as=new Scanner(System.in);
		
			//(== 6.Employ Salary Calculation Start ==)
			
			
		   
		   int house=em*45/100;
		   int medical=em*15/100;
		   int bonns=em*5/100;
		   int grosspay=em+house+medical+bonns;
		   int incometax=em*3/100;
		   double zukawat=em*2.5/100;
		   int convance=em*8/100;
		   
		   System.out.print("\nHouse Rent 45%       : "+house+"\nMedical Allowance 15%: "+medical+"\nBonns 5%             : "+bonns+"\nGross Pay            : "+grosspay+"\nIncome Tax 3%        : "+incometax+"\nZukawak 2.5%         : "+zukawat+"\nConvance Allowace 8% : "+convance);
		   
			
			//(== 6.Employ Salary Calculation End ==)
	}
}

class Hesco{
	
	void bill(int unit){
	//	Scanner as=new Scanner(System.in);
		
			//(== Hesco Bill  Calculator Start ==)
			
		
		
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
			
			//(== Hesco Bill  Calculator End ==)
	}
}

class Transport{
	
	void troly(int bill){
	//	Scanner as=new Scanner(System.in);
		
		//(== Transport (Troly Loa ) Start ==)
			

		   
		   
		   int Totalincome=bill*800;
		   int Driver=bill*150;
		   int Tax=Totalincome*10/100;
		   int Disel=bill*210;
		   int Profit=Totalincome-(Driver+Tax+Disel);
		   
		   System.out.print("\nTotal Income: "+Totalincome+"\nDriver      : "+Driver+"\nTax 10%     : "+Tax+"\nDisel       : "+Disel+"\nProfit      : "+Profit);
		   
			
			//(== Transport (Troly Loa ) End ==)
	}
}

class Age{
	
	void age1(int age, int age2){
	//	Scanner as=new Scanner(System.in);
		
			//(== Age Comparator Start ==)
			
		
		   
		  
		   
		   if(age>age2)
			   System.out.print("\n1st age is greater");
		   if(age2>age)
			   System.out.print("\n2nt age is greater");
			
			//(== Age Comparator End ==)
			
		
	}
}

class Loop{
	
	void even(int num){
	//	Scanner as=new Scanner(System.in);
		
			//(== 1.Even Series Start ==)
				
		
		
		for(int k=2; k<=num; k+=2){
			
			System.out.print("\n"+k);
					
				}
				
				//(== 1.Even Series End ==)
	}
	
	void odd(int num){
	//	Scanner as=new Scanner(System.in);
		
			//(== 2.Odd NO Start ==)
				
		
		
		for(int k=1; k<=num; k+=2){
			
			System.out.print("\n"+k);
				}
				
				//(== 2.Odd NO End ==)
	}
	
	void sqr(int num){
	//	Scanner as=new Scanner(System.in);
		
		//(== 3.sgr / cube Start ==)
    			
		
		
		System.out.print("Num\tsqr\tcube\n");
		
		for(int a=1; a<=num; a++){
			
			System.out.println((a)+"\t"+(a*a)+"\t"+(a*a*a));
				}
				
    			//(== 3.sgr / cube End ==)
	}
	
	void table(int t, int c){
	//	Scanner as=new Scanner(System.in);
		
		//(== 4.Table Series Strat ==)
				
		
		
		for(int a=1; a<=c; a++){
			System.out.println(t+" X "+a+" = "+(a*t));
				}
				
				//(== 4.Table Series End ==)
	}
	
	void factorial(int a){
	//	Scanner as=new Scanner(System.in);
		
			//(== 5.Factorial Series Start ==)
				
					
		
            		int str=1;
            		for(int i=1; i<=a; i++){
				
          			str= str*i;
		
            		System.out.println(str);
            		}
				
				//(== 5.Factorial Series End ==)
	}
	
	void fibonaicii(int num){
	//	Scanner as=new Scanner(System.in);
		
			//(== 6.Fibonaicii Series Start ==)
				
					
		
            	    int a=0, b=1;
		
            		int c;
            		for(int i=1;  i<=num; i++){
			
	        		c=a+b;
			
            		System.out.println(""+c);	
        			a=b;
	        		b=c;
		
            		}
        		
				//(== 6.Fibonaicii Series End ==)
	}
	
	void prime(int num){
	//	Scanner as=new Scanner(System.in);
		
		//(== 7.Prime NO Series Start ==)
				
				
		
		
		
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
				
				//(== 7.Prime NO Series End  ==)
		
		
	}
	
	
}

class About{
	
	void developer(){
		Scanner as=new Scanner(System.in);
		
		
			
			
				System.out.println("\nName         : Faizan Hussain");
				System.out.println("SurName       : J---");
				System.out.println("Contact Number: 03144124925 ");
				System.out.println("Email         : --------  ");
				System.out.println("Address       : --------  ");
			
			 
	}
}

	
	
	




























