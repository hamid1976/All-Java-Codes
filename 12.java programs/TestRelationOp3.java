import java.util.*;

class TestRelationOp3{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age?  ");
		int age=as.nextInt();
		
		System.out.print("Enter 2nd age?  ");
		int age2=as.nextInt();
		
		if(age==age2)
			System.out.print("both are Equal");
		
		if (age>age2)
			System.out.print("1st Age is Greater");
		
		if(age2>age)
			System.out.print("2nd Age is Greater");
		
	}
}

