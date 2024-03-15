import java.util.*;

class LogicalOperator1{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter your Age ? ");
		int age=as.nextInt();
		
		if(age>=1 && age<=12)
			System.out.print("\nYou are child Take the loly pop\n");
		
		if(age>=13 && age<=35)
			System.out.print("\nYou are young Eat chicken and Beef\n");
		
		if(age>=36)
			System.out.print("\nSorry you lose Your teeth Eat Jally Now\n");
		
	}
}