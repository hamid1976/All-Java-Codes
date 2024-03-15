import java.util.*;
class Percentage{
    	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Your Percentage ?");
		int Percentage=ob.nextInt();
		
		if(Percentage>=90 && Percentage<=100)
		    System.out.println("Grade is A1");
		if(Percentage>=80 && Percentage<90)
            System.out.println("Grade is A");
	    if(Percentage>=70 && Percentage<80)
		    System.out.println("Grade is B");
	    if(Percentage>=60 && Percentage<70)
		    System.out.println("Grade is C");
		if(Percentage>=50 && Percentage<60)
			System.out.println("Grade is D");
		if(Percentage>=40 && Percentage<50)
			System.out.println("Grade is E");
		if(Percentage<=39)
			System.out.println("Fail");
		    
	}
}
