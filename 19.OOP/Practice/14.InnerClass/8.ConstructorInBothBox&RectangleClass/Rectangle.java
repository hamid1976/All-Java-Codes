class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	Inner in1=new Inner(1000,2000,3000,4000);
	Inner in2=new Inner(5000,6000,7000,8000);
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
			System.out.println("Feet="+feet);
			System.out.println("Inch="+inch);
			System.out.println("X="+x);
			System.out.println("Y="+y);
			System.out.println("Width="+width);
			System.out.println("Height"+height);
		}
	}//end inner class
}//end outer class			
class Rectangle{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		
		ob1.in1.display();
		ob1.in2.display();
		System.out.println("=======object two======");
        ob2.in1.display();
		ob2.in2.display();
	}
}
	