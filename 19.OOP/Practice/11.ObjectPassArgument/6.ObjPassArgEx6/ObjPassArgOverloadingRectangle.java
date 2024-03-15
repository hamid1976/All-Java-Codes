class Rectangle{
	int x,y,width,height;
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void add(){
		System.out.println("Addition="+(x+y+width+height));
	}
	void add(Rectangle ob){
		System.out.println("Addition="+(x+ob.x));
		System.out.println("Addition="+(y+ob.y));
		System.out.println("Addition="+(width+ob.width));
		System.out.println("Addition="+(height+ob.height));
	}
	void add(Rectangle ob1,Rectangle ob2){
		System.out.println("Addition="+(x+ob1.x+ob2.x));
		System.out.println("Addition="+(y+ob1.y+ob2.y));
		System.out.println("Addition="+(width+ob1.width+ob2.width));
		System.out.println("Addition="+(height+ob1.height+ob2.height));
	}
}
class ObjPassArgOverloadingRectangle{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(20,15,10,5);
		Rectangle ob2=new Rectangle(200,150,100,50);
		Rectangle ob3=new Rectangle(2000,1500,1000,500);
		System.out.println("=============================");
		ob1.add();
		ob2.add();
		ob3.add();
		System.out.println("=============================");
		ob1.add(ob2);
		ob2.add(ob2);
		ob3.add(ob1);
		System.out.println("=============================");
		ob1.add(ob2,ob1);
		ob2.add(ob1,ob1);
	}
}