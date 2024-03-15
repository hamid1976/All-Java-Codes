class Box{
	int feet;
	int inch;
	Box(int a, int b){
	feet=a;
	inch=b;
	}
	void show(){
		System.out.println(feet);
		System.out.println(inch);
	}
}
class FinalKeyword_1{
	public static void main(String arg[]){
	final	Box ob1=new Box(100,200);
		ob.feet=50;
		ob.inch=60;
		ob.show();
	}
}