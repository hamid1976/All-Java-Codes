class Box{
	int feet;
	int inch;
    Box(int a,int b){
		feet=a;
		inch=b;
	}
}
class Display{
	static void add(Box ob){
		System.out.println("Addition="+(ob.feet+ob.inch));
    }
	static void sub(Box ob){
		System.out.println("Subtraction="+(ob.feet+ob.inch));
    }
	static void mul(Box ob){
		System.out.println("Multiplication="+(ob.feet+ob.inch));
    }
	static void div(Box ob){
		System.out.println("Division="+(ob.feet+ob.inch));
    }
	static void rem(Box ob){
		System.out.println("Remainder="+(ob.feet+ob.inch));
    }
}
class ObjPassArgBox{
	public static void main(String arg[]){
		Box ob1=new Box(10,5);
		Display.add(ob1);
		Display.sub(ob1);
		Display.mul(ob1);
		Display.div(ob1);
		Display.rem(ob1);
		System.out.println("=========================");
		
		Box ob2=new Box(100,50);
		Display.add(ob2);
		Display.sub(ob2);
		Display.mul(ob2);
	    Display.div(ob2);
        Display.rem(ob2);
	}
}
