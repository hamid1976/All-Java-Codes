class Rectangle{
	int x,y,width,height; 
	Rectangle(){}
	Rectangle(int a,int b,int c,int d){
		 x=a;
		 y=b;
		 width=c;
		 height=d;
	}
	Rectangle add(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x;
		ob.y=ob1.y;
		ob.width=ob1.width;
		ob.height=ob1.height;
		return ob;
	}
	Rectangle add(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x;
		ob.y=ob1.y+ob2.y;
		ob.width=ob1.width+ob2.width;
		ob.height=ob1.height+ob2.height;
		return ob;
	}
	Rectangle add(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x;
		ob.y=ob1.y+ob2.y+ob3.y;
		ob.width=ob1.width+ob2.width+ob3.width;
		ob.height=ob1.height+ob2.height+ob3.height;
		return ob;
	}
	Rectangle add(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x+ob4.x;
		ob.y=ob1.y+ob2.y+ob3.y+ob4.y;
		ob.width=ob1.width+ob2.width+ob3.width+ob4.width;
		ob.height=ob1.height+ob2.height+ob3.height+ob4.height;
		return ob;
	}
	Rectangle add(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x+ob2.x+ob3.x+ob4.x+ob5.x;
		ob.y=ob1.y+ob2.y+ob3.y+ob4.y+ob5.y;
		ob.width=ob1.width+ob2.width+ob3.width+ob4.width+ob5.width;
		ob.height=ob1.height+ob2.height+ob3.height+ob4.height+ob5.height;
		return ob;
	}//end add constructor overloading
	Rectangle sub(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x;
		ob.y=ob1.y;
		ob.width=ob1.width;
		ob.height=ob1.height;
		return ob;
	}
	Rectangle sub(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x;
		ob.y=ob1.y-ob2.y;
		ob.width=ob1.width-ob2.width;
		ob.height=ob1.height-ob2.height;
		return ob;
	}
	Rectangle sub(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x;
		ob.y=ob1.y-ob2.y-ob3.y;
		ob.width=ob1.width-ob2.width-ob3.width;
		ob.height=ob1.height-ob2.height-ob3.height;
		return ob;
	}
	Rectangle sub(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x-ob4.x;
		ob.y=ob1.y-ob2.y-ob3.y-ob4.y;
		ob.width=ob1.width-ob2.width-ob3.width-ob4.width;
		ob.height=ob1.height-ob2.height-ob3.height-ob4.height;
		return ob;
	}
	Rectangle sub(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x-ob2.x-ob3.x-ob4.x-ob5.x;
		ob.y=ob1.y-ob2.y-ob3.y-ob4.y-ob5.y;
		ob.width=ob1.width-ob2.width-ob3.width-ob4.width-ob5.width;
		ob.height=ob1.height-ob2.height-ob3.height-ob4.height-ob5.height;
		return ob;
	}//end sub Constructor Overloading
	Rectangle mul(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x;
		ob.y=ob1.y;
		ob.width=ob1.width;
		ob.height=ob1.height;
		return ob;
	}
	Rectangle mul(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x;
		ob.y=ob1.y*ob2.y;
		ob.width=ob1.width*ob2.width;
		ob.height=ob1.height*ob2.height;
		return ob;
	}
	Rectangle mul(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x;
		ob.y=ob1.y*ob2.y*ob3.y;
		ob.width=ob1.width*ob2.width*ob3.width;
		ob.height=ob1.height*ob2.height*ob3.height;
		return ob;
	}
	Rectangle mul(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x*ob4.x;
		ob.y=ob1.y*ob2.y*ob3.y*ob4.y;
		ob.width=ob1.width*ob2.width*ob3.width*ob4.width;
		ob.height=ob1.height*ob2.height*ob3.height*ob4.height;
		return ob;
	}
	Rectangle mul(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x*ob2.x*ob3.x*ob4.x*ob5.x;
		ob.y=ob1.y*ob2.y*ob3.y*ob4.y*ob5.y;
		ob.width=ob1.width*ob2.width*ob3.width*ob4.width*ob5.width;
		ob.height=ob1.height*ob2.height*ob3.height*ob4.height*ob5.height;
		return ob;
	}//end mul Constructor overloading
	Rectangle div(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x;
		ob.y=ob1.y;
		ob.width=ob1.width;
		ob.height=ob1.height;
		return ob;
	}
	Rectangle div(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x;
		ob.y=ob1.y/ob2.y;
		ob.width=ob1.width/ob2.width;
		ob.height=ob1.height/ob2.height;
		return ob;
	}
	Rectangle div(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x;
		ob.y=ob1.y/ob2.y/ob3.y;
		ob.width=ob1.width/ob2.width/ob3.width;
		ob.height=ob1.height/ob2.height/ob3.height;
		return ob;
	}
	Rectangle div(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height;
		return ob;
	}
	Rectangle div(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x/ob2.x/ob3.x/ob4.x/ob5.x;
		ob.y=ob1.y/ob2.y/ob3.y/ob4.y/ob5.y;
		ob.width=ob1.width/ob2.width/ob3.width/ob4.width/ob5.width;
		ob.height=ob1.height/ob2.height/ob3.height/ob4.height/ob5.height;
		return ob;
	}//end div constructor overloading
	Rectangle rem(Rectangle ob1){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x;
		ob.y=ob1.y;
		ob.width=ob1.width;
		ob.height=ob1.height;
		return ob;
	}
	Rectangle rem(Rectangle ob1,Rectangle ob2){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x%ob2.x;
		ob.y=ob1.y%ob2.y;
		ob.width=ob1.width%ob2.width;
		ob.height=ob1.height%ob2.height;
		return ob;
	}
	Rectangle rem(Rectangle ob1,Rectangle ob2,Rectangle ob3){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x%ob2.x%ob3.x;
		ob.y=ob1.y%ob2.y%ob3.y;
		ob.width=ob1.width%ob2.width%ob3.width;
		ob.height=ob1.height%ob2.height%ob3.height;
		return ob;
	}
	Rectangle rem(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x%ob2.x%ob3.x%ob4.x;
		ob.y=ob1.y%ob2.y%ob3.y%ob4.y;
		ob.width=ob1.width%ob2.width%ob3.width%ob4.width;
		ob.height=ob1.height%ob2.height%ob3.height%ob4.height;
		return ob;
	}
	Rectangle rem(Rectangle ob1,Rectangle ob2,Rectangle ob3,Rectangle ob4,Rectangle ob5){
		Rectangle ob=new Rectangle();
		ob.x=ob1.x%ob2.x%ob3.x%ob4.x%ob5.x;
		ob.y=ob1.y%ob2.y%ob3.y%ob4.y%ob5.y;
		ob.width=ob1.width%ob2.width%ob3.width%ob4.width%ob5.width;
		ob.height=ob1.height%ob2.height%ob3.height%ob4.height%ob5.height;
		return ob;
	}//end rem constructor overloading
	void show(){
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}
}
class Testing{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle(20,15,10,5);
		Rectangle ob2=new Rectangle(200,150,100,50);
		Rectangle ob3=new Rectangle(2000,1500,1000,500);
		
