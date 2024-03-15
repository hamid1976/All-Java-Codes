import java.util.*;

class Testswitch6{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("1.Unit Convertor\n2.Calulator\n3.Alphabet\n4.Season\n\nEnter Selection ");
		int search=as.nextInt();
		
		switch(search){
			case 1:System.out.print("unit Convertor  \n\n1.Feet to Inches\n2.Inches to Feet\n3.Kilo to grams\n4.Grams to Kilo\nEnter Selection ");
			       int search1=as.nextInt();
			
			switch(search1){
			case 1:System.out.print("Enter Feet No ");
			       int feet=as.nextInt();
				   
				   int Inches=feet*12;
				   
				   System.out.print("Inches will be: "+Inches);break;
				   
			case 2:System.out.print("Enter Inches No ");
		           int inches1=as.nextInt();
				   
				   int feet1=inches1/12;
				   
				   System.out.print("Feet will be: "+feet1);break;
				   
			case 3:System.out.print("Enter Kilo No ");
			       int kilo=as.nextInt();
				   
				   int grams=kilo*1000;
				   
				   System.out.print("Grams will be: "+grams);break;
				   
			case 4:System.out.print("Enter Grams No ");
			       int grams1=as.nextInt();
				   
				   int kilo1=grams1/1000;
				   
				   System.out.print("Kilo will be: "+kilo1);break;
				   
		   default:System.out.print("Invalid Unit Convertor");
		   
		}
			break;
			case 2: System.out.print("Calculator\n\n1.calculator(Menu)\n2.calculator(Operater)\n\nEnter Selection ");
			        int calculater=as.nextInt();
					
					switch(calculater){
						case 1:
							System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Remainder\n\nEnter Selection ");
		int sel=as.nextInt();
		
		System.out.print("Enter Two Value ");
		
		int a=as.nextInt();
		int b=as.nextInt();
		
		switch(sel){
			
			case 1: System.out.print("\nAddition is : "+(a+b)); break;
			case 2: System.out.print("\nSubtraction is : "+(a-b)); break;
			case 3: System.out.print("\nMultiplication is : "+a*b);break;
			case 4: System.out.print("\nDivison is : "+a/b);break;
			case 5: System.out.print("\nRemainder is : "+a%b);break;
			default: System.out.print("\nInvalid Selection ");
			
			
		}
		
						break;
     				case 2:
					System.out.print("Enter Two value ");
		int a1=as.nextInt();
		int b1=as.nextInt();
		
		System.out.print("1.+\n2.-\n3.*\n4./\n5.%\n\nEnter Operater ");
		String sel1=as.next();
		
		
		switch(sel1){
			case "+": System.out.print("\nAddition is : "+(a1+b1));break;
			case "-": System.out.print("\nSubtraction is : "+(a1-b1));break;
			case "*": System.out.print("\nMultiplication is : "+a1*b1);break;
			case "X": System.out.print("\nMultiplication is "+a1*b1);break;
			case "x": System.out.print("\nMultiplication is "+a1*b1);break;
			case "/": System.out.print("\nDivisor is : "+a1/b1);break;
			case "\\":System.out.print("\nDivisor is : "+a1/b1);break;
			case "%": System.out.print("\nRemainder is : "+a1%b1);break;
			default: System.out.print("\nInvalid Operater");
			
		}
		
							
					}
			break;
			case 3:
			System.out.print("Enter Alphabet letter ");
		String alphabet=as.next();
		
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
		break;
		
		case 4:
		
		System.out.print("Enter Season No ");
		int Month=as.nextInt();
		
		String season;
		
		switch(Month){
			case 11:
			case 12:
			case 1:
			season = "Winter";break;
			case 2:
			case 3:
			case 4:
			season = "Spring";break;
			case 5:
			case 6:
			case 7:
			season = "Summer";break;
			case 8:
			case 9:
			case 10:
			season = "Autumn";break;
			default:
			season = "Invalid Month";
		}
		System.out.println(season);
			
		}
		
		
	}
}