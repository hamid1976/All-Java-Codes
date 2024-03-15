import java.util.*;
class AlphabeticLetter_Ternary{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Alphabet:");
		
		char ch=ob.next().charAt(0);
		
		
		String str=ch=='A'||ch=='a'?("A for Apple"):
		           ch=='B'||ch=='b'?("B for Ball"):
				   ch=='C'||ch=='c'?("C for Cat"):
				   ch=='D'||ch=='d'?("D for Dog"):
				   ch=='E'||ch=='e'?("E for Elephent"):
				   ch=='F'||ch=='f'?("F for Fast"):
				   ch=='G'||ch=='g'?("G for Golf"):
				   ch=='H'||ch=='h'?("H for House"):
				   ch=='I'||ch=='i'?("I for Ice"):
				   ch=='J'||ch=='j'?("J for Jug"):
				   ch=='K'||ch=='k'?("K for Kite"):
				   ch=='L'||ch=='l'?("L for Lemon"):
				   ch=='M'||ch=='m'?("M for Mango"):
				   ch=='N'||ch=='n'?("N for Net"):
				   ch=='O'||ch=='o'?("O for Orange"):
				   ch=='P'||ch=='p'?("P for Pink"):
				   ch=='Q'||ch=='q'?("Q for Question"):
				   ch=='R'||ch=='r'?("R for Roze"):
				   ch=='S'||ch=='s'?("S for Sun"):
				   ch=='T'||ch=='t'?("T for Time"):
				   ch=='U'||ch=='u'?("U for Umbrella"):
                   ch=='V'||ch=='v'?("V for Ven"):
				   ch=='W'||ch=='w'?("W for Waffer"):
				   ch=='X'||ch=='x'?("X for Xperia"):
				   ch=='Y'||ch=='y'?("Y for Yellow"):
				   ch=='Z'||ch=='z'?("Z for Zebra"):("Invalid Letter");
				   
	    System.out.print(str);
	}
}

		