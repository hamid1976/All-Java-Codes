class Vehical{
	void Tyres(){
		System.out.println("Four Tyres");
	}
	void seats(){
		System.out.println("Five seats");
	}
	void engins(){
		System.out.println("engins");
	}
}
class Car extends Vehical{
	void engins(){
		System.out.println("'Inline or Straight' engins car have");
	}
}
class Bus extends Vehical{
	void Tyres(){
	    System.out.println("\nMost commonly have 6 tyres");
	}
	void seats(){
		System.out.println(" Bus Have 55 seats");
	}
	void engins(){
		System.out.println("Diesel engines are used in buses");
	}
}
class Ven extends Vehical{
	void seats(){
		System.out.println("\nven have 18 seats");
	}
	void engins(){
		System.out.println("2.8 litre 105 Hp (74 kW), Euro 2 Engine");
	}
}
class Trucks extends Vehical{
	 void Tyres(){
		 System.out.println("\n14 Tyres common");
	 }
	 void seats(){
		 System.out.println("Trucks have Three seats commonly");
	 }
	 void engins(){
		System.out.println("Trucks have combustion engines");
	 }
}
class Bike extends  Vehical{
	void Tyres(){
		 System.out.println("\nTwo Tyres");
	 }
	 void seats(){
		 System.out.println("one seats");
	 }
	 void engins(){
		System.out.println("Four stroke engine in honda CD 70");
	 }
}
class Display{
	static void show(Vehical v){
		v.Tyres();
        v.seats();
        v.engins();
	}
}
class Test_Generalization_Vehicles{
	public static void main(String arg[]){
		Car c=new Car();
		Bus bs=new Bus();
		Ven v=new Ven();
		Trucks t=new Trucks();
    	Bike b=new Bike();

        Display.show(c);
		Display.show(bs);
		Display.show(v);
		Display.show(t);
		Display.show(b);
	}
}