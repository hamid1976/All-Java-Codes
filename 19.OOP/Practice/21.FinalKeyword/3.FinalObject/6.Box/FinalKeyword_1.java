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
			Box ob2=new Box(1000,2000);
			
			//ob1=ob2;//error :cant assign values to ob1
			
			System.out.println(ob1.feet);//100
			System.out.println(ob1.inch);//200
			
			System.out.println(ob2.feet);//1000
			System.out.println(ob2.inch);//2000
			
			ob2.feet+=100;
			ob2.inch+=100;
			
			System.out.println(ob2.feet);
			System.out.println(ob2.inch);
			
	}
}