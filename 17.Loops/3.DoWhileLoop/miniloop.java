import java.util.*;
class miniloop{
	public static void main(String arg []){
      Scanner ob = new Scanner (System.in);
	   int  x,n,a,b,c,z,sel;	    
	  char ch;
	  int i=1;
	  while(i>=5){
	        System.out.println("1. calculator \n2. unit convert \n3. Trolyload \n4. Emplowee BasicPay \n5. Positive or Negative \n6. Age Comparator \n7. Even or Odd \n8. HESCO \n9. ATM\n10.LOOP Series \n11.About software Engineer  \n13.Exit");	  
		    System.out.print("enter Selection  ");		
			z = ob.nextInt();
			
			if(z==1){
				System.out.println("1.Calculat manu \n2.calculator Operator \n3back ");
	do{
	System.out.print("Enter Selection ");
	sel=ob.nextInt();
	if(sel==1){
		    do{//cal while start
			System.out.println("Calculator menu ");
						 
                           
      System.out.println("1.Addition :");
	  System.out.println("2.Subtraction :");
	  System.out.println("3.Multiplication :");
	  System.out.println("4.Division :");
	  System.out.println("5.Remender :");
	  
	  System.out.print("Enter Selection:");
		 a = ob.nextInt();
	  
	  if(a==1){
		  do{
		              System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	          c = ob.nextInt();
	                  System.out.println("Addition :"+(b+c));
					    System.out.print("do you again Addition Y/n ");
	  ch=ob.next().charAt(0);
		  }
	  while(ch=='y'||ch=='Y');
	  }
	  if(a==2){
		  do{
		              System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	           c = ob.nextInt();
                      System.out.println("Subtraction :"+(b-c));
					    System.out.print("do you again subtraction Y/n  ");
	  ch=ob.next().charAt(0);
		  }
	  while(ch=='y'||ch=='Y');
	
	  }
	  if(a==3){
		  do{
		               System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                   System.out.print("Enter var2 :");
	           c = ob.nextInt();
	                   System.out.println("Multiplication:"+(b*c));
					     System.out.print("do you again multiply Y/n  ");
	  ch=ob.next().charAt(0);
		  }
	  while(ch=='y'||ch=='Y');
	
	  }
	  if(a==4){
		  do{
		                System.out.print("Enter var1 :");
		      b = ob.nextInt();
	                    System.out.print("Enter var2 :");
	          c = ob.nextInt();
		  System.out.println("Division :"+(b/c));
						  System.out.print("do you again divide Y/N ");
	  ch=ob.next().charAt(0);
		  }
	  while(ch=='y'||ch=='Y');
	  }
	    
      if(a==5){
		  do{
				System.out.print("Enter var1 :");
			    b = ob.nextInt();
				System.out.print("Enter var2 :");
			    c = ob.nextInt();
				System.out.println("Remainder :"+(b%c));
				System.out.println("do you again remender Y/N ");
			    ch=ob.next().charAt(0);
				  }
			  while(ch=='y'||ch=='Y');
			  }
				System.out.print("do you again manu Cal   ");
			  ch=ob.next().charAt(0);
				  }
			  while(ch=='y'||ch=='Y');
			  }
			  else if(sel==2){
				  do{
				System.out.print("Enter Operater :");
				String Airthmatic = ob.next();
				
				char s=Airthmatic.charAt(0);
				
				System.out.print("Enter num :");
				 b = ob.nextInt();
				System.out.print("Enter num :");
				 a = ob.nextInt();
				if(s=='+')
					   System.out.println("Addition :"+(a+b));
				else	if(s=='-')
					   System.out.println("Subtraction :"+(a-b));
				else	if(s=='X'||s=='x'||s=='*')
					   System.out.println("Multiplication :"+(a*b));
				else    if(s=='/')
					   System.out.println("Division :"+(a/b));
				else    if(s=='%')
					   System.out.println("Remmender :"+(a%b));
				else 
					   System.out.println("Invalid  Operator");
				System.out.print("do you want to do more Calculat Airthmatic Y/n  ");
				ch=ob.next().charAt(0);
				}
				while(ch=='y'||ch=='Y');
			  }
			  else
					break;
		  
			  System.out.print("do you again Calculate manu  ");
			  ch=ob.next().charAt(0);
			   System.out.print("\n \n");
		  }//ending 
	  while(ch=='y'||ch=='Y');
		  
	}//if 1 ending
	if(z==2){
		do{ //start 2
				System.out.println("1.feet to Inch  \n2.inch to feet \n3.kilo to gram\n4.Gram to Kilo \n5days to year\n6year to days \n7back");
				System.out.print("Enter Selection ");
				sel=ob.nextInt();
				if(sel==1){
				
				System.out.print("Enter Feet ");
				int Feet = ob.nextInt();
				int Inch = (Feet*12);
				System.out.println("Inch :"+Inch);
				
				}else  if(sel==2){
					System.out.print("Enter inch ");
					int inch = ob.nextInt();
					int feet = (inch/12);
					System.out.println("feet :"+feet);}
			else   if(sel==3){
				   System.out.println("Enter Kilogram ");
				int Kilogram = ob.nextInt();
				int Gram = (Kilogram*1000);
				System.out.println("Gram :"+Gram);
			   }
			 else  if(sel==4){System.out.print("Enter Grams ");
				
				int Grams = ob.nextInt();
				int kilo = Grams/1000;
			   System.out.println("kilo :"+kilo);
			   }
			   else if(sel==5){
				   System.out.print("Enter Days ");
				int Days = ob.nextInt();
				int year = Days/365;
				
				System.out.println("Year :"+year);
			   }
			   else if(sel==6){
				   System.out.print("Enter years ");
				int Years = ob.nextInt();
				int Day = Years*365;
				
				System.out.println("Days :"+Day);
			   }
			   else
					break;
		  System.out.print("do you again marksheet ");
			  ch=ob.next().charAt(0);
		  } //2 ending
	  while(ch=='y'||ch=='Y');
	}
	if(z==3){//3rd if
		do{ //3rd start
        System.out.println("Trolyload");
		System.out.print("Enter Trolyload :");
		 x = ob.nextInt();
		
		int total =800*x;
		System.out.println(" Total :"+total); 
		
		int driver = 150*x;
		System.out.println("Driver :"+driver);
		
		int tax = 80*x;
		System.out.println("Tax 10%:"+tax);
		
		int disel =210*x;
		System.out.println("Disel  :"+disel);
		
		int Profit = total-(driver +disel+tax); 
		System.out.println("Profit :" + Profit);
		  System.out.print("do you again trolyload");
	  ch=ob.next().charAt(0);
		  }//3rd ending
	  while(ch=='y'||ch=='Y'); 
	}//3rd if ending
 if(z==4){ //4th if
	 do{ //4th start
     System.out.println("Emplowee Basic Pay");
	 
		System.out.print("Enter Employee basic pay");
	
		int EmploweeBasicPay = ob.nextInt();
		int HouseRent = (EmploweeBasicPay*45/100);
		
		int MedicalAllowance = (EmploweeBasicPay*15/100);
        
		int Bonus = (EmploweeBasicPay*5/100);
		
		int GrossPay = (EmploweeBasicPay+HouseRent+MedicalAllowance+Bonus);
		
		int CanvanceAllowance =(EmploweeBasicPay*8/100);
		
		double Zakwat = EmploweeBasicPay*2.5/100;
		
		int IncomTax = (EmploweeBasicPay*5/100);
		
		double NetIncom = GrossPay-(CanvanceAllowance+Zakwat+IncomTax);
System.out.println(" House Rent :"+HouseRent
		          +"\n Medical Allowance :"+MedicalAllowance
		          +"\n Bonus :"+Bonus
		          +"\n Gross pay :"+GrossPay
+"\n Canvance Allowance :"+CanvanceAllowance
		          +"\n Zakwat :"  +Zakwat
				  +"\n IncomTax :" + IncomTax
				  +"\n Net Incom :" +NetIncom);
				    System.out.print("do you again Emplowee basic pay");
	  ch=ob.next().charAt(0);
		  }//4th ending
	  while(ch=='y'||ch=='Y');
 }//4th if ending
 if(z==5){
	 do{//5th start
    System.out.println("Positive OR Negative");
	System.out.print("Enter value ");
	 a = ob.nextInt();
	if(a>=0)
		System.out.print("Positive no :"+a);		
	if (a<0)
		System.out.println("Negative no :"+a);	
	  System.out.println("do you again positive or negative");
	  ch=ob.next().charAt(0);
		  }//5th ending
	  while(ch=='y'||ch=='Y');
     }
	 if(z==6){ 
	 do{//6th start 
         System.out.println("Age Comparator");
		 System.out.println("Enter three Age : ");
		 System.out.print("age1 ");
		 a = ob.nextInt();
		 System.out.print("age2 ");
		 b = ob.nextInt();
		 System.out.print("age3 ");
		 c = ob.nextInt();
		
		if (a>b && a>c)
			System.out.print("Age1 greater ");
		if (b>a && b>c)
			System.out.print("Age2 greater ");
		if (c>a && c>b)
			System.out.print("Age3 greater ");
		  System.out.print("do you again age Comparezon");
	  ch=ob.next().charAt(0);
		  }//6th ending
	  while(ch=='y'||ch=='Y');
	}
	if(z==7){
		do{
        System.out.println("1.Even Or Odd \n 2.back");
		System.out.print("Enter sel ");
		 sel=ob.nextInt();
		if(sel==1){
		System.out.print("Enter Number : ");
		a = ob.nextInt();
		b = a%2;
		if(b==0)
			System.out.print("Even number :"+a);
		else 
			System.out.println("Odd number  :"+a);
		 System.out.print("do you again even or odd   ");
		}
		else
		break;//System.exit(0);
		
	  ch=ob.next().charAt(0);
		  }
	  while(ch=='y'||ch=='Y');
	  
	}
	if(z==8){
		
			System.out.println("1.HESCO \n2.back ");
		int unit =ob.nextInt();
		 if(unit>=1 && unit<=100){
	      System.out.println(unit+"*2 = "+(unit*2));    
		  System.out.print("charges will be "+(unit*2));
		
		 }
 if (unit>=101 && unit<=200){
	int u1=unit-100;
	int u2=u1*4;
    System.out.println("100*2 = 200");
    System.out.println(u1+"*4 = "+(u1*4));
	System.out.println("charges will be "+(u2+200));
		}
	 if (unit>=201 && unit<=300){
	int u2=unit-200;
	int u3=u2*6;
	System.out.println("100*2 = 200");
	System.out.println("100*4 = 400");
	System.out.println(u2+"*6 = "+(u2*6));
	System.out.println("charges will be "+(u3+600));
		 }
		 if (unit>=301 && unit<=400){
	int u2=unit-300;
	int u3=u2*8;
	System.out.println("100*2 = 200");
    System.out.println("100*4 = 400");
	System.out.println("100*6 = 600");
	System.out.println(u2+" *8 = "+(u2*8));
	System.out.println("charges will be "+(u3+1200));
		 }
		 if (unit>=401 ){
			 int u2=unit-400;
			 int u3=u2*10;
          System.out.println("100*2 = 200");
          System.out.println("100*4 = 400");
          System.out.println("100*6 = 600");
          System.out.println("100*8 = 800");
          System.out.println(u2+"*10 ="+(u2*10));
          System.out.println("charges will be "+(u3+2000));
		 }
			
		 
	}
	if(z==9){
		
    System.out.println("ATM");
	System.out.print("Enter Rupees ");
		int Rupees = ob.nextInt();
		
		int FThousand = Rupees/5000;
		Rupees    = Rupees%5000;
		
		int thousand  = Rupees/1000;
        Rupees= Rupees%1000;
        
		int fHundred  = Rupees/500;
         Rupees=	Rupees%500;
        
		int hundred   = Rupees/100;
        Rupees= Rupees%100;		
		
		int Fifty     = Rupees/50;
		Rupees=	Rupees%50;

        int twenty    = Rupees/20;
         Rupees=	Rupees%20;	
		
		int ten       = Rupees/10;
		 Rupees= Rupees%10; 
		
		int five      = Rupees/5;
		 Rupees= Rupees%5;
		
		int two       = Rupees/2;
		Rupees= Rupees%2;
		 
		int One       = Rupees/1;
				
        if(FThousand>0)
		System.out.println("5000 :"+FThousand);
        if(thousand>0) 
		System.out.println("1000 :"+thousand);
        if(fHundred>0)
		System.out.println("500  :"+fHundred);
        if(hundred>0)
		System.out.println("100  :"+hundred);
        if(Fifty>0)
		System.out.println("50   :"+Fifty);
        if(twenty>0)
		System.out.println("20   :"+twenty);
        if(ten>0)
		System.out.println("10   :"+ten);
         if(five>0)
		System.out.println("5    :"+five);
        if(two>0)
		System.out.println("2    :"+two);
        if(One>0)
		System.out.println("1    :"+One);
	 }
	 if(z==10){
		 
	 System.out.println("L00p series \n1.even Loop Series\n2.Odd Loop Series\n3.cube series \n4.table Series \n5.factorial series \n6.fibonic series \n7.prime no series \n8.star series \n9.back ");
	 do{
		 System.out.print("Enter sel ");
	 sel=ob.nextInt();
	 if(sel==1){
	 do{
		int j=1;
		do{
			if(j%2==0)
			System.out.println(j);
			j++;
		}
		while(j<=10);
		System.out.print("do you again \n\n ");
		ch = ob.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		}
	else	if(sel==2){
			do{
		int l=1;
		do{
			if(l%2==1)
			System.out.println(l);
			l++;
		}
		while(l<=10);
		System.out.print("\n\ndo you again ");
		ch = ob.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		}
	else	if(sel==3){
				do{
		int cub=1;
		do{
			//if(l%2==1)
			System.out.println(cub*cub*cub);
			cub++;
		}
		while(cub<=10);
		System.out.print("\n\ndo you again\n\n ");
		ch = ob.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		
		}
	else	if(sel==4){
			do{
        
	System.out.print("Enter table:");        
	 n=ob.nextInt();
	System.out.print("Enter any num : ");
		 a = ob.nextInt();
		 System.out.print("\n");
		int ta = 1;
        do
        {
            System.out.println(n+" * "+i+" = "+n*i);
			ta++;
        }
		while(ta <= a);
		 System.out.print("\ndo you want to do more tables s? y/n ");
		 ch =ob.next().charAt(0);
		 System.out.print("\n\n");
    }
	while(ch=='y'||ch=='Y');
		}
	else	if(sel==5){
			do{
				System.out.print(" Factorial \n");
  int n1=1, fact=1  ;   
  do{ 
  n1 = n1*fact;
  System.out.println(n1);	  
  fact++;
  }   
  while(fact<=5);
  System.out.println("\nDo you want to do more program Y/N");	  
  ch= ob.next().charAt(0);
  System.out.println("\n\n");
 }
 while(ch=='y'||ch=='Y');
		}
	else
		break;	
	
	  System.out.print("do you again Calculate manu  ");
	  ch=ob.next().charAt(0);
	   System.out.print("\n \n");
		  }//ending 
	  while(ch=='y'||ch=='Y');
	
		
	 }
     if(z==11){
         System.out.println("Engineer :abc \norganization :xyz \nemail :abs@.com \ncont :1234455 \n \n\n");	
	 }
	 if(z>=13){
		 System.out.println("Your program exit ok Good by");
	 System.exit(0);}
		
	 i++;}

	}
}