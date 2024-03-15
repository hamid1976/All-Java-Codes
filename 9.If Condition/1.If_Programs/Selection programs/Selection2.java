import java.util.*;
class Selection2{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.println("1.Calculator\n2. Marksheet\n3.Trollyload\n4.Employbasicpay");
		 
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
	if(select==2){
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
    if(select==3){
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
	 if(select==4){
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
	}
}