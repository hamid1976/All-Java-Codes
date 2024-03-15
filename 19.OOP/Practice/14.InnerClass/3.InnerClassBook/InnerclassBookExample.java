class Outer{
	int outer=10;
	void test(){
		Inner inner=new Inner();
		inner.display();
	}
	class Inner{
		void display(){
			System.out.println("Display Outer:"+outer);
		}
	}//end inner class
}//end outer class
class InnerclassBookExample{
	public static void main(String arg[]){
		Outer out=new Outer();
		out.test();
	}
}