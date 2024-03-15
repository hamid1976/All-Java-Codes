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
		System.out.println("Addition="+(y+ob2.y+ob2.y));
		System.out.println("Addition="+(width+ob1.width+ob2.width));
		System.out.println("Addition="+(height+ob2.height+ob2.height));
	}
	void sub(){
		System.out.println("Subtraction="+(x-y-width-height));
	}
	void sub(Rectangle ob){
		System.out.println("Subtraction="+(x-ob.x));
		System.out.println("Subtraction="+(y-ob.y));
		System.out.println("Subtraction="+(width-ob.width));
		System.out.println("Subtraction="+(height-ob.height));
	}
	void sub(Rectangle ob1,Rectangle ob2){
	    System.out.println("Subtraction="+(x-ob1.x-ob2.x));
		System.out.println("Subtraction="+(y-ob2.y-ob2.y));
		System.out.println("Subtraction="+(width-ob1.width-ob2.width));
		System.out.println("Subtraction="+(height-ob2.height-ob2.height));
	}
	void mul(){
		System.out.println("Multiplication="+(x*y*width*height));
	}
	void mul(Rectangle ob){
		System.out.println("Multiplication="+(x*ob.x));
		System.out.println("Multiplication="+(y*ob.y));
		System.out.println("Multiplication="+(width*ob.width));
		System.out.println("Multiplication="+(height*ob.height));
	}
	void mul(Rectangle ob1,Rectangle ob2){
	    System.out.println("Multiplication="+(x*ob1.x*ob2.x));
		System.out.println("Multiplication="+(y*ob2.y*ob2.y));
		System.out.println("Multiplication="+(width*ob1.width*ob2.width));
		System.out.println("Multiplication="+(height*ob2.height*ob2.height));
	}
	void div(){
		System.out.println("Division="+(x/y/width/height));
	}
	void div(Rectangle ob){
		System.out.println("Division="+(x/ob.x));
		System.out.println("Division="+(y/ob.y));
		System.out.println("Division="+(width/ob.width));
		System.out.println("Division="+(height/ob.height));
	}
	void div(Rectangle ob1,Rectangle ob2){
	    System.out.println("Division="+(x/ob1.x/ob2.x));
		System.out.println("Division="+(y/ob2.y/ob2.y));
		System.out.println("Division="+(width/ob1.width/ob2.width));
		System.out.println("Division="+(height/ob2.height/ob2.height));
	}
	void rem(){
		System.out.println("Remainder="+(x%y%width%height));
	}
	void rem(Rectangle ob){
		System.out.println("Remainder="+(x%ob.x));
		System.out.println("Remainder="+(y%ob.y));
		System.out.println("Remainder="+(width%ob.width));
		System.out.println("Remainder="+(height%ob.height));
	}
	void rem(Rectangle ob1,Rectangle ob2){
	    System.out.println("Remainder="+(x%ob1.x%ob2.x));
		System.out.println("Remainder="+(y%ob2.y%ob2.y));
		System.out.println("Remainder="+(width%ob1.width%ob2.width));
		System.out.println("Remainder="+(height%ob2.height%ob2.height));
	}
}
class ObjPassArgOverloadingRectangle{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(20,15,10,5);
		Rectangle ob2=new Rectangle(200,150,100,50);
		Rectangle ob3=new Rectangle(2000,1500,100,500);
		
		System.out.println("======Without Argument=======");
		ob1.add();
		ob2.add();
		ob3.add();
		System.out.println("======Single Argument======");
		ob1.add(ob2);
		ob2.add(ob2);
		ob3.add(ob1);
		System.out.println("======Double Argument========");
		ob3.add(ob1,ob2);
		ob1.add(ob1,ob1);
		
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.sub();
		ob2.sub();
		ob3.sub();
		System.out.println("======Single Argument======");
		ob1.sub(ob2);
		ob2.sub(ob2);
		ob3.sub(ob1);
	    System.out.println("======Double Argument========");
		ob3.sub(ob1,ob2);
		ob1.sub(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.mul();
		ob2.mul();
		ob3.mul();
		System.out.println("======Single Argument======");
		ob1.mul(ob2);
		ob2.mul(ob2);
		ob3.mul(ob1);
	    System.out.println("======Double Argument========");
		ob3.mul(ob1,ob2);
		ob1.mul(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.div();
		ob2.div();
		ob3.div();
		System.out.println("======Single Argument======");
		ob1.div(ob2);
		ob2.div(ob2);
		ob3.div(ob1);
		System.out.println("======Double Argument========");
		ob3.div(ob1,ob2);
		ob1.div(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.rem();
		ob2.rem();
		ob3.rem();
		System.out.println("======Single Argument======");
		ob1.rem(ob2);
		ob2.rem(ob2);
		ob3.rem(ob1);
		System.out.println("======Double Argument========");
		ob3.rem(ob1,ob2);
		ob1.rem(ob1,ob1);
		System.out.println("=========================");

		
	
	}
}
		