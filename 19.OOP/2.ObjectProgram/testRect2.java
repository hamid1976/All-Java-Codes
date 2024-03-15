class Rectangle{
	int x;
	int y;
	int width;
	int height;
	
	void set(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
}

class testRect2{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		
		ob1.x=10;
		ob1.y=20;
		ob1.width=30;
		ob1.height=40;
		
		ob2.x=100;
		ob2.y=200;
		ob2.width=300;
		ob2.height=400;
		
		System.out.println(ob1.x+ob2.x);
		System.out.println(ob1.y+ob2.y);
		System.out.println(ob1.width+ob2.width);
		System.out.println(ob1.height+ob2.height);
		//ob1.show();
		//ob2.show();
     }
}