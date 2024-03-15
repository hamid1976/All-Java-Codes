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
	void display(){
	    System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("Width="+width);
		System.out.println("Height="+height);
	}
	void add(){
		System.out.println("x+y="+(x+y));
		System.out.println("Width + Height ="+(width+height));
	}
}

class TestObject{
	public static void main(String arg[]){
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		
		ob1.set(10,20,30,40);
		ob2 .set(100,200,300,400);
		
	    ob1.display();
		ob2.display();
		
		ob1.add();
		ob2.add();
     }
}