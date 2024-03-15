class Outer{
	int feet;
	int inch;
	Outer(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
			Inner ob=new Inner();
	        ob.display();
		}
	
	class Inner{
		void display(){
			System.out.println("Outer ="+feet);
			System.out.println("Inch ="+inch);
		}
	}
}
class Way4{
	public static void main(String arg[]){
		Outer out=new Outer(10,5);
		out.show();
	}
}