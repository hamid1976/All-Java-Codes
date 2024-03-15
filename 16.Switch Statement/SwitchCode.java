import java.util.*;
class SwitchCode{
		public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Secret code?");
		String code=ob.next();
		
		switch(code){
			case"XZ128Q":System.out.println("Welcome Hyder");
			break;
			case"XKMK6":System.out.println("Welcome Jawad");
			break;
			case"ABZKL9":System.out.println("Welcome Hamid");
			break;
			default:System.out.println("Sorry! you are unauthorized");
		}
		
		}
}