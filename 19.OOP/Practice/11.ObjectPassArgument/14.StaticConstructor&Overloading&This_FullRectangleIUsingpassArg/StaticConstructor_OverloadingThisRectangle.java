class Rectangle{
	int x;
	int y;
	int width;
	int height;
	Rectangle(int x,int y,int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	void show(){
		System.out.println("======SHOW METHOD===");
		System.out.println("====ADDITION=====");
		Display.add(this);
		System.out.println("==============");
		Display.add(this,this);
		System.out.println("==============");
		Display.add(this,this,this);
		System.out.println("====SUBTRACTION======");
		Display.sub(this);
		System.out.println("==============");
		Display.sub(this,this);
		System.out.println("==============");
		Display.sub(this,this,this);
		System.out.println("=====MULTIPLICATION=====");
		Display.mul(this);
		System.out.println("==============");
		Display.mul(this,this);
		System.out.println("==============");
		Display.mul(this,this,this);
		System.out.println("======DIVISION=====");
		Display.div(this);
		System.out.println("==============");
		Display.div(this,this);
		System.out.println("==============");
		Display.div(this,this,this);
		System.out.println("=====REMAINDER=====");
		Display.rem(this);
		System.out.println("==============");
		Display.rem(this,this);
		System.out.println("==============");
		Display.rem(this,this,this);
	}
}
class Display{
	static void add(Rectangle ob1){
		System.out.println("Addition="+(ob1.x+ob1.y+ob1.width+ob1.height));
	}
	static void add(Rectangle ob1,Rectangle ob2){
		System.out.println("Addition="+(ob1.x+ob2.x));
		System.out.println("Addition="+(ob1.y+ob2.y));
		System.out.println("Addition="+(ob1.width+ob2.width));
		System.out.println("Addition="+(ob1.height+ob2.height));
	}
	static void add(Rectangle ob1, Rectangle ob2,Rectangle ob3){
		System.out.println("Addition="+(ob1.x+ob2.x+ob3.x));
		System.out.println("Addition="+(ob1.y+ob2.y+ob3.y));
		System.out.println("Addition="+(ob1.width+ob2.width+ob3.width));
		System.out.println("Addition="+(ob1.height+ob2.height+ob3.height));
	}
	static void sub(Rectangle ob1){
		System.out.println("Subtraction="+(ob1.x-ob1.y-ob1.width-ob1.height));
	}
	static void sub(Rectangle ob1,Rectangle ob2){
		System.out.println("Subtraction="+(ob1.x-ob2.x));
		System.out.println("Subtraction="+(ob1.y-ob2.y));
		System.out.println("Subtraction="+(ob1.width-ob2.width));
		System.out.println("Subtraction="+(ob1.height-ob2.height));
	}
	static void sub(Rectangle ob1, Rectangle ob2,Rectangle ob3){
		System.out.println("Subtraction="+(ob1.x-ob2.x-ob3.x));
		System.out.println("Subtraction="+(ob1.y-ob2.y-ob3.y));
		System.out.println("Subtraction="+(ob1.width-ob2.width-ob3.width));
		System.out.println("Subtraction="+(ob1.height-ob2.height-ob3.height));
	}
	static void mul(Rectangle ob1){
		System.out.println("Multiplication="+(ob1.x*ob1.y*ob1.width*ob1.height));
	}
	static void mul(Rectangle ob1,Rectangle ob2){
		System.out.println("Multiplication="+(ob1.x*ob2.x));
		System.out.println("Multiplication="+(ob1.y*ob2.y));
		System.out.println("Multiplication="+(ob1.width*ob2.width));
		System.out.println("Multiplication="+(ob1.height*ob2.height));
	}
	static void mul(Rectangle ob1, Rectangle ob2,Rectangle ob3){
		System.out.println("Multiplication="+(ob1.x*ob2.x*ob3.x));
		System.out.println("Multiplication="+(ob1.y*ob2.y*ob3.y));
		System.out.println("Multiplication="+(ob1.width*ob2.width*ob3.width));
		System.out.println("Multiplication="+(ob1.height*ob2.height*ob3.height));
	}
	static void div(Rectangle ob1){
		System.out.println("Division="+(ob1.x/ob1.y/ob1.width/ob1.height));
	}
	static void div(Rectangle ob1,Rectangle ob2){
		System.out.println("Division="+(ob1.x/ob2.x));
		System.out.println("Division="+(ob1.y/ob2.y));
		System.out.println("Division="+(ob1.width/ob2.width));
		System.out.println("Division="+(ob1.height/ob2.height));
	}
	static void div(Rectangle ob1, Rectangle ob2,Rectangle ob3){
		System.out.println("Division="+(ob1.x/ob2.x/ob3.x));
		System.out.println("Division="+(ob1.y/ob2.y/ob3.y));
		System.out.println("Division="+(ob1.width/ob2.width/ob3.width));
		System.out.println("Division="+(ob1.height/ob2.height/ob3.height));
	}
	static void rem(Rectangle ob1){
		System.out.println("Remainder="+(ob1.x%ob1.y%ob1.width%ob1.height));
	}
	static void rem(Rectangle ob1,Rectangle ob2){
		System.out.println("Remainder="+(ob1.x%ob2.x));
		System.out.println("Remainder="+(ob1.y%ob2.y));
		System.out.println("Remainder="+(ob1.width%ob2.width));
		System.out.println("Remainder="+(ob1.height%ob2.height));
	}
	static void rem(Rectangle ob1, Rectangle ob2,Rectangle ob3){
		System.out.println("Remainder="+(ob1.x%ob2.x%ob3.x));
		System.out.println("Remainder="+(ob1.y%ob2.y%ob3.y));
		System.out.println("Remainder="+(ob1.width%ob2.width%ob3.width));
		System.out.println("Remainder="+(ob1.height%ob2.height%ob3.height));
	}
	
}
class StaticConstructor_OverloadingThisRectangle{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(10,20,30,40);
		Rectangle ob2=new Rectangle(5,10,20,30);
		System.out.println("====ADDITION=====");
		Display.add(ob1);
		System.out.println("==============");
		Display.add(ob1,ob2);
		System.out.println("==============");
		Display.add(ob1,ob2,ob2);
		
		System.out.println("=====SUBTRACTION====");
		Display.sub(ob1);
		System.out.println("==============");
		Display.sub(ob1,ob2);
		System.out.println("==============");
		Display.sub(ob1,ob2,ob2);
		
		System.out.println("=====MULTIPLICATION======");
		Display.mul(ob1);
		System.out.println("==============");
		Display.mul(ob1,ob2);
		System.out.println("==============");
		Display.mul(ob1,ob2,ob2);
		
		System.out.println("=====DIVISION====");
		Display.div(ob1);
		System.out.println("==============");
		Display.div(ob1,ob2);
		System.out.println("==============");
		Display.div(ob1,ob2,ob2);
		
		System.out.println("=====REMAINDER======");
		Display.rem(ob1);
		System.out.println("==============");
		Display.rem(ob1,ob2);
		System.out.println("==============");
		Display.rem(ob1,ob2,ob2);
	    
		ob1.show();
		
		ob2.show();
	}
}