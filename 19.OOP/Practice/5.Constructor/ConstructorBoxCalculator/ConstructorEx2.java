class Box{
	int feet ,inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void set(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		add();
		sub();
		mul();
		div();
		rem();
	}

private void add(){
	System.out.println("Addition="+(feet+inch));
}
private void sub(){
	System.out.println("Subtraction="+(feet-inch));
}
private void mul(){
	System.out.println("Multiplication="+(feet*inch));
}
private void div(){
	System.out.println("Division="+(feet/inch));
}
private void rem(){
	System.out.println("Remainde r="+(feet%inch));
}
}
class ConstructorEx2{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		ob1.show();
		ob1.set(1000,5000);
		ob1.show();
		ob1.set(300,400);
		ob1.show();
	}
}