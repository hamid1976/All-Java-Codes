import java.util.*;
class switchSesson{
	public static void main (String arg []){
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter month ");
		int mon = ob.nextInt();
		switch (mon){
			case 1:
			case 12:
			case 11:
			System.out.print("Winter");
			break ;
			case 2:
			case 3:
			case 4:
			System.out.print("Spring");
			break;
			case 5:
			case 6:
			case 7:
			System.out.print("Summer");
			break;
			case 8:
			case 9:
			case 10:
			System.out.print("Outum");
			break;
		}
	}
}	