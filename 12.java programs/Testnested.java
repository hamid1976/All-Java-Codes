import java.util.*;

class Testnested{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st value ");
		int age=as.nextInt();
		
		System.out.print("Enter 2nd value ");
		int age2=as.nextInt();
		
		System.out.print("Enter 3nd value ");
		int age3=as.nextInt();
		
		if(age>age2){
			if(age>age3){
			System.out.print("1st value is greater ");
			}
		}
		
		if(age2>age){
			if(age2>age3){
				System.out.print("2nd value is greater ");
			}
		}
		
		if(age3>age){
			if(age3>age2){
				System.out.print("3nd value is greater ");
			}
		}
		
	}
}

		