class Rectangle{
	int x,y,width,height;
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void set(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
		add();
		sub();
		mul();
		div();
		rem();
	}

private void add(){
	System.out.println("Addition="+(x+y+width+height));
}
private void sub(){
	System.out.println("Subtraction="+(x-y-width-height));
}
private void mul(){
	System.out.println("Multiplication="+(x*y*width*height));
}
private void div(){
	System.out.println("Division="+(x/y/width/height));
}
private void rem(){
	System.out.println("Remainder="+(x%y%width%height));
}
}
class ConstructorEx5{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(20,15,10,5);
		ob1.show();
		System.out.println("======================");
		ob1.set(4000,3000,2000,1000);
		ob1.show();
		System.out.println("======================");
		ob1.set(300,400,500,600);
		ob1.show();
	}
}