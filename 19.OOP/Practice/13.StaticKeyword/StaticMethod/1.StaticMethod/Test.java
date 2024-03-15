class Test{
	int feet;
	int inch;
	void Box(int a,int b){
		feet=a;
		inch=b;
	}
	static void add(Test ob){
		System.out.println("Feet:"+ob.feet);
		System.out.println("Inch:"+ob.inch);
	}
	public static void main(String arg[]){
		Test ob=new Test();
		ob.Box(10,20);
		add(ob);
	}
}