	System.out.println("=========Addition=======");
	Rectangle ob4=ob1.add(ob2);
	Rectangle ob5=ob1.add(ob1,ob2);
    Rectangle ob6=ob1.add(ob1,ob2,ob3);
	Rectangle ob7=ob1.add(ob2,ob3,ob3,ob3);
    Rectangle ob8=ob1.add(ob1,ob2,ob3,ob1,ob2);
	ob4.show();
	System.out.println("=========================");
	ob5.show();
	System.out.println("=========================");
	ob6.show();
	System.out.println("=========================");
	ob7.show();
	System.out.println("=========================");
	ob8.show();
	
	System.out.println("=========Subtraction=======");
	Rectangle ob9=ob1.sub(ob2);
	Rectangle ob10=ob1.sub(ob1,ob2);
    Rectangle ob11=ob1.sub(ob1,ob2,ob3);
	Rectangle ob12=ob1.sub(ob2,ob3,ob3,ob3);
    Rectangle ob13=ob1.sub(ob1,ob2,ob3,ob1,ob2);
	ob9.show();
	System.out.println("=========================");
	ob10.show();
	System.out.println("=========================");
	ob11.show();
	System.out.println("=========================");
	ob12.show();
	System.out.println("=========================");
	ob13.show();
	
	System.out.println("=========Multiplication=======");
	Rectangle ob14=ob1.mul(ob2);
	Rectangle ob15=ob1.mul(ob1,ob2);
    Rectangle ob16=ob1.mul(ob1,ob2,ob3);
	Rectangle ob17=ob1.mul(ob2,ob3,ob3,ob3);
    Rectangle ob18=ob1.mul(ob1,ob2,ob3,ob1,ob2);
	ob14.show();
	System.out.println("=========================");
	ob15.show();
	System.out.println("=========================");
	ob16.show();
	System.out.println("=========================");
	ob17.show();
	System.out.println("=========================");
	ob18.show();
	
	System.out.println("=========Division=======");
	Rectangle ob24=ob1.div(ob2);
	Rectangle ob25=ob1.div(ob1,ob2);
    Rectangle ob26=ob1.div(ob1,ob2,ob3);
	Rectangle ob27=ob1.div(ob2,ob3,ob3,ob3);
    Rectangle ob28=ob1.div(ob1,ob2,ob3,ob1,ob2);
	ob24.show();
	System.out.println("=========================");
	ob25.show();
	System.out.println("=========================");
	ob26.show();
	System.out.println("=========================");
	ob27.show();
	System.out.println("=========================");
	ob28.show();
	
	System.out.println("=========Remainder=======");
	Rectangle ob34=ob1.rem(ob2);
	Rectangle ob35=ob1.rem(ob1,ob2);
    Rectangle ob36=ob1.rem(ob1,ob2,ob3);
	Rectangle ob37=ob1.rem(ob2,ob3,ob3,ob3);
    Rectangle ob38=ob1.rem(ob1,ob2,ob3,ob1,ob2);
	ob34.show();
	System.out.println("=========================");
	ob35.show();
	System.out.println("=========================");
	ob36.show();
	System.out.println("=========================");
	ob37.show();
	System.out.println("=========================");
	ob38.show();
	}
}