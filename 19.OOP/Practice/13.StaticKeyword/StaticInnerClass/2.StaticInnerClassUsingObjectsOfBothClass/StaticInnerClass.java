class Box{
	static int counter;
	int feet;
	int inch;
	static{
		counter=1000;
	}
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
    static class Rectangle{
		int x;
		int y;
		int width;
		int height;
		Rectangle(int a,int b,int c,int d){
			this.x=a;
			this.y=b;
			this.width=c;
			this.height=d;
		}
		 void display(){
			 System.out.println("X="+x);
			 System.out.println("Y="+y);
			 System.out.println("Width="+width);
			 System.out.println("Height="+height);
			 
			 System.out.println("Counter="+counter);
			 System.out.println("===============");
		}
	}//end static Inner Class
}//end outer class	 
class StaticInnerClass{
	public static void main(String arg[]){
		Box ob1=new Box(10,20);
		Box ob2=new Box(100,200);

		
		Box.Rectangle r1=new Box.Rectangle(10,20,30,40);
		Box.Rectangle r2=new Box.Rectangle(1000,2000,3000,4000);
		
		r1.display();
		r2.display();
		ob1.show();
		ob2.show();
		System.out.println("Counter="+Box.counter);
	}
}
		