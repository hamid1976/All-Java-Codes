class Box{
	int feet;
	int inch;
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
			 System.out.println("===============");
		}
	}//end static Inner Class
}//end outer class	 
class StaticInnerClass{
	public static void main(String arg[]){
		//Box out=new Box(10,20);
		Box.Rectangle r1=new Box.Rectangle(10,20,30,40);
		Box.Rectangle r2=new Box.Rectangle(1000,2000,3000,4000);
		
		r1.display();
		r2.display();
	
	}
}
		