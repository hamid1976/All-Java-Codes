import java.util.*;
class miniSwitch{
	public static void main(String arg []){
		Scanner ob = new Scanner(System.in);
		System.out.print("1.unitconvert \n2.Calculator \n3.Alphatic play land \n4.Sesson\nEnter Selection ");
		int mini=ob.nextInt();
		int a ,b ;
		switch (mini){
			case 1:
		
				System.out.print("1.feet To Inch \n2.Inch to Feet \n3.kilometer to Meter \n4.Meter to Kilometer");
		     	int set =ob.nextInt();
			
		       	switch (set){	
				case 1 :
				System.out.print("Enter feet ");
				a = ob.nextInt();
				System.out.print("Inch will be :"+(a*12));
				break;
				case 2 :
				System.out.print("Enter Inch ");
				a = ob.nextInt();
				System.out.print("feet will be :"+(a/12));
				break ;
				case 3 :
				System.out.print("Enter Kilometer ");
				a = ob.nextInt();
				System.out.print("Meter will be :"+(a*1000));
				break ;
				case 4 :
				System.out.print("Enter Meter ");
				a = ob.nextInt();
				System.out.print("Kilometer will be :"+(a/1000));
				break ;
			
			default :
			System.out.print("Invalid");
			}
	
	break ;
			case 2 :
			System.out.print("1.claculate \n2.operator ");
			int c =ob.nextInt();
			switch (c){
				case 1 :
			System.out.print("1.Add\n2.Sub \n3.Multi \n4.divi \n5.Remen \nEnter selection ");
		     set = ob.nextInt();
		    
			switch (set){
			
			case 1 :
			System.out.print("enter Two number ");
			a=ob.nextInt();
	    	b=ob.nextInt();
			System.out.print(a+b);
			break ; 
			case 2:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a-b);
			break ;
			case 3:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a*b);
			break ;
			case 4:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a/b);
			break ;
			case 5:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a%b);
			break ;
		
		default :
		System.out.println("Invalid");
			
			}
			break ;
			case 2:
			System.out.print("+.Add\n-.Sub \n*.Multi \n/.divi \n%.Remen \nEnter selection");
		String str = ob.next();	
		char ope = str.charAt(0);
		
		
		switch (str){
			
			case "+" :
			System.out.print("enter Two number ");
			a=ob.nextInt();
	    	b=ob.nextInt();
			System.out.print(a+b);
			break ; 
			case "-":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a-b);
			break ;
			case "*":
			case "x":
			case "X":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a*b);
			break ;
			case "/":
			case "\\":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a/b);
			break ;
			case "%":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a%b);
			break ;
		
		default :
		System.out.print("Invalid");
		}
			}
			break;
			case 3:
		System.out.print("Enter  latter :");
		String str = ob.next();
		char letter= str.charAt(0);
		switch (letter){
	case 'A':
    case 'a':	
		System.out.println("A for apple");
	break;
	case 'B':
	case 'b':
		System.out.println("B for book");
	break;
	case 'C':
	case 'c':
		System.out.println("C for cat");
	break;
	
	case 'D':
	case 'd':
		System.out.println("D for dog");
	break;
	case 'E':
	case 'e':
		System.out.println("E for Egg ");
	break;
	case 'F':
	case 'f':
		System.out.println("F for fish");
	
	case 'g':
	case 'G':
		System.out.println("G for goat");
	break;
	case 'H':
	case 'h':
		System.out.println("H for hen");
	break;
	
	case 'I':
	case 'i':
		System.out.println("I for Iron");
	break;
    case 'J':
    case 'j':
		System.out.println("J for jug");
	break;
	
	case 'K':
	case 'k':
		System.out.println("K for King");
break ;
	case 'L':
	case 'l':
		System.out.println("L for Lion");
	break ;
	case 'M':
	case 'm':
		System.out.println("M for Mango");
	break ;
	case 'N':
	case 'n':
		System.out.println("N for Nest");
	break ;
	case 'o':
	case 'O':
		System.out.println("O for orange");
	break ;
	case 'p':
	case 'P':
		System.out.println("P for parrot");
	break ;
	case 'Q':
	case 'q':
		System.out.println("Q for queen");
	break ;
	case 'R':
	case 'r':
		System.out.println("R for rose ");
	break ;
	case 'S':
	case 's':
		System.out.println("S for sunflower");
	break ;
	case 'T':
	case 't':
		System.out.println("T for tiger");
	break ;
	case 'U':
	case 'u':
		System.out.println("U for umbrella");
	break ;
	case 'V':
	case 'v':
		System.out.println("V for ven");
	break ;
	case 'W':
	case 'w':
		System.out.println("W for Water");
	break ;
	case 'X':
	case 'x':
		System.out.println("X for x-ray");
	break ;
	case 'Y':
	case 'y':
		System.out.println("Y for yellow");
	break ;
	case 'Z':
	case 'z':
		System.out.println("Z for zoo");
		break ;
		default:
		System.out.print("Invalid");
		}
		break;
			case 4:
			System.out.print("Enter month ");
		int mon = ob.nextInt();
		
		switch (mon){
			case 1:
			case 12:
			case 11:
			System.out.print("Winter");
			break ;
			case 2:
			case 3:
			case 4:
			System.out.print("Spring");
			break;
			case 5:
			case 6:
			case 7:
			System.out.print("Summer");
			break;
			case 8:
			case 9:
			case 10:
			System.out.print("Outum");
			break;
			default :
			System.out.print("Invalid");
		}
		break ;
			default :
			System.out.print("Invaid");
		}
	}
}