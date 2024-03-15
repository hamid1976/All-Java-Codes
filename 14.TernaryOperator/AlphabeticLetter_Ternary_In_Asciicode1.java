import java.util.*;
class AlphabeticLetter_Ternary_In_Asciicode1{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Alphabet:");
		
		char ch=ob.next().charAt(0);
		
		
		String str=ch==65&&ch==97?("A for Apple"):
		           ch==66&&ch==98?("B for Ball"):
				   ch==67&&ch==99?("C for Cat"):
				   ch==68&&ch==100?("D for Dog"):
				   ch==69&&ch==101?("E for Elephent"):
				   ch==70&&ch==102?("F for Fast"):
				   ch==71&&ch==103?("G for Golf"):
				   ch==72&&ch==104?("H for House"):
				   ch==73&&ch==105?("I for Ice"):
				   ch==74&&ch==106?("J for Jug"):
				   ch==75&&ch==107?("K for Kite"):
				   ch==76&&ch==108?("L for Lemon"):
				   ch==77&&ch==109?("M for Mango"):
				   ch==78&&ch==110?("N for Net"):
				   ch==79&&ch==111?("O for Orange"):
				   ch==80&&ch==112?("P for Pink"):
				   ch==81&&ch==113?("Q for Question"):
				   ch==82&&ch==114?("R for Roze"):
				   ch==83&&ch==115?("S for Sun"):
				   ch==84&&ch==116?("T for Time"):
				   ch==85&&ch==117?("U for Umbrella"):
                   ch==86&&ch==118?("V for Ven"):
				   ch==87&&ch==119?("W for Waffer"):
				   ch==88&&ch==120?("X for Xperia"):
				   ch==89&&ch==121?("Y for Yellow"):
				   ch==90&&ch==122?("Z for Zebra"):("Invalid Letter");
				   
	    System.out.print(str);
	}
}