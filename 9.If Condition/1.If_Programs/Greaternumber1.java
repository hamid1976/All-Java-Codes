import java.util.*;
class Greaternumber1{
	public static void main (String [] arg){
		Scanner ob = new Scanner(System.in);
			System.out.print("Enter three number ");
			
					int num1= ob.nextInt();
					int num2= ob.nextInt();
					int num3= ob.nextInt();
			           if(num1>num2){
						   if(num1>num3){
							   System.out.print("Greater num1 "+num1);
					   }}
					   if(num2>num1){
						   if(num2>num3){
							   System.out.print("Greater num2 "+num2);
					   }}
					   if(num3>num1){
						   if(num3>num2){
							   System.out.print("Greater num3 "+num3);
					   }}
					   if(num1==num2){
						   System.out.print("number1 and number2 is equal");
				       }
                       if(num1==num3){
						   System.out.print("number1 and number3 is equal");
				       }				
				       if(num3==num2){
						   System.out.print("number3 and number2 is equal");
				       }
			}}
