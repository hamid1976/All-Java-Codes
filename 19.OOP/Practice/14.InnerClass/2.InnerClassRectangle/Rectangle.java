class Outer{
    int x;
	int y;
	int width;
	int height;
	Outer(int a,int b,int c, int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	class Inner{
		void display(){
			System.out.println("X+Y+WIDTH+HEIGHT="+(x+y+width+height));
		}
	}//end Inner class
}//end outer class
class Rectangle{
	public static void main(String arg[]){
		Outer out1=new Outer(20,15,10,5);
		Outer out2=new Outer(200,150,100,50);
		
		Outer.Inner inner1=out1.new Inner();
		Outer.Inner inner2=out2.new Inner();
		
		inner1.display();
		inner2.display();
	}
}