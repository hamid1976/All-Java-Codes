class Rectangle{
	int x;
	int y;
	int width;
	int height;
	static int counter;
	
}
class StaticVariable{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
	    
		Rectangle.counter=1000;
		System.out.println("====object one=======");
		ob1.x=20;
		ob1.y=15;
		ob1.width=10;
		ob1.height=5;
		System.out.println("X="+ob1.x);
		System.out.println("Y="+ob1.y);
		System.out.println("Width="+ob1.width);
		System.out.println("Height="+ob1.height);
		System.out.println(Rectangle.counter);
		System.out.println("====object two=======");
		ob1.x=200;
		ob1.y=15;
		ob1.width=100;
		ob1.height=50;
		System.out.println("X="+ob2.x);
		System.out.println("Y="+ob2.y);
		System.out.println("Width="+ob2.width);
		System.out.println("Height="+ob2.height);
		System.out.println(Rectangle.counter);
		System.out.println("=================");
		
		ob1.counter=5000;
		System.out.println("====object one=======");
		ob1.x=20;
		ob1.y=15;
		ob1.width=10;
		ob1.height=5;
		System.out.println("X="+ob1.x);
		System.out.println("Y="+ob1.y);
		System.out.println("Width="+ob1.width);
		System.out.println("Height="+ob1.height);
		System.out.println(Rectangle.counter);
		System.out.println("====object two=======");
		ob1.x=200;
		ob1.y=15;
		ob1.width=100;
		ob1.height=50;
		System.out.println("X="+ob2.x);
		System.out.println("Y="+ob2.y);
		System.out.println("Width="+ob2.width);
		System.out.println("Height="+ob2.height);
		System.out.println(Rectangle.counter);
		System.out.println("=================");
		
		ob2.counter=7000;
		System.out.println("====object one=======");
		ob1.x=20;
		ob1.y=15;
		ob1.width=10;
		ob1.height=5;
		System.out.println("X="+ob1.x);
		System.out.println("Y="+ob1.y);
		System.out.println("Width="+ob1.width);
		System.out.println("Height="+ob1.height);
		System.out.println(Rectangle.counter);
		System.out.println("====object two=======");
		ob1.x=200;
		ob1.y=15;
		ob1.width=100;
		ob1.height=50;
		System.out.println("X="+ob2.x);
		System.out.println("Y="+ob2.y);
		System.out.println("Width="+ob2.width);
		System.out.println("Height="+ob2.height);
		System.out.println(Rectangle.counter);
		System.out.println("=================");
	}
}