import java.util.*;
class whileloopOpertor{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
			char ch= 'y';
			while(ch=='y'||ch=='Y'){
				
				System.out.print("Enter 1st value:");
				int a=ob.nextInt();
				
				System.out.print("Enter 2nd value:");
				int b=ob.nextInt();
				
				System.out.print("Enter Operator:");
				String str=ob.next();
				char Op=str.charAt(0);
				String s="Invalid";
				
				String ans =Op=='+'?("Addition:"+(a+b)):
				            Op=='-'?("subtraction:"+(a-b)):
						    Op=='*'?("Multiplication:"+(a*b)):
						    Op=='/'?("Division:"+(a/b)):
						    Op=='%'?("Remainder:"+(a%b)):"Invalid";
			   System.out.println(ans);
			   System.out.print("Do you want to do more Calc  y/N?");
			   ch=ob.next().charAt(0);
			}//end while loop
	}//end main method
}//end class
				
				