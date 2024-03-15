import java.util.*;

class LogicalOperator3{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st Age ? ");
		int age=as.nextInt();
		
		System.out.print("Enter 2nd Age ? ");
		int age2=as.nextInt();
		
		System.out.print("Enter 3nd Age ? ");
		int age3=as.nextInt();
		
		if(age>age2){
			if(age>age3){
				System.out.print("1st age is Greater");
			}
		}
		
		if(age2>age){
			if(age2>age3){
				System.out.print("2nd age is Greater");
			}
		}
		
		if(age3>age){
			if(age3>age2){
				System.out.print("3nd age is Greater");
			}
		}
	}
}