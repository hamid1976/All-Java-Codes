import java.util.*;
import javax.swing.*;
class miniProject{

	public static void main(String arg []){
	
      Scanner ob = new Scanner (System.in);
	  System.out.println("1. calculator \n2. Marksheet \n3. Trolyload \n4. Emplowee BasicPay \n5. Positive or Negative \n6. Age Comparator \n7. Even or Odd \n8. HESCO \n9. ATM \n10.About software Engineer  \n11.Exit");	  
	  System.out.print("enter number ");
	  int  x, a,b,c,z;
		 z = ob.nextInt();
	  if(z==1){
      System.out.println("Calculator menu");
	  System.out.println("1.Addition :");
	  System.out.println("2.Subtraction :");
	  System.out.println("3.Multiplication :");
	  System.out.println("4.Division :");
	  System.out.println("5.Remender :");
	  
	  System.out.print("Enter Selection:");
		 a = ob.nextInt();
	  
	  if(a==1){
		              System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	          c = ob.nextInt();
	                  System.out.println("Addition :"+(b+c));
	  }
	  if(a==2){
		              System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                  System.out.print("Enter var2 :");
	           c = ob.nextInt();
                      System.out.println("Subtraction :"+(b-c));
	  }
	  if(a==3){
		               System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                   System.out.print("Enter var2 :");
	           c = ob.nextInt();
	                   System.out.println("Multiplication:"+(b*c));
	  }
	  if(a==4){
		                System.out.print("Enter var1 :");
		      b = ob.nextInt();
	                    System.out.print("Enter var2 :");
	          c = ob.nextInt();
	                    System.out.println("Division :"+(b/c));
	  }
      if(a==5){
		                 System.out.print("Enter var1 :");
		       b = ob.nextInt();
	                     System.out.print("Enter var2 :");
	           c = ob.nextInt();
		                 System.out.println("Remainder :"+(b%c));
	  }
	}
	if(z==2){
		System.out.println("Marks Calculate");
	    int   d , e ,TObtain , Total, P ;
		System.out.print("Enter java    Mark ");
      	a =ob.nextInt();
       System.out.print("Enter English Mark ");
       b =ob.nextInt();
       System.out.print("Enter Sindhi  Mark ");
       c =ob.nextInt();
       System.out.print("Enter Math    Mark ");
       d =ob.nextInt();
       System.out.print("Enter Urdu    Mark ");
        e =ob.nextInt();

 TObtain = (a+b+c+d+e);
System.out.println("Obtained : "+ TObtain);
 Total = 500;
System.out.println("Total Mark "+ Total);
 P = TObtain*100/Total;
System.out.println("percentage :"+ P+"%");
    
	if (P>=90 && P<=100)
		System.out.print("A-1 Grade ");
	else if (P>=80 && P<=89)
		System.out.print("A Grade ");
	else if (P>=70 && P<=79)
		System.out.print("B Grade ");
	else if (P>=60 && P<=69)
		System.out.print("C Grade ");
	else if (P>=50 && P<=59)
		System.out.print("D Grade ");
	else if (P>=40 && P<=49)
		System.out.print("E Grade ");
	else 
		System.out.print("fale ");	
	}
	if(z==3){
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
	}
 if(z==4){
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
 }
 if(z==5){
    System.out.println("Positive OR Negative");
	System.out.print("Enter value ");
	 a = ob.nextInt();
	if(a>=0)
		System.out.print("Positive no :"+a);		
	if (a<0)
		System.out.print("Negative no :"+a);	
     }
	 if(z==6){
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
	}
	if(z==7){
        System.out.println("Even OR Odd");
		System.out.print("Enter Number :");
		
		a = ob.nextInt();
		b = a%2;
		if(b==0)
			System.out.print("Even number :"+a);
		else 
			System.out.print("Odd number  :"+a);
	}
	if(z==8){
            System.out.println("HESCO Bill");
            System.out.print("Enter unit");
			a =ob.nextInt();
			
		    if(a>=1 && a<=100)
			System.out.print("unit is"+a);
	    
		else if(a>=101 && a<=200)
	        System.out.print("unit is "+(a*2-100));
		
		else if (a>=201 && a<=300)
			System.out.print("unit is "+(a*3-300));
		
		else if (a>=301 && a<=400)
			System.out.print("unit is "+(a*4-600));
		else 
		System.out.print("Invalid unit number ");
		
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
System.out.println("Engineer :abc \norganization :xyz \nemail :abs@.com \ncont :1234455");	
}
if(z==11)
System.out.println("ok");
       
	}
}