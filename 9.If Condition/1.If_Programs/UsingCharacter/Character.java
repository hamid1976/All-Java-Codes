import java.util.Scanner;
class Character{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch= ob.nextLine().charAt(0);
		
		
		if(ch>=33 && ch<=47){
				
				System.out.println(ch +  "  is special character");
			}
			
	}
}