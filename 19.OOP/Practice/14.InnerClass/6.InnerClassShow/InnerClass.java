class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		Inner inner=new Inner();
		inner.display();
	}
	class Inner{
		void display(){
			System.out.println("Feet+Inch="+(feet+inch));
		}
	}//end inner class
}//end outer class
class InnerClass{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		
		ob1.show();
		ob2.show();
	}
}