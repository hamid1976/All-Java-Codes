abstract class Vehical{
	abstract void name();
	abstract void engine();
	abstract void seat();
	abstract void tyre();
	void color(){
		System.out.println("White");
	}
	void gear(){
		System.out.println("6 - Gear");
	}
}
class Car extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nCar");
	}
	void engine(){//must Override abstract method
		System.out.println("1300");
	}
	void seat(){//must Override abstract method
		System.out.println("4 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("4 - Tyre");
	}
}
class Bus extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nBus");
	}
	void engine(){//must Override abstract method
		System.out.println("5600");
	}
	void seat(){//must Override abstract method
		System.out.println("45 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("6 - Tyre");
	}
	void gear(){
		System.out.println("8 - Gear");
	}
}
class Truck extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nTruck");
	}
	void engine(){//must Override abstract method
		System.out.println("5600");
	}
	void seat(){//must Override abstract method
		System.out.println("2 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("6 - Tyre");
	}
	void gear(){
		System.out.println("8 - Gear");
	}
}
class Jeep extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nJeep");
	}
	void engine(){//must Override abstract method
		System.out.println("1998 cc");
	}
	void seat(){//must Override abstract method
		System.out.println("4 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("4 - Tyre");
	}
	void color(){
		System.out.println("Blue");
	}
	void gear(){
		System.out.println("6 - Gear");
	}
}
class Bike extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nBike");
	}
	void engine(){//must Override abstract method
		System.out.println("600 cc");
	}
	void seat(){//must Override abstract method
		System.out.println("1- Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("2 - Tyre");
	}
	void color(){
		System.out.println("Red and Black");
	}
	void gear(){
		System.out.println("5 - Gear");
	}
}
class Tractor extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nTractor");
	}
	void engine(){//must Override abstract method
		System.out.println("2300");
	}
	void seat(){//must Override abstract method
		System.out.println("1 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("4 - Tyre");
	}
	void gear(){
		System.out.println("8 - Gear");
	}
}
class Trailor extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nTrailor");
	}
	void engine(){//must Override abstract method
		System.out.println("5600");
	}
	void seat(){//must Override abstract method
		System.out.println("2 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("22 - Tyre");
	}
	void gear(){
		System.out.println("8 - Gear");
	}
}
class Raksha extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nRakshaw");
	}
	void engine(){//must Override abstract method
		System.out.println("200");
	}
	void seat(){//must Override abstract method
		System.out.println("3 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("3 - Tyre");
	}
	void gear(){
		System.out.println("5 - Gear");
	}
}
class Ven extends Vehical{
	void name(){//must Override abstract method
		System.out.println("\nVen");
	}
	void engine(){//must Override abstract method
		System.out.println("2700");
	}
	void seat(){//must Override abstract method
		System.out.println("18 - Seats");
	}
	void tyre(){//must Override abstract method
		System.out.println("4 - Tyre");
	}
	
}
class Display{
	static void show(Vehical v){
		v.name();
		v.engine();
		v.seat();
		v.tyre();
		v.color();
		v.gear();
	}
}
class Test{
	public static void main(String arg[]){
		Car c=new Car();
		Bus b=new Bus();
		Truck t=new Truck();
		Jeep j=new Jeep();
		Bike bi=new Bike();
		Tractor tt=new Tractor();
		Trailor tr=new Trailor();
		Raksha r=new Raksha();
		Ven v=new Ven();
		
		Display.show(c);
		Display.show(b);
		Display.show(t);
		Display.show(j);
		Display.show(bi);
		Display.show(tt);
		Display.show(tr);
		Display.show(r);
		Display.show(v);
		
	}
}