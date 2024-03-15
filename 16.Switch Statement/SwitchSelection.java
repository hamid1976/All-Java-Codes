import java.util.*;
class SwitchSelection{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder");
		
		
		System.out.println(" Enter selection? ");
		int sel=ob.nextInt();
		System.out.print(" Enter Two values? ");
		
		int a=ob.nextInt();
		int b=ob.nextInt();
		
		
		
		switch(sel){
			
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
		}	
}		