import java.util.*;

class Testloopwhile15{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		char ch='y';
		
		while(ch=='y'||ch=='Y'){
			
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
		
		
		System.out.print("\nDo you want to run this system again Enter the 'y' ");
		ch=as.next().charAt(0);
		}
		
		
		
	}
}