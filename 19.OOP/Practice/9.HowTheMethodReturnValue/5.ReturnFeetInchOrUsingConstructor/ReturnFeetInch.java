class Calc{
	int feet,inch;
	Calc(int a,int b){
		feet=a;
		inch=b;
	}
	int add(){
		int c=feet+inch;
		return c;
	}
	int sub(){
		int c=feet-inch;
		return c;
	}
	int mul(){
		int c=feet*inch;
		return c;
	}
}
class ReturnFeetInch{
	public static void main(String arg[]){
		Calc ob=new Calc(10,5);
		Calc ob1=new Calc(100,50);
		Calc ob2=new Calc(100,5);
		
		int a=ob.add();
		int b=ob.sub();
		int c=ob.mul();
		System.out.println("Addition="+a);
		System.out.println("Subtraction="+b);
		System.out.println("Multiplication="+c);
		System.out.println("================================");

		int a1=ob1.add();
		int b1=ob1.sub();
		int c1=ob1.mul();
		System.out.println("Addition="+a1);
		System.out.println("Subtraction="+b1);
		System.out.println("Multiplication="+c1);
		System.out.println("================================");
		int a2=ob2.add();
		int b2=ob2.sub();
		int c2=ob2.mul();
		System.out.println("Addition="+a2);
		System.out.println("Subtraction="+b2);
		System.out.println("Multiplication="+c2);
		
	}
}