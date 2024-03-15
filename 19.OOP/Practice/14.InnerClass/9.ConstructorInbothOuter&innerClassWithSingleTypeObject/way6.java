class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	class Rectangle{
		int width;
		int height;
		Rectangle(int a,int b){
			width=a;
			height=b;
		}
		void display(){
			System.out.println("Feet="+feet);
			System.out.println("Inch="+inch);
			System.out.println("Width="+width);
			System.out.println("Height="+height);
		}
	}
}
class way6{
	public static void main(String arg[]){
		Box.Rectangle ob=new Box(10,20).new Rectangle(100,200);
		ob.display();
	}
}