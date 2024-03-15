import java.util.*;
class seassons2{
	public static void main (String arg[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter Month No ?");

	int m = ob.nextInt();

	if(m==1 || m==12 ||m==11)
		System.out.println("Winter");

	if (m==2 || m==3 || m==4 )
		System.out.println("Spring");

	if (m==5 || m==6 || m==7)
		System.out.println("Summer");

	if (m==8 || m==9 || m==10)
		System.out.println("Automn");

	if (m<1 || m>12)
		System.out.println("Invalid Month no");
   }
}

