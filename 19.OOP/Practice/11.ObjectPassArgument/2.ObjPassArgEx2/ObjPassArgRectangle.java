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
}
class Display{
	static void add(Rectangle ob){
		System.out.println("Addition="+(ob.x+ob.y+ob.width+ob.height));
    }
	static void sub(Rectangle ob){
		System.out.println("Subtraction="+(ob.x-ob.y-ob.width-ob.height));
    }
	static void mul(Rectangle ob){
		System.out.println("Multiplication="+(ob.x*ob.y*ob.width*ob.height));
    }
	static void div(Rectangle ob){
		System.out.println("Division="+(ob.x/ob.y/ob.width/ob.height));
    }
	static void rem(Rectangle ob){
		System.out.println("Remainder="+(ob.x%ob.y%ob.width%ob.height));
    }
}
class ObjPassArgRectangle{
	public static void main(String arg[]){
	    Rectangle ob1=new Rectangle(20,15,10,5);
		Display.add(ob1);
		Display.sub(ob1);
		Display.mul(ob1);
		Display.div(ob1);
		Display.rem(ob1);
		System.out.println("=========================");
		Rectangle ob2=new Rectangle(200,150,100,50);
		Display.add(ob2);
		Display.sub(ob2);
		Display.mul(ob2);
	    Display.div(ob2);
        Display.rem(ob2);
	}
}
