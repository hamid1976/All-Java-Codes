class Rectangle{
	int x;
	int y;
	int width;
	int height;
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void add(){}
	void add(Rectangle ob1){
		System.out.println("X="+(x+ob1.x));
		System.out.println("Y="+(y+ob1.y));
		System.out.println("WIDTH="+(width+ob1.width));
		System.out.println("HEIGHT="+(height+ob1.height));
	}
	void add(Rectangle ob1,Rectangle ob2){
		System.out.println("X="+(x+ob1.x+ob2.x));
		System.out.println("Y="+(y+ob1.y+ob2.y));
		System.out.println("WIDTH="+(width+ob1.width+ob2.width));
		System.out.println("HEIGHT="+(height+ob1.height+ob2.height));
	}
	void add(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		System.out.println("X="+(x+ob1.x+ob2.x+ob3.x));
		System.out.println("Y="+(y+ob1.y+ob2.y+ob3.y));
		System.out.println("WIDTH="+(width+ob1.width+ob2.width+ob3.width));
		System.out.println("HEIGHT="+(height+ob1.height+ob2.height+ob3.height));
	}
}
class Rect{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(10,20,30,40);
		Rectangle ob2=new Rectangle(40,30,20,10);
		Rectangle ob3=new Rectangle(30,40,50,40);
		
		ob1.add(ob1);
		System.out.println("==================");
		ob2.add(ob1,ob1);
		System.out.println("==================");
		ob1.add(ob2,ob1);
		System.out.println("==================");
		ob2.add(ob1,ob2,ob3);
		System.out.println("==================");
		ob3.add(ob2,ob3,ob3);
	}	
}
	