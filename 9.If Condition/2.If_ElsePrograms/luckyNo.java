import java.util.*;
class luckyNo
{
	public static void main(String arg []){
	
      Scanner ob = new Scanner (System.in);
	  System.out.print("Enter lucky No");
	  int a =ob.nextInt();
	  
	  if(a==9 || a==5 || a==12 || a==19 || a==26 || a==48 || a==65 || a==89 || a== 96)
	      System.out.print("You win the game receive your prize from the reciption");
	  else
		  System.out.print("You loss the game receive your return fare from the reciption");
	}
}
		  
