class Box{
	int feet;
	int inch;
	Box(){}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	//Rectangle r1 = new Rectangle(12,13);
	class Rectangle{
		int width,height;
		Rectangle(int w,int h){
			width=w;
			height=h;
		}
		Rectangle(){
			
		}
		void display(){
			
			System.out.println(width);
			System.out.println(height);
		}
	}
	
}


class test2{
	public static void main(String arg []){
		Box.Rectangle ob1 =new Box(12,13).new Rectangle(12,12);
		//ob1.new Rectangle(12,20);
		//Box.Rectangle ob =ob1.new Rectangle(10,20);
	//Rectangle ob2=new Rectangle(12,20);
		ob1.display();
	}
}