class Box{
	int feet;
	int inch;
	void set(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class testbox{
	public static void main(String arg[]){
		Box ob1=new Box();
		Box ob2=new Box();
		
		ob1.set(10,20);
		ob2.set(100,50);
		
		ob1.show();
		ob2.show();
	}
}