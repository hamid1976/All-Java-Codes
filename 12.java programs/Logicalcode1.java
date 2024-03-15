import java.util.*;

class Logicalcode1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter your Secret Code: ");
		String game=as.next();
		
		if(game.equals("35QKL") ||  game.equals("MGH56") || game.equals("105QFK") || game.equals("9HLMG")){

			System.out.print("Please Welcome Sir in the Hall");
		}
		else{
			System.out.print("Sorry! Sir You are outsider you May Not allowed in the Hall ");
		
		}
		
	}
}