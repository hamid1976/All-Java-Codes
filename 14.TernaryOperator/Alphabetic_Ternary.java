import java.util.*;
class Alphabetic_Ternary{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Alphabet:");
		
		char ch=ob.next().charAt(0);
		
		
		String str=ch=='A'?("A for Apple"):
		           ch=='a'?("A for Apple"):
		           ch=='B'?("B for Ball"):
		           ch=='b'?("B for Ball"):
		           ch=='C'?("C for Cat"):
		           ch=='c'?("C for Cat"):
		           ch=='D'?("D for Dog"):
		           ch=='d'?("D for Dog"):
		           ch=='E'?("E for Elephent"):
		           ch=='e'?("E for Elephent"):
		           ch=='F'?("F for Fox"):
		           ch=='f'?("F for Fox"):
		           ch=='G'?("G for Golf"):
		           ch=='g'?("G for Golf"):
		           ch=='H'?("H for House"):
		           ch=='h'?("H for House"):
		           ch=='I'?("I for Ice"):
		           ch=='i'?("I for Ice"):
		           ch=='J'?("J for Jug"):
		           ch=='j'?("J for Jug"):
		           ch=='K'?("K for Kite"):
		           ch=='k'?("k for Kite"):
		           ch=='L'?("L for Lemon"):
		           ch=='l'?("L for Lemon"):
		           ch=='M'?("M for Mango"):
		           ch=='m'?(" M for Mango"):
	               ch=='N'?("N for Nike"):
		           ch=='n'?("N for Nike"):
		           ch=='O'?("O for Orange"):
		           ch=='o'?("O for Orange"):
		           ch=='P'?("P for Pink"):
		           ch=='p'?("P for Pink"):
		           ch=='Q'?("Q for Question"):
		           ch=='q'?("Q for Question"):
		           ch=='R'?("R for Roze"):
		           ch=='r'?("R for Roze"):
		           ch=='S'?("S for Silk"):
		           ch=='s'?("S for Silk"):
		           ch=='T'?("T for Time"):
		           ch=='t'?("T for Time"):
		           ch=='U'?("U for Umbrella"):
		           ch=='u'?("U for Umbrella"):
		           ch=='V'?("V for Ven"):
		           ch=='v'?("V for Ven"):
		           ch=='W'?("W for Waffer"):
		           ch=='w'?("W for Waffer"):
		           ch=='X'?("X for Xperia"):
		           ch=='x'?("X for Xperia"):
		           ch=='Y'?("Y for Yellow"):
		           ch=='y'?("Y for Yellow"):
		           ch=='Z'?("Z for Zebra"):
		           ch=='z'?("Z for Zebra"):("Invalid Letter");
				   
				   
				   
		System.out.print(str);
}
}