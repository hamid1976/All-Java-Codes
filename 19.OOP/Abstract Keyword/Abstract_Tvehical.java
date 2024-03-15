abstract class Vehical{
	abstract void name();
    abstract void engine();
	abstract void seats();
	abstract void tyre();
	abstract void gear();
}
class Car extends Vehical{
	
	void name(){
		System.out.println("\nBus");
	}
	void engine(){
		System.out.println("1000 CC");
	}
	void seats(){
		System.out.println("4-seats");
	}
	void tyre(){
		System.out.println("4-tyres");
	}
	void gear(){
		System.out.println("8-gear");
	}
}
class Truck extends Vehical{
	void name(){
		System.out.println("\nTruck");
	}
	void engine(){
		System.out.println("5600");
	}
	void seats(){
		System.out.println("4-seats");
	}
	void tyre(){
		System.out.println("6-tyres");
	}
	void gear(){
		System.out.println("10-gear");
	}
}
class Bike extends Vehical{
	void name(){
		System.out.println("\nBike");
	}
	void engine(){
		System.out.println("70CC");
	}
	void seats(){
		System.out.println("2-Seats");
	}
	void tyre(){
		System.out.println("2-tyre");
	}
	void gear(){
		System.out.println("4-gear");
	}
}
class Jeep extends Vehical{
	void name(){
		System.out.println("\nJeep");
	}
	void engine(){
		System.out.println("1100-CC");
	}
	void seats(){
		System.out.println("2-Seats");
	}
	void tyre(){
		System.out.println("4-tyre");
	}
	void gear(){
		System.out.println("4-gear");
	}
}
class Ven extends Vehical{
	void name(){
		System.out.println("\nVen");
	}
	void engine(){
		System.out.println("796-CC");
	}
	void seats(){
		System.out.println("18-Seats");
	}
	void tyre(){
		System.out.println("4-tyre");
	}
	void gear(){
		System.out.println("4-gear");
	}
}
class Display{
	static void show(Vehical a){
		
		a.name();
		a.engine();
		a.seats();
		a.tyre();
		a.gear();
	}
}
class Abstract_Tvehical{
      public static void main(String arg[]){
		  Car c=new Car();
		  Truck t=new Truck();
		  Bike b=new Bike();
		  Jeep j=new Jeep();
		  Ven v=new Ven();
		  
		  Display.show(c);
		  Display.show(t);
		  Display.show(b);
		  Display.show(j);
		  Display.show(v);
		  
	  }
}