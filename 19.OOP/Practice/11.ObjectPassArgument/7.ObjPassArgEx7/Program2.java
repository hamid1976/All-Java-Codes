import java.util.*;
class Calculator{	
	void add(int a, int b){
		System.out.print("Addition is: "+(a+b));
	}
}
class Program2{
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		Calculator cc=new Calculator();
		System.out.print("Enter Two Value  ");
		int add1=as.nextInt();
		int add2=as.nextInt();
		cc.add(add1,add2);	
	}
}