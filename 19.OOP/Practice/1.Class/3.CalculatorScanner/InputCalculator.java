import java.util.*;
class Calc{
	Scanner ob=new Scanner(System.in);
    void add(){
		System.out.print("Enter Two Value=");
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Addition="+(a+b));
     }
	 void sub(){
		System.out.print("Enter Two Value=");
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Subtraction="+(a-b));
     }
	 void mul(){
		System.out.print("Enter Two Value="); 
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Multiplication="+(a*b));
     }
	 void div(){
		System.out.print("Enter Two Value=");
		int a=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Division="+(a/b));
     }
}
class InputCalculator{
	public static void main(String arg[]){
		Calc ob=new Calc();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}