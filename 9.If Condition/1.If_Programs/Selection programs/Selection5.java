import java.util.*;
class Selection5{
	public static void main(String arg[])
	{
		Scanner ob=new Scanner(System.in);
		
		 System.out.println("1.Calculator\n2.Unitonverter");
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
		 System.out.println("1.feet to inch\n2.inch to feet\n3.kilo to gram\n4.gram to kilo");
		 
		 if(selected == 1){
			 System.out.print("Enter feet:");
			 int feet=ob.nextInt();
			 int inch=feet*12;
		 }
     	if(selected == 2){
              System.out.print("Enter inch:");			
			  int feet=ob.nextInt();
			  int inch=feet/12;
		}
        if(selected == 3){
               System.out.print("Enter kilo:");
			   int kilo=ob.nextInt();
			   int gram=kilo*1000;
		}
        if(selected == 4){
        	   System.out.print("Enter gram:");
			   int kilo=ob.nextInt();
			   int gram=kilo/1000;
        }	
	}	  
	}
}