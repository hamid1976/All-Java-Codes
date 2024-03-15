class Box{
	int feet;
	int inch;
	Box(int a,int b){
		feet=a;
		inch=b;
	}
	void show(){
		System.out.println("=====SHOW METHOD=====");
		System.out.println("=====ADDITION=====");
		Display.add(this);
		Display.add(this,this);
		Display.add(this,this,this);
		System.out.println("=====SUBTRACTION====");
		Display.sub(this);
		Display.sub(this,this);
		Display.sub(this,this,this);
		System.out.println("======MULTIPLICATION======");
		Display.mul(this);
		Display.mul(this,this);
		Display.mul(this,this,this);
		System.out.println("=====DIVISION====");
		Display.div(this);
		Display.div(this,this);
		Display.div(this,this,this);
		System.out.println("======REMAINDER=====");
		Display.rem(this);
		Display.rem(this,this);
		Display.rem(this,this,this);
	}
}
class Display{
	static void add(Box ob1){
		System.out.println("Addition="+(ob1.feet+ob1.inch));
	}
	static void add(Box ob1,Box ob2){
		System.out.println("Addition="+(ob1.feet+ob1.feet));
		System.out.println("Addition="+(ob2.inch+ob2.inch));
	}
	static void add(Box ob1, Box ob2,Box ob3){
		System.out.println("Addition="+(ob1.feet+ob2.feet+ob3.feet));
		System.out.println("Addition="+(ob1.inch+ob2.inch+ob3.inch));
	}
	static void sub(Box ob1){
		System.out.println("Subtraction="+(ob1.feet-ob1.inch));
	}
	static void sub(Box ob1,Box ob2){
		System.out.println("Subtraction="+(ob1.feet-ob1.feet));
		System.out.println("Subtraction="+(ob2.inch-ob2.inch));
	}
	static void sub(Box ob1, Box ob2,Box ob3){
		System.out.println("Subtraction="+(ob1.feet-ob2.feet-ob3.feet));
		System.out.println("Subtraction="+(ob1.inch-ob2.inch-ob3.inch));
	}
	static void mul(Box ob1){
		System.out.println("Multiplication="+(ob1.feet*ob1.inch));
	}
	static void mul(Box ob1,Box ob2){
		System.out.println("Multiplication="+(ob1.feet*ob1.feet));
		System.out.println("Multiplication="+(ob2.inch*ob2.inch));
	}
	static void mul(Box ob1, Box ob2,Box ob3){
		System.out.println("Multiplication="+(ob1.feet*ob2.feet*ob3.feet));
		System.out.println("Multiplication="+(ob1.inch*ob2.inch*ob3.inch));
	}
	static void div(Box ob1){
		System.out.println("Division="+(ob1.feet/ob1.inch));
	}
	static void div(Box ob1,Box ob2){
		System.out.println("Division="+(ob1.feet/ob1.feet));
		System.out.println("Division="+(ob2.inch/ob2.inch));
	}
	static void div(Box ob1, Box ob2,Box ob3){
		System.out.println("Division="+(ob1.feet/ob2.feet/ob3.feet));
		System.out.println("Division="+(ob1.inch/ob2.inch/ob3.inch));
	}
	static void rem(Box ob1){
		System.out.println("Remainder="+(ob1.feet%ob1.inch));
	}
	static void rem(Box ob1,Box ob2){
		System.out.println("Remainder="+(ob1.feet%ob1.feet));
		System.out.println("Remainder="+(ob2.inch%ob2.inch));
	}
	static void rem(Box ob1, Box ob2,Box ob3){
		System.out.println("Remainder="+(ob1.feet%ob2.feet%ob3.feet));
		System.out.println("Remainder="+(ob1.inch%ob2.inch%ob3.inch));
	}
	
}
class StaticConstructor_OverloadingThisBox{
	public static void main(String arg[]){
		Box ob1=new Box(10,20);
		Box ob2=new Box(200,100);
		System.out.println("====ADDITION=====");
		Display.add(ob1);
		System.out.println("==============");
		Display.add(ob1,ob2);
		System.out.println("==============");
		Display.add(ob1,ob2,ob2);
		
		System.out.println("=====SUBTRACTION====");
		Display.sub(ob1);
		System.out.println("==============");
		Display.sub(ob1,ob2);
		System.out.println("==============");
		Display.sub(ob1,ob2,ob2);
		
		System.out.println("=====MULTIPLICATION======");
		Display.mul(ob1);
		System.out.println("==============");
		Display.mul(ob1,ob2);
		System.out.println("==============");
		Display.mul(ob1,ob2,ob2);
		
		System.out.println("=====DIVISION====");
		Display.div(ob1);
		System.out.println("==============");
		Display.div(ob1,ob2);
		System.out.println("==============");
		Display.div(ob1,ob2,ob2);
		
		System.out.println("=====REMAINDER======");
		Display.rem(ob1);
		System.out.println("==============");
		Display.rem(ob1,ob2);
		System.out.println("==============");
		Display.rem(ob1,ob2,ob2);
		
		ob1.show();
		ob2.show();
	
	}
}