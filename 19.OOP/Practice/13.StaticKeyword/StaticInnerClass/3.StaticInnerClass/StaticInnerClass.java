class Rectangle{
	int x;
	int y;
	int width;
	int height;
	Rectangle(int a,int b,int c,int d){
		x=a;
		y=b;
		width=c;
		height=d;
	}
	void show(){
			 System.out.println("X="+x);
			 System.out.println("Y="+y);
			 System.out.println("Width="+width);
             System.out.println("Height="+height);
			 System.out.println("===============");			 
			 }
			 static class Box{
				 int feet;
				 int inch;
				 Box(int a,int b){
					 feet=a;
					 inch=b;
				 }
				 void display(){
					 System.out.println("Feet="+feet);
					 System.out.println("Inch="+inch);
					 System.out.println("===============");
				 }
			 }//end static class Box
}//end outer class Rectangle
class StaticInnerClass{
	public static void main(String arg[]){
		Rectangle r1=new Rectangle(10,20,30,40);
		Rectangle r2=new Rectangle(100,200,300,400);
		
		Rectangle.Box ob1=new Rectangle.Box(10,20);
		Rectangle.Box ob2=new Rectangle.Box(100,200);
		
		ob1.display();
		ob2.display();
		
		r1.show();
		r2.show();
	}
}