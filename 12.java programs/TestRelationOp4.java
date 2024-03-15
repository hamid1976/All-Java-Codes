import java.util.*;

class TestRelationOp4{
	
	public static void main(String age[]){
		Scanner as=new Scanner(System.in);
		System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Remaineder");
		System.out.print("Enter Your Selection ");
		int a=as.nextInt();
		
		System.out.print("Enter 1st value ");
		int b=as.nextInt();
		
		System.out.print("Enter 2nd value ");
		int c=as.nextInt();
		
		if(a==1)
			System.out.print("Addition : "+(b+c));
		
		if(a==2)
			System.out.print("Subtraction : "+(b-c));
		
		if(a==3)
			System.out.print("Multiplication : "+(b*c));
		
		if(a==4)
			System.out.print("Division : "+(b/c));
		
		if(a==5)
			System.out.print("Remaineder : "+(b%c));
		
		

			
	}
}
		