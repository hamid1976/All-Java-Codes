class Rectangle{
	int x,y,width,height;
	Rectangle(){
		x=0;
		y=0;
		width=0;
		height=0;
		System.out.println("I am No argument");
	}
	Rectangle(int a){
		x=y=width=height=a;
		System.out.println("I am one argument");
	}
	Rectangle(int a,int b){
		x=a;
		y=b;
		System.out.println("I am Two argument");
	}
	Rectangle(int a,int b,int c){
		x=a;
		y=b;
		width=c;
		System.out.println("I am Three argument");
	}
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
		System.out.println("I am Three argument");
	}
	void show(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("WIDTH="+width);
		System.out.println("HEIGHT="+height);
	}
}
class ConstructorOverloadingRectangle{
	public static void main(String arg[]){
		Rectangle ob =new Rectangle();
		Rectangle ob1=new Rectangle(10);
		Rectangle ob2=new Rectangle(10,20);
		Rectangle ob3=new Rectangle(10,20,30);
		Rectangle ob4=new Rectangle (10,20,30,40);
		
		ob.show();
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}
}