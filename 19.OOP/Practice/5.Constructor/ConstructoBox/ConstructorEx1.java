class Box{
	int feet,inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("Feet="+feet);
		System.out.println("inch="+inch);
	}
}
class ConstructorEx1{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		
		ob1.show();
		ob2.show();                                                             
	}
}