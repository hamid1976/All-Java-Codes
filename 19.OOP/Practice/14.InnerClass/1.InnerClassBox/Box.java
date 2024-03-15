class Outer{
	int feet;
	int inch;
	Outer(int a,int b){
		feet=a;
		inch=b;
	}
	class Inner{
		void display(){
			System.out.println("Feet+inch="+(feet+inch));
		}
	}//end Inner class
}//end outer class
class Box{
	public static void main(String arg[]){
	Outer out1=new Outer(10,5);
	// Outer out2=new Outer(100,50);
	// Outer out3=new Outer(1000,500);
	// Outer out4=new Outer(100000,50000);
	
	Outer.Inner inner1=new Outer.Inner();
//	Outer.Inner inner2=new Inner();
	
	inner1.display();
	inner2.display();
   }
}