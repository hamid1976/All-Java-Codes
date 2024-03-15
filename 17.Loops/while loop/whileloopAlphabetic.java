import java.util.*;
class whileloopAlphabetic{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter letter:");
				String letter=ob.next();
				
			if(letter.equals("a")||letter.equals("A"))
				System.out.print("A for Apple");
			else
				if(letter.equals("b")||letter.equals("B"))
				System.out.print("B for Ball");
			else
				if(letter.equals("c")||letter.equals("C"))
				System.out.print("C for Cat");
			else
				if(letter.equals("d")||letter.equals("D"))
				System.out.print("D for Dog");
			else
				if(letter.equals("e")||letter.equals("E"))
				System.out.print("E for Elephent");
			else
				if(letter.equals("f")||letter.equals("F"))
				System.out.print("F for Fan");
			else
				if(letter.equals("g")||letter.equals("G"))
				System.out.print("G for Glass");
			else
				if(letter.equals("h")||letter.equals("H"))
				System.out.print("H for House");
			else
				if(letter.equals("i")||letter.equals("I"))
				System.out.print("I for Ice");
			else
				if(letter.equals("j")||letter.equals("J"))
				System.out.print("J for Jug");
			else
				if(letter.equals("k")||letter.equals("K"))
				System.out.print("K for Kite");
			else
				if(letter.equals("l")||letter.equals("L"))
				System.out.print("L for Lemon");
			else
				if(letter.equals("m")||letter.equals("M"))
				System.out.print("M for Mango");
			else
				if(letter.equals("n")||letter.equals("n"))
				System.out.print("n for Nose");
			else
				if(letter.equals("o")||letter.equals("O"))
				System.out.print("O for Orange");
			else
				if(letter.equals("p")||letter.equals("P"))
				System.out.print("P for Pineapple");
			else
				if(letter.equals("q")||letter.equals("Q"))
				System.out.print("Q for Quiz");
			else
				if(letter.equals("r")||letter.equals("R"))
				System.out.print("R for Rose");
			else
				if(letter.equals("s")||letter.equals("S"))
				System.out.print("S for Sun");
			else
				if(letter.equals("t")||letter.equals("T"))
				System.out.print("T for Time");
			else
				if(letter.equals("u")||letter.equals("U"))
				System.out.print("U for Umbrella");
			else
				if(letter.equals("v")||letter.equals("V"))
				System.out.print("V for ven");
			else
				if(letter.equals("w")||letter.equals("W"))
				System.out.print("W for Waffer");
			else
				if(letter.equals("x")||letter.equals("X"))
				System.out.print("X for Xara");
			else
				if(letter.equals("z")||letter.equals("Z"))
				System.out.print("Z for Zebra");
            else 
               System.out.print("Invalid");
      
           System.out.print("Do you want to do more letter y/N ?");

           ch=ob.next().charAt(0);
			}//end while loop
	}
}	