class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void add(){
		System.out.println("Addition="+(feet+inch));
	}
	void add(Box ob){
		System.out.println("Addition="+(feet+ob.feet));
		System.out.println("Addition="+(inch+ob.inch));
	}
	void add(Box ob1,Box ob2){
	    System.out.println("Addition="+(feet+ob1.feet+ob2.feet));
		System.out.println("Addition="+(inch+ob2.inch+ob2.inch));
	}
	void sub(){
		System.out.println("Subtraction="+(feet-inch));
	}
	void sub(Box ob){
		System.out.println("Subtraction="+(feet-ob.feet));
		System.out.println("Subtraction="+(inch-ob.inch));
	}
	void sub(Box ob1,Box ob2){
	    System.out.println("Subtraction="+(feet-ob1.feet-ob2.feet));
		System.out.println("Subtraction="+(inch-ob2.inch-ob2.inch));
	}
	void mul(){
		System.out.println("Multiplication="+(feet*inch));
	}
	void mul(Box ob){
		System.out.println("Multiplication="+(feet*ob.feet));
		System.out.println("Multiplication="+(inch*ob.inch));
	}
	void mul(Box ob1,Box ob2){
	    System.out.println("Multiplication="+(feet*ob1.feet*ob2.feet));
		System.out.println("Multiplication="+(inch*ob2.inch*ob2.inch));
	}
	void div(){
		System.out.println("Division="+(feet/inch));
	}
	void div(Box ob){
		System.out.println("Division="+(feet/ob.feet));
		System.out.println("Division="+(inch/ob.inch));
	}
	void div(Box ob1,Box ob2){
	    System.out.println("Division="+(feet/ob1.feet/ob2.feet));
		System.out.println("Division="+(inch/ob2.inch/ob2.inch));
	}
	void rem(){
		System.out.println("Remainder="+(feet%inch));
	}
	void rem(Box ob){
		System.out.println("Remainder="+(feet%ob.feet));
		System.out.println("Remainder="+(inch%ob.inch));
	}
	void rem(Box ob1,Box ob2){
	    System.out.println("Remainder="+(feet%ob1.feet%ob2.feet));
		System.out.println("Remainder="+(inch%ob2.inch%ob2.inch));
	}
}
class ObjPassArgOverloadingBox1{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Box ob2=new Box(100,50);
		Box ob3=new Box(1000,500);
		
		System.out.println("======Without Argument=======");
		ob1.add();
		ob2.add();
		ob3.add();
		System.out.println("======Single Argument======");
		ob1.add(ob2);
		ob2.add(ob2);
		ob3.add(ob1);
		System.out.println("======Double Argument========");
		ob3.add(ob1,ob2);
		ob1.add(ob1,ob1);
		
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.sub();
		ob2.sub();
		ob3.sub();
		System.out.println("======Single Argument======");
		ob1.sub(ob2);
		ob2.sub(ob2);
		ob3.sub(ob1);
	    System.out.println("======Double Argument========");
		ob3.sub(ob1,ob2);
		ob1.sub(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.mul();
		ob2.mul();
		ob3.mul();
		System.out.println("======Single Argument======");
		ob1.mul(ob2);
		ob2.mul(ob2);
		ob3.mul(ob1);
	    System.out.println("======Double Argument========");
		ob3.mul(ob1,ob2);
		ob1.mul(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.div();
		ob2.div();
		ob3.div();
		System.out.println("======Single Argument======");
		ob1.div(ob2);
		ob2.div(ob2);
		ob3.div(ob1);
		System.out.println("======Double Argument========");
		ob3.div(ob1,ob2);
		ob1.div(ob1,ob1);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Without Argument=======");
		ob1.rem();
		ob2.rem();
		ob3.rem();
		System.out.println("======Single Argument======");
		ob1.rem(ob2);
		ob2.rem(ob2);
		ob3.rem(ob1);
		System.out.println("======Double Argument========");
		ob3.rem(ob1,ob2);
		ob1.rem(ob1,ob1);
		System.out.println("=========================");

		
	
	}
}
		