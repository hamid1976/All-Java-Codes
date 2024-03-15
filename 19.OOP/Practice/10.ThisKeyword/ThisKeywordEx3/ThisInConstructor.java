class Box{
	int feet;
	int inch;
	Box(int feet,int inch){
		this.feet=feet;
		this.inch=inch;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class ThisInConstructor{
	public static void main(String arg[]){
		Box ob=new Box(10,20);
		Box ob1=new Box(30,20);
		
		ob.show();
		ob1.show();
	}
}