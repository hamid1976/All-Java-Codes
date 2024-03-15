import java.util.*;

class Grade12{
	public static void main (String arg []){
    Scanner ob = new Scanner(System.in);
	System.out.print("Enter Percentage ?");
	int percentage = ob.nextInt();
		if(percentage>100){
			  System.out.print(" percentage is above ");
			  System.exit(0);
		}
		else if(percentage>=90)
			System.out.print(" Grade  A1 ");
		else if(percentage>=80)
			System.out.print(" Grade A ");
		else if(percentage>=70)
			System.out.print(" Grade B ");
        else if(percentage>=60)
            System.out.print(" Grade C ");
        else if(percentage>=50)
            System.out.print(" Grade D ");
        else if(percentage>=40)
            System.out.print(" Grade E ");
        else //if(percentage<=40) 
			 System.out.print ("you are fail ");
	}
}