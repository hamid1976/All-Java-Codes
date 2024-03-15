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
	final	Box ob=new Box(10,5);
		ob.show();
		ob.feet=50;
		ob.inch=60;
		ob.show();
	}
}