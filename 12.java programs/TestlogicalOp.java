import java.util.*;

class TestlogicalOp{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.println("Enter age");
		int age=as.nextInt();
		
		if(age>=1 && age<=6){
			
			System.out.println("Drink milk you are child");
		}
		if(age>6 && age<=17){
			System.out.println("Eat kherni");
		}
		if(age>=18 && age<=50){
			System.out.println("Eat Meal you are Young");
		}
		if(age>50){
			System.out.println("Eat Jellly you are too old Mr");
		}
		
	}
}