import java.util.*;
class logic2{
	public static void main(String arg []){
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter  Month No:");
		String seasson = ob.next();
	if (seasson.equals("11")||seasson.equals("12")||seasson.equals("1"))
			System.out.print(" Seasson is winter");
	if (seasson.equals("2")||seasson.equals("3")||seasson.equals("4"))
			System.out.print(" Seasson is spring");
	if (seasson.equals("5")||seasson.equals("6")||seasson.equals("7"))
			System.out.print(" Seasson is summer");
	if (seasson.equals("8")||seasson.equals("9")||seasson.equals("10"))
           	System.out.print(" Seasson is Automn");
		 
	if	(seasson.equals("11")||seasson.equals("12")||seasson.equals("1")||
			seasson.equals("2")||seasson.equals("3")||seasson.equals("4")||
			seasson.equals("5")||seasson.equals("6")||seasson.equals("7")||
			seasson.equals("8")||seasson.equals("9")||seasson.equals("10"))
			System.out.print("");
			 else
				 System.out.print("Invalid Month ");
   }
}