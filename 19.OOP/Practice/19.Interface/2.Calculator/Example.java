interface calc{
	void add(int a,int b);//by default all methods are public abstract
	void sub(int a,int b);//by default all methods are public abstract
	void mul(int a,int b);//by default all methods are public abstract
	void div(int a,int b);//by default all methods are public abstract
	void rem(int a,int b);//by default all methods are public abstract
}
class Calculator implements calc{
	public void add(int a,int b){
		System.out.println("Addition="+(a+b));
	}
	public void sub(int a,int b){
		System.out.println("Subtraction="+(a-b));
	}
	public void mul(int a,int b){
		System.out.println("Multiplication="+(a*b));
	}
	public void div(int a,int b){
		System.out.println("Division="+(a/b));
	}
	public void rem(int a,int b){
		System.out.println("Remainder="+(a%b));
	}
}
class Example{
	public static void main(String arg[]){
		calc ob=new Calculator();
	  //interface   child class
		ob.add(10,20);
		ob.sub(20,10);
		ob.mul(10,20);
		ob.div(20,10);
		ob.rem(20,10);
	}
}