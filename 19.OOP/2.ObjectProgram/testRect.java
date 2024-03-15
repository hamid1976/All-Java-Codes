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
	void show(){
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}
}

class testRect{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		
		ob1.set(10,20,200,300);
		ob2.set(20,40,600,400);
		
		ob1.show();
		ob2.show();
     }
}