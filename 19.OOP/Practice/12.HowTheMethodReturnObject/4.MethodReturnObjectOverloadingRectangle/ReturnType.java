class Rectangle{
	int x,y,width,height;
	Rectangle(){}
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}
}//end class Constructor Rectangle
class Display{
	static Rectangle add(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob.x;
		ob.y=ob.y;
		ob.width=ob.width;
		ob.height=ob.height;
		return ob;
	}
	static Rectangle add(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x;
		ob.y=ob1.y+ob2.y;
		ob.width=ob1.width+ob2.width;
		ob.height=ob1.height+ob2.height;
		return ob;
	}
	static Rectangle add(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x;
		ob.y=ob1.y+ob2.y+ob3.y;
		ob.width=ob1.width+ob2.width+ob3.width;
		ob.height=ob1.height+ob2.height+ob3.height;
		return ob;
	}
	static Rectangle add(Rectangle ob1,Rectangle ob2, Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x+ob4.x;
		ob.y=ob1.y+ob2.y+ob3.y+ob4.y;
		ob.width=ob1.width+ob2.width+ob3.width+ob4.width;
		ob.height=ob1.height+ob2.height+ob3.height+ob4.height;
		return ob;
	}
	static Rectangle add(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x+ob4.x+ob5.x;
		ob.y=ob1.y+ob2.y+ob3.y+ob4.y+ob5.y;
		ob.width=ob1.width+ob2.width+ob3.width+ob4.width+ob5.width;
		ob.height=ob1.height+ob2.height+ob3.height+ob4.height+ob5.height;
		return ob;
	}
	static Rectangle sub(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob.x;
		ob.y=ob.y;
		ob.width=ob.width;
		ob.height=ob.height;
		return ob;
	}
	static Rectangle sub(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x;
		ob.y=ob1.y-ob2.y;
		ob.width=ob1.width-ob2.width;
		ob.height=ob1.height-ob2.height;
		return ob;
	}
	static Rectangle sub(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x;
		ob.y=ob1.y-ob2.y-ob3.y;
		ob.width=ob1.width-ob2.width-ob3.width;
		ob.height=ob1.height-ob2.height-ob3.height;
		return ob;
	}
	static Rectangle sub(Rectangle ob1,Rectangle ob2, Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x-ob4.x;
		ob.y=ob1.y-ob2.y-ob3.y-ob4.y;
		ob.width=ob1.width-ob2.width-ob3.width-ob4.width;
		ob.height=ob1.height-ob2.height-ob3.height-ob4.height;
		return ob;
	}
	static Rectangle sub(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x-ob4.x-ob5.x;
		ob.y=ob1.y-ob2.y-ob3.y-ob4.y-ob5.y;
		ob.width=ob1.width-ob2.width-ob3.width-ob4.width-ob5.width;
		ob.height=ob1.height-ob2.height-ob3.height-ob4.height-ob5.height;
		return ob;
	}
	static Rectangle mul(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob.x;
		ob.y=ob.y;
		ob.width=ob.width;
		ob.height=ob.height;
		return ob;
	}
	static Rectangle mul(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x;
		ob.y=ob1.y*ob2.y;
		ob.width=ob1.width*ob2.width;
		ob.height=ob1.height*ob2.height;
		return ob;
	}
	static Rectangle mul(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x;
		ob.y=ob1.y*ob2.y*ob3.y;
		ob.width=ob1.width*ob2.width*ob3.width;
		ob.height=ob1.height*ob2.height*ob3.height;
		return ob;
	}
	static Rectangle mul(Rectangle ob1,Rectangle ob2, Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x*ob4.x;
		ob.y=ob1.y*ob2.y*ob3.y*ob4.y;
		ob.width=ob1.width*ob2.width*ob3.width*ob4.width;
		ob.height=ob1.height*ob2.height*ob3.height*ob4.height;
		return ob;
	}
	static Rectangle mul(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x*ob4.x*ob5.x;
		ob.y=ob1.y*ob2.y*ob3.y*ob4.y*ob5.y;
		ob.width=ob1.width*ob2.width*ob3.width*ob4.width*ob5.width;
		ob.height=ob1.height*ob2.height*ob3.height*ob4.height*ob5.height;
		return ob;
	}
	static Rectangle div(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob.x;
		ob.y=ob.y;
		ob.width=ob.width;
		ob.height=ob.height;
		return ob;
	}
	static Rectangle div(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x;
		ob.y=ob1.y/ob2.y;
		ob.width=ob1.width/ob2.width;
		ob.height=ob1.height/ob2.height;
		return ob;
	}
	static Rectangle div(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x;
		ob.y=ob1.y/ob2.y/ob3.y;
		ob.width=ob1.width/ob2.width/ob3.width;
		ob.height=ob1.height/ob2.height/ob3.height;
		return ob;
	}
	static Rectangle div(Rectangle ob1,Rectangle ob2, Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height;
		return ob;
	}
	static Rectangle div(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x/ob5.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y/ob5.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width/ob5.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height/ob5.height;
		return ob;
	}
	static Rectangle rem(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob.x;
		ob.y=ob.y;
		ob.width=ob.width;
		ob.height=ob.height;
		return ob;
	}
	static Rectangle rem(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x;
		ob.y=ob1.y/ob2.y;
		ob.width=ob1.width/ob2.width;
		ob.height=ob1.height/ob2.height;
		return ob;
	}
	static Rectangle rem(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x;
		ob.y=ob1.y/ob2.y/ob3.y;
		ob.width=ob1.width/ob2.width/ob3.width;
		ob.height=ob1.height/ob2.height/ob3.height;
		return ob;
	}
	static Rectangle rem(Rectangle ob1,Rectangle ob2, Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height;
		return ob;
	}
	static Rectangle rem(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x/ob5.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y/ob5.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width/ob5.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height/ob5.height;
		return ob;
	}
}	
class ReturnType{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(20,15,10,5);
		Rectangle ob2=new Rectangle(200,150,100,50);
		
