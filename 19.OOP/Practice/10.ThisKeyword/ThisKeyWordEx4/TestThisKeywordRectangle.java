class Box{
	int x,y,width,height;
	Box(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
		Display.add(this);
		Display.mul(this);
	}
}
	class Display{
		static void add(Box ob){
			System.out.println("Addition="+(ob.x+ob.y+ob.width+ob.height));
		}
		static void mul(Box ob){
			System.out.println("Multiplication="+(ob.x*ob.y*ob.width*ob.height));
		}
	}
	class TestThisKeywordRectangle{
		public static void main(String arg[]){
			Box ob1=new Box(20,15,10,5);
			Box ob2=new Box(200,150,100,50);
			Box ob3=new Box(00,50,00,10);
			
			ob1.show();
			ob2.show();
			ob3.show();
		}
	}
			