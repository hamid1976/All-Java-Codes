import java.util.*;

class Alphabet1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Alphabet ");
		String a=as.next();
		
		
		
		char b=a.charAt(0);

		String per=b=='A' || b=='a'?"apple":b=='B' || b=='b'?"Bol":
		
		           b=='C' || b=='c'?"cup":  b=='D' || b=='d'?"Dog":
				   
		           b=='E' || b=='E'?"Elephant":  b=='F' || b=='f'?"fogg":
				   
		           b=='G' || b=='g'?"Google":  b=='H' || b=='h'?"Horse":
				   
		           b=='I' || b=='i'?"Ice-crem":  b=='J' || b=='j'?"Juice":
				   
		           b=='K' || b=='k'?"King":  b=='L' || b=='l'?"Lion":
				   
		           b=='M' || b=='m'?"Mouse":  b=='N' || b=='n'?"Nurse":
				   
		           b=='O' || b=='o'?"orange":  b=='P' || b=='p'?"Parrot":
				   
		           b=='Q' || b=='q'?"queen":  b=='R' || b=='r'?"Rainbow":
				   
		           b=='S' || b=='s'?"Sprider":  b=='T' || b=='t'?"Tree":
				   
		           b=='U' || b=='u'?"Umvrella":  b=='V' || b=='v'?"Van":
				   
		           b=='W' || b=='w'?"while":  b=='X' || b=='x'?"X-ray":
				   
		           b=='Y' || b=='y'?"Yankee":  b=='Z' || b=='z'?"Zoo":"Invalid Alphabet";
				   
				   System.out.print(per);
				   
				   
	}
}
				   