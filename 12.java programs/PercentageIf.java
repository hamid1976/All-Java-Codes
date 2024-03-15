import java.util.*;

class PercentageIf{
	
	public static void main(String arg[]){
	
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter the Percentage: ");
		int per=as.nextInt();
		
		if(per>100)
			System.out.println("Over Flow");
		else
			if(per>=90)
				System.out.println("A-1");
			else
			if(per>=80)
				System.out.println("A");
			else
			if(per>=70)
				System.out.println("B");
			else
			if(per>=60)
				System.out.println("C");
			else
			if(per>=50)
				System.out.println("D");
			else
			if(per>=40)
				System.out.println("E");
			else
				System.out.println("Fail");
	}
}