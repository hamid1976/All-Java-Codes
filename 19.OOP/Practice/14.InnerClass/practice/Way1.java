class Outer{
	int feet;
	static int inch;
	Outer(int a,int b){
		feet=a;
		inch=b;
	}
	class Inner{
		void display(){
			System.out.println("Feet="+feet);
			System.out.println("Inch="+inch);
		}
	}
}
class Way1{
	public static void main(String arg[]){
		Outer out1=new Outer(10,5);
		Outer out2=new Outer(100,50);
		
		Outer.Inner inner1=out1.new Inner();
		Outer.Inner inner2=out2.new Inner();

		inner1.display();
		inner2.display();
	}
}