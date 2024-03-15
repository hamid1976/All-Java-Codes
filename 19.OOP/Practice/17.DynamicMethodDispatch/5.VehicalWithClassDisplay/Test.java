class Vehical{
	void engin(){
		System.out.println("1300 cc");
	}
	void tyre(){
		System.out.println("4 - Tyre");
	}
	void gear(){
		System.out.println("6 - gear");
	}
	void color(){
		System.out.println("White Silver");
	}
	void seat(){
		System.out.println("5 - Seats");
	}
}
class Car extends Vehical{
	void engin(){
		System.out.println("2700 cc");
	}
	void seat(){
		System.out.println("7 - Seater");
	}
}
class Bus extends Vehical{
	void engin(){
		System.out.println("5600 cc");
	}
	void seat(){
		System.out.println("45 - Seater");
	}
	void tyre(){
		System.out.println("6 - Tyre");
	}
	void gear(){
		System.out.println("8 - Gear");
	}
}
class Display{
	static void show(Vehical v){
		v.engin();
		v.tyre();
		v.gear();
		v.color();
		v.seat();
	}
}
class Test{
	public static void main(String arg[]){
		Car cat=new Car();
		Bus bus=new Bus();
		
		Display.show(cat);
		System.out.println("=================");
		Display.show(bus);
		
	}
}
	
		