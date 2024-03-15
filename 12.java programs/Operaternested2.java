import java.util.*;

class Operaternested2{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("1.Addition\n2.Subtraction\n3.Mutiplication\nEnter Selection ? ");
		int sel=as.nextInt();
		
		if(sel<1  || sel>3)
			System.out.print("Invalid Selection ");
		else{
			System.out.print("Enter Two Value? ");
			
			int a=as.nextInt();
			int b=as.nextInt();
			
			if(sel==1)
				System.out.print("Addition is : "+(a+b));
			if(sel==2)
				System.out.print("Subtraction is : "+(a-b));
			if(sel==3)
				System.out.print("Multiplication is : "+a*b);
		}
		
	}
}
			