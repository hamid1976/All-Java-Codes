class Box{
	void add(int a,int b){
		System.out.println("Addition="+(a+b));
	}
	void add(int a,int b,int c){
			System.out.println("Addition="+(a+b+c));
	}
	void add(double a,int b){
			System.out.println("Addition="+(a+b));
	}
	void add(int a,double b){
			System.out.println("Addition="+(a+b));
	}
}
class MethodOverloading{
	public static void main(String arg[]){
		Box ob=new Box();
		ob.add(10,20);
		ob.add(20,10,30);
		ob.add(10.2,30);
		ob.add(30,10.2);
		
	}
}