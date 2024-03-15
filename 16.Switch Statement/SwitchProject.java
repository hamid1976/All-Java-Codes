import java.util.*;
class SwitchProject{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.println("1.calculator\n2.Seasson\n3.Alphabetic Playland\n4.Unit Converter\n5.Marksheet\n6.Atm\n7.Trollyload\n8.Employee Basicpay\n9.Hesco Bill");
		
		
		System.out.println(" Enter selection? ");
		int selection=ob.nextInt();
		
		
		switch(selection){
			case 1:
		System.out.println(" 1.calculator menu\n2.calculator operator");
		 selection=ob.nextInt();
		 switch(selection){
			 case 1:
			 System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
			  selection=ob.nextInt();
			  System.out.print(" Enter Two values? ");
		
		      int a=ob.nextInt();
		      int b=ob.nextInt();
			  
			  switch(selection){
				 
				  	
			case 1:System.out.println("Addition="+(a+b));
			        break;
		    case 2:System.out.println("Subtraction="+(a-b));
			        break;
     		
			
			case 3:System.out.println("Multiplication="+(a*b));
			        break;
			
			case 4:System.out.println("Division="+(a/b));
			        break;
            case 5:System.out.println("Remainder="+(a%b));
			        break;		
            default:System.out.println("Invalid operator");
		}
		
				  break;
			  }
			  break;
		 }
		 
		 
		 
		 
		 
		 import java.util.*;
         class SwitchSelection2{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.println("1.calculator\n2.Seasson\n3.Alphabetic Playland\n4.Unit Converter\n5.Marksheet\n6.Atm\n7.Trollyload\n8.Employee Basicpay\n9.Hesco Bill");
		
		
		System.out.println(" Enter selection? ");
		int selection=ob.nextInt();
		
		-------------------------------------------------------------
		switch(selection){
			case 1:
			System.out.println(" 1.calculator menu\n2.calculator operator");
			selection1=ob.nextInt();
			switch(selection1){
				case 1:
				System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
				selection2=ob.nextInt();
			  
				switch(selection2){
				 
				  	System.out.println("-----------Addition-----------");
				System.out.print(" Enter Two values? ");
		
				int a=ob.nextInt();
				int b=ob.nextInt();
					case 1:System.out.println("Addition="+(a+b));
			        break;
					case 2:System.out.println("Subtraction="+(a-b));
			        break;
     		
			
					case 3:System.out.println("Multiplication="+(a*b));
			        break;
			
					case 4:System.out.println("Division="+(a/b));
			        break;
					case 5:System.out.println("Remainder="+(a%b));
			        break;		
            default:System.out.println("Invalid operator");
		}
		
				  break;
			  }
			  break;
		 }
		
		switch(selection){
		case 2:
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
			  selection=ob.nextInt();
			  
		
		System.out.print(" Enter Two values? ");
		int c=ob.nextInt();
		int d=ob.nextInt();
		
		System.out.print("Enter operator?");
		char op=ob.next().charAt(0);
		
		switch(op){
			
			case'+':System.out.println("Addition="+(c+d));
			        break;
		    case'-':System.out.println("Subtraction="+(c-d));
			        break;
     		case'*':
			case'x':
			case'X':System.out.println("Multiplication="+(c*d));
			        break;
			case'/':
			case'\\':System.out.println("Division="+(c/d));
			        break;
            case'%':System.out.println("Remainder="+(c%d));
			        break;		
            default:System.out.println("Invalid operator");
			break;
		}
          	break;
		
		
		
		   
		}
}







import java.util.*;
class SwitchSelection2{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.println("1.calculator\n2.Seasson\n3.Alphabetic Playland\n4.Unit Converter\n5.Marksheet\n6.Atm\n7.Trollyload\n8.Employee Basicpay\n9.Hesco Bill");
		
		
		System.out.println(" Enter selection? ");
		int selection=ob.nextInt();
		
		-------------------------------------------------------------
		switch(selection){
			case 1:
			System.out.println(" 1.calculator menu\n2.calculator operator");
			selection1=ob.nextInt();
			
			switch(selection1){
				case 1:
				System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
				selection2=ob.nextInt();
			  
				switch(selection2){
				 
				  	System.out.println("-----------Addition-----------");
				System.out.print(" Enter Two values? ");
		
				int a=ob.nextInt();
				int b=ob.nextInt();
					case 1:System.out.println("Addition="+(a+b));
			        break;
					case 2:System.out.println("Subtraction="+(a-b));
			        break;
     		
			
					case 3:System.out.println("Multiplication="+(a*b));
			        break;
			
					case 4:System.out.println("Division="+(a/b));
			        break;
					case 5:System.out.println("Remainder="+(a%b));
			        break;		
                default:
				System.out.println("Invalid operator");
			    break;
		        }
		
		 break;
			
		
		case 2:
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
	    selection3=ob.nextInt();
			  
		
		System.out.print(" Enter Two values? ");
		int c=ob.nextInt();
		int d=ob.nextInt();
		
		System.out.print("Enter operator?");
		char op=ob.next().charAt(0);
		
		switch(op){
			
			case'+':System.out.println("Addition="+(c+d));
			        break;
		    case'-':System.out.println("Subtraction="+(c-d));
			        break;
     		case'*':
			case'x':
			case'X':System.out.println("Multiplication="+(c*d));
			        break;
			case'/':
			case'\\':System.out.println("Division="+(c/d));
			        break;
            case'%':System.out.println("Remainder="+(c%d));
			        break;		
        default:
			System.out.println("Invalid operator");
			break;
		    }//end calculator operator
        break;
		
		default :
		System.out.println("Invalid selection");
		break;
		
		}//end main calculator
		break;
		case 2:
		
		
		
		

         
	   
		 case 2:
		 
		 System.out.print("Enter Month?");
		 int Month=ob.nextInt();
		
		 switch(Month){
			
			 case 11: 
		     case 12: 
     		 case 1:System.out.println(" Season is winter");
                     break; 
			 case 2:
			 case 3:      
			 case 4:System.out.println(" Season is Spring");
			         break;
			 case 5:       
             case 6:        
             case 7:System.out.println(" Season is Summer");
			         break;
			 case 8:       
             case 9:        
             case 10:System.out.println(" Season is Automn");
			         break;					
             default:System.out.println("Invalid Month no");
			         break;
		     }//end month
		 
		 break;
	default:
	System.out.println("Invalid selection");
	break;	 
		}//end main selection
		}//end main method
}//end class