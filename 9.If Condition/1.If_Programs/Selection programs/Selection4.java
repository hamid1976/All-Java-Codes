import java.util.*;
class Selection4{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.println("1.Calculator\n2.UnitConverter\n3.Atm\n4.Trollyoad\n5.Employbasicpay\n6.Marksheet\n7.AgeCompare\n8.EvenOdd\n9.PositiveNegative\n10.AboutDeveloper\n11.Exit");
		  System.out.print("Enter your selection:");
        int select=ob.nextInt();
	    if(select == 1){
		 System.out.println("1.Addition\n2. Subtraction\n3.Multiplication\n4.Division\n5. Remainder");
	  
		System.out.print("Enter your selection:");
        int selection=ob.nextInt();
		if(selection == 1){
			
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Addition : "+ (a+b));
		}
		if(selection == 2){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Subtration : "+ (a-b));
		}
	    if(selection == 3){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Multiplication : "+ (a*b));
		}
		if(selection == 4){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
			
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Division : "+ (a/b));
		}
		if(selection == 5){
			System.out.print("Enter 1st value:");
			int a=ob.nextInt();
						
			System.out.print("Enter 2nd value:");
			int b=ob.nextInt();
			System.out.print("Remainder : "+ (a%b));
		}
	}
	if(select == 2){
		 System.out.println("1.feettoinch\n2.inchtofeet\n3.kilotogram\n4.gramtokilo");
		 
		 System.out.print("Enter your selected:");
         int selected=ob.nextInt();
		  if(selected==1){
			  
			 System.out.print("Enter feet:");
			 int feet=ob.nextInt();
			 int inch=feet*12;
			 System.out.println("feet="+feet);
			 System.out.println("inch="+inch);
			
		 }
     	if(selected == 2){
              System.out.print("Enter inch:");			
			  int inch=ob.nextInt();
			  int feet=inch/12;
			  System.out.println("feet="+feet);
			 
			  
		}
        if(selected == 3){
               System.out.print("Enter kilo:");
			   int kilo=ob.nextInt();
			   int gram=kilo*1000;
			   System.out.println("kilo="+kilo);
			   System.out.println("gram="+gram);
			   
		}
        if(selected == 4){
        	   System.out.print("Enter gram:");
			   int gram=ob.nextInt();
			   int kilo=gram/1000;
			    System.out.println("kilo="+kilo);
			 
        }	
	}
    if(select == 3){
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
	}
	if(select ==4){
	    System.out.println("Enter The Trollyload  ");
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
	   
	   
	   
	}
	if(select == 5){
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
		
		
	 }
	 if(select == 6){
		 System.out.println("Enter The Marks  ");	
		
		System.out.println("Enter The Marks of Java  ");	
		int Java=ob.nextInt();
		System.out.println("Enter The PHP Marks");
		int PHP=ob.nextInt();
		System.out.println("Enter The Science Marks");
		int Science=ob.nextInt();
	    System.out.println("Enter The History Marks");
	    int History=ob.nextInt();
	    System.out.println("Enter The Geography Marks");
		int Geography=ob.nextInt();
		System.out.println("TotalMarks="+(500));
	   
	    System.out.println("ObtainedMarks="+(Java+PHP+Science+History+Geography));
		
	    System.out.println("percentage="+( Java+PHP+Science+History+Geography)*100/500);
		
	}
	if(select == 7){
		
			
			System.out.print("Enter 1st Age?");
            int a=ob.nextInt();
			
			System.out.print("Enter 2nd Age?");
            int b=ob.nextInt();
			
			if(a==b)
				System.out.println("Both are equals");
			if(a>b)
				System.out.println("First Age is Greater");
			if(b>a)
				System.out.println("Second Age is Greater");
			
	}
	if(select == 8){
		int number;
  
        System.out.print("Enter the number you want to check:");
        number=ob.nextInt();
		
	    if(number % 2 == 0)
        {
            System.out.println(number+" is even number");
        }
        else 
        {
            System.out.println(number+" is odd number");
        }
	}
    if(select == 9){
		int number;
         System.out.print("Enter the number you want to check:");
        number=ob.nextInt();
		
	    if(number >=0)
        {
            System.out.println(number+" is positive number");
        }
        else 
        {
            System.out.println(number+" is negative number");
        }
    }
    if(select == 10){
         System.out.println("Enter About Developer");
		
		System.out.println("Enter Name");
		String Name=ob.next();
		System.out.println("Enter Organization");
		String Organization=ob.next();
		System.out.println("Enter Email");
		String Email=ob.next();
	    System.out.println("Enter Number");
	    String Number=ob.next();
	}
    if(select == 11){
        	System.out.print("Good bye");
			System.exit(0);
    }
  }	
}
		 