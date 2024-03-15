class Rectangle{
	int x;
	int y;
	int width;
	int height;
}
class Rect{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		
		ob1.x=10;
		ob1.y=20;
		ob1.width=30;
		ob1.height=40;
		
		ob2.x=10;
		ob2.y=20;
		ob2.width=30;
		ob2.height=40;
		
		System.out.println("X + X="+(ob1.x+ob2.x));
		System.out.println("Y + Y="+(ob1.y+ob2.y));
		System.out.println("Width +Width="+(ob1.width+ob2.width));
		System.out.println("Height + Height="+(ob1.height+ob2.height));
		
	}
}