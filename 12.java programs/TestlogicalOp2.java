import java.util.*;

class TestlogicalOp2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter 1st No  ");
		int age=as.nextInt();
		
		System.out.print("Enter 2nt No  ");
		int age2=as.nextInt();
		
		System.out.print("Enter 3nt No  ");
		int age3=as.nextInt();
		
	    System.out.println("Enter percentege  "+age+" "+age2+" "+age3);
		
		if(age>=40 && age<=60){
			System.out.println("C");
		}
		
		if(age2>=61 && age2<=79){
			System.out.println("B");
		}
		if(age2>=80 && age2<=89){
			System.out.println("B");
		}
		
		if(age3>=90
		&& age3<=100){
			System.out.println("A");
		}
		
	
		
	}
}
		
		