class Outer{
	int outer=10;
	void test(){
		Inner inner=new Inner();
		inner.display();
	}
	class Inner{
		int y=20;
		void display(){
			System.out.println("Display Outer:"+outer);
		}
	}//end inner class
	void show(){
		System.out.println(y);
	}
}//end outer class
class InnerclassWrongProgram{
	public static void main(String arg[]){
		Outer out=new Outer();
		out.test();
		out.show();
	}
	
}