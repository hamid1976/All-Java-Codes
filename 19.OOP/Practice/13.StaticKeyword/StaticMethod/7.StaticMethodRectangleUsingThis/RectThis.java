class Rectangle{
	int x,y,width,height;
	void set(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
		Display.add(this);
		Display.sub(this);
		Display.mul(this);
		Display.div(this);
		Display.rem(this);
	}
}
class Display{
	static void add(Rectangle ob1){
		System.out.println("Addition="+(ob1.x+ob1.y+ob1.width+ob1.height));
	}
	static void sub(Rectangle ob1){
		System.out.println("Subtraction="+(ob1.x-ob1.y-ob1.width-ob1.height));
	}
	static void mul(Rectangle ob1){
		System.out.println("Multiplication="+(ob1.x*ob1.y*ob1.width*ob1.height));
	}
	static void div(Rectangle ob1){
		System.out.println("Division="+(ob1.x/ob1.y/ob1.width/ob1.height));
	}
	static void rem(Rectangle ob1){
		System.out.println("Remainder="+(ob1.x%ob1.y%ob1.width%ob1.height));
	}
}	
class RectThis{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		
		ob1.set(10,20,30,40);
		ob2.set(100,200,300,400);
		
		ob1.show();
		System.out.println("===Object Two======");
		ob2.show();
	}
}