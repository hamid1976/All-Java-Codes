class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	Inner in1=new Inner(1000,2000);
	Inner in2=new Inner(3000,4000);
	class Inner{
		int width;
		int height;
		Inner(int a,int b){
			width=a;
			height=b;
		}
		void display(){
			System.out.println("Feet="+feet);
			System.out.println("Inch="+inch);
			System.out.println("Width="+width);
			System.out.println("Height"+height);
		}
	}//end inner class
}//end outer class			
class NestedClass{
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
	