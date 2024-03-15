import java.util.*;

class Luckygame{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Your Lucky No ");
		int grame=as.nextInt();
		
		if(grame==5 || grame==12 || grame==35 || grame==80 )
			System.out.print("you won the game take you prize from receiption");
		
		else
			System.out.print("\nSorry! your lose the grame Receive your Return fare from receiptions \n");
	}
}