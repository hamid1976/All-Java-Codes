import java.util.*;
class whileloopCal{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter 1st value:");
				int a=ob.nextInt();
				
				System.out.print("Enter 2nd value:");
				int b=ob.nextInt();
				
				System.out.println("Addition :"+(a+b));
				System.out.println("Subtraction :"+(a-b));
				System.out.println("Multiplication :"+(a*b));
				System.out.println("Division :"+(a/b));
				System.out.println("Remainder :"+(a%b));
				
				System.out.print("Do you want to do more Calc  y/N?");
				
				ch=ob.next().charAt(0);
			}//End of while loop
		}
	}		