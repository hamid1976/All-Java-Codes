import java.util.*;

class Testswitch{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		
		
		System.out.print("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Remainder\nEnter Selection ");
		int sel=as.nextInt();
		
		
		switch(sel){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:System.out.print("Enter Two Value ");
		
		        int a=as.nextInt();
		        int b=as.nextInt();
		           
			switch(sel){
			
			case 1:	System.out.print("Addition is : "+(a+b)); break;
			case 2: System.out.print("Subtraction is : "+(a-b)); break;
			case 3: System.out.print("Multiplication is : "+a*b);break;
			case 4: System.out.print("Divison is : "+a/b);break;
			case 5: System.out.print("Remainder is : "+a%b);break;
			
			}
			break;
			default: System.out.print("Invalid Selection ");
		
		}
		
	}
}