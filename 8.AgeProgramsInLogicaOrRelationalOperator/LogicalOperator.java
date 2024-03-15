import java.util.*;
class LogicalOperator{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Age ?");
		int Age=ob.nextInt();
		
		if(Age>=3 && Age<=13)
		    System.out.println("Eat rice,candies and drink milk");
		if(Age>=13 && Age<=30)
            System.out.println("Eat meat");
	    if(Age>30 && Age<=60)
		    System.out.println("Eat meat and drink milk");
	    if(Age>60)
		    System.out.println("Eat Jelly and drink milk because u are old");
	}
}
	   