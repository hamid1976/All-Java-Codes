class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	Inner ob=new Inner(100,200,300,400);
	Inner ob1=new Inner(1000,2000,3000,4000);
	class Inner{
		int x;
		int y;
		int width;
		int height;
		Inner(int a,int b,int c,int d){
			x=a;
			y=b;
			width=c;
			height=d;
		}
		void display(){
			System.out.println("X="+x);
			System.out.println("Y="+y);
			System.out.println("Width="+width);
			System.out.println("Height="+height);
		}
	}
}
class Way5{
	public static void main(String arg[]){
		Box out1=new Box(10,5);
		Box out2=new Box(20,50);
		
		out1.ob.display();
		System.out.println("----------------");
		out1.ob1.display();
		System.out.println("----------------");
		out2.ob.display();
		System.out.println("----------------");
		out2.ob1.display();
		
	}
}