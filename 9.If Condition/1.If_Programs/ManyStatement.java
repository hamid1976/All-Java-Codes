import java.util.*;
import javax.swing.*;
class ManyStatement
{
	public static void main(String arg []){
	
      Scanner ob = new Scanner (System.in);
	  System.out.println("calculator ");
	  System.out.println("Marksheet");
	  System.out.println("Trolyload ");
	  System.out.println("EmploweeBasicPay");
	  System.out.print("enter number ");
	  int z;
	  int  x, a,b,c;
		 z = ob.nextInt();
	  if(z==1){
      System.out.println("Calculator mnew");
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
	    System.out.print("Enter java    Mark ");
         int   d , e ,TObtain , Total, P ;
    
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
	 String s = JOptionPane.showInputDialog("Enter Employee basic pay");
		int EmploweeBasicPay = Integer.parseInt(s);
		
		int HouseRent = (EmploweeBasicPay*45/100);
		
		int MedicalAllowance = (EmploweeBasicPay*15/100);
        
		int Bonus = (EmploweeBasicPay*5/100);
		
		int GrossPay = (EmploweeBasicPay+HouseRent+MedicalAllowance+Bonus);
		
		int CanvanceAllowance =(EmploweeBasicPay*8/100);
		
		double Zakwat = EmploweeBasicPay*2.5/100;
		
		int IncomTax = (EmploweeBasicPay*5/100);
		
		double NetIncom = GrossPay-(CanvanceAllowance+Zakwat+IncomTax);
		
JOptionPane.showMessageDialog(null," House Rent :"+HouseRent
		                              +"\n Medical Allowance :"+MedicalAllowance
		                              +"\n Bonus :"+Bonus
		                              +"\n Gross pay :"+GrossPay
									  +"\n Canvance Allowance :"+CanvanceAllowance
									  +"\n Zakwat :"  +Zakwat
									  +"\n IncomTax :" + IncomTax
									  +"\n Net Incom :" +NetIncom);
 }
	}

}