		Rectangle ob3=Display.add(ob1);
		Rectangle ob4=Display.add(ob1,ob2);
		Rectangle ob5=Display.add(ob1,ob2,ob2);
		Rectangle ob6=Display.add(ob2,ob1,ob2,ob1);
		Rectangle ob7=Display.add(ob1,ob2,ob1,ob2,ob2);
		System.out.println("=======Addition========");
		ob3.show();
		System.out.println("=======================");
		ob4.show();
		System.out.println("=======================");
		ob5.show();
		System.out.println("=======================");
		ob6.show();
		System.out.println("=======================");
		ob7.show();
		System.out.println("=======Subtraction========");
		Rectangle ob8 =Display.sub(ob1);
		Rectangle ob9 =Display.sub(ob1,ob2);
		Rectangle ob10=Display.sub(ob1,ob2,ob2);
		Rectangle ob11=Display.sub(ob2,ob1,ob2,ob1);
		Rectangle ob12=Display.sub(ob1,ob2,ob1,ob2,ob2);
		ob8.show();
		System.out.println("=======================");
		ob9.show();
		System.out.println("=======================");
		ob10.show();
		System.out.println("=======================");
		ob11.show();
		System.out.println("=======================");
		ob12.show();
		System.out.println("=======Multiplication========");
		Rectangle ob13 =Display.mul(ob1);
		Rectangle ob14 =Display.mul(ob1,ob2);
		Rectangle ob15=Display.mul(ob1,ob2,ob2);
		Rectangle ob16=Display.mul(ob2,ob1,ob2,ob1);
		Rectangle ob17=Display.mul(ob1,ob2,ob1,ob2,ob2);
		ob13.show();
		System.out.println("=======================");
		ob14.show();
		System.out.println("=======================");
		ob15.show();
		System.out.println("=======================");
		ob16.show();
		System.out.println("=======================");
		ob17.show();
		System.out.println("=======Division========");
		Rectangle ob18 =Display.div(ob1);
		Rectangle ob19 =Display.div(ob1,ob2);
		Rectangle ob20=Display.div(ob1,ob2,ob2);
		Rectangle ob21=Display.div(ob2,ob1,ob2,ob1);
		Rectangle ob22=Display.div(ob1,ob2,ob1,ob2,ob2);
		ob18.show();
		System.out.println("=======================");
		ob19.show();
		System.out.println("=======================");
		ob20.show();
		System.out.println("=======================");
		ob21.show();
		System.out.println("=======================");
		ob22.show();
		System.out.println("=======Remainder========");
		Rectangle ob23=Display.rem(ob1);
		Rectangle ob24=Display.rem(ob1,ob2);
		Rectangle ob25=Display.rem(ob1,ob2,ob2);
		Rectangle ob26=Display.rem(ob2,ob1,ob2,ob1);
		Rectangle ob27=Display.rem(ob1,ob2,ob1,ob2,ob2);
		ob23.show();
		System.out.println("=======================");
		ob24.show();
		System.out.println("=======================");
		ob25.show();
		System.out.println("=======================");
		ob26.show();
		System.out.println("=======================");
		ob27.show();
	}
}