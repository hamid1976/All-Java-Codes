import java.util.*;
class Greater_In_max{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter 1st age:");
		int age1=ob.nextInt();
		
		System.out.println("Enter 2nd age:");
		int age2=ob.nextInt();
		
		System.out.println("Enter 3rd age:");
		int age3=ob.nextInt();
		
		System.out.println("Enter 4th age:");
		int age4=ob.nextInt();
		
		System.out.println("Enter 5th age:");
		int age5=ob.nextInt();
		
		String max=age1>age2&&age1>age3&&age1>age4&&age1>age5?("First age is greater"+age1):
		           age2>age3&&age2>age4&&age2>age5&&age1>age2?("Second age is greater"+age2):
				   age3>age1&&age3>age2&&age3>age4&&age3>age5?("Third age is graeter"+age3):
                   age4>age1&&age4>age2&&age4>age3&&age4>age5?("Fourth age is greater"+age4):("age5 is greater"+age5);
				   
				   System.out.print(max);
                   				                                                    
	}
}
	