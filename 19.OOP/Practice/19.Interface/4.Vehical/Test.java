interface Vehical{
	void name();//by default all methods are public abstract
	void engine();//by default all methods are public abstract
	void seat();//by default all methods are public abstract
	void tyre();//by default all methods are public abstract
	void color();//by default all methods are public abstract
	void gear();//by default all methods are public abstract
}
class Car implements Vehical{
	public void name(){//must Override  
		System.out.println("\nCar");
	}
	public void engine(){//must Override 
		System.out.println("1300");
	}
	public void seat(){//must Override 
		System.out.println("4 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("4 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("White");
	}
	public void gear(){//must Override 
		System.out.println("6 - Gear");
	}
}
class Bus implements Vehical{
	public void name(){//must Override 
		System.out.println("\nBus");
	}
	public void engine(){//must Override 
		System.out.println("5600");
	}
	public void seat(){//must Override 
		System.out.println("45 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("6 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Orange");
	}
	public void gear(){//must Override 
		System.out.println("8 - Gear");
	}
}
class Truck implements Vehical{
	public void name(){//must Override 
		System.out.println("\nTruck");
	}
	public void engine(){//must Override 
		System.out.println("5600");
	}
	public void seat(){//must Override 
		System.out.println("2 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("6 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Red");
	}
	public void gear(){//must Override 
		System.out.println("8 - Gear");
	}
}
class Jeep implements Vehical{
	public void name(){//must Override 
		System.out.println("\nJeep");
	}
	public void engine(){//must Override 
		System.out.println("1998 cc");
	}
	public void seat(){//must Override 
		System.out.println("4 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("4 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Blue");
	}
	public void gear(){//must Override 
		System.out.println("6 - Gear");
	}
}
class Bike implements Vehical{
	public void name(){//must Override 
		System.out.println("\nBike");
	}
	public void engine(){//must Override 
		System.out.println("600 cc");
	}
	public void seat(){//must Override 
		System.out.println("1- Seats");
	}
	public void tyre(){//must Override 
		System.out.println("2 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Red and Black");
	}
	public void gear(){//must Override 
		System.out.println("5 - Gear");
	}
}
class Tractor implements Vehical{
	public void name(){//must Override 
		System.out.println("\nTractor");
	}
	public void engine(){//must Override 
		System.out.println("2300");
	}
	public void seat(){//must Override 
		System.out.println("1 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("4 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Green");
	}
	public void gear(){//must Override 
		System.out.println("8 - Gear");
	}
}
class Trailor implements Vehical{
	public void name(){//must Override 
		System.out.println("\nTrailor");
	}
	public void engine(){//must Override 
		System.out.println("5600");
	}
	public void seat(){//must Override 
		System.out.println("2 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("22 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("Brown");
	}
	public void gear(){//must Override 
		System.out.println("8 - Gear");
	}
}
class Raksha implements Vehical{
	public void name(){//must Override 
		System.out.println("\nRakshaw");
	}
	public void engine(){//must Override 
		System.out.println("200");
	}
	public void seat(){//must Override 
		System.out.println("3 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("3 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("gold");
	}
	public void gear(){//must Override 
		System.out.println("5 - Gear");
	}
}
class Ven implements Vehical{
	public void name(){//must Override 
		System.out.println("\nVen");
	}
	public void engine(){//must Override 
		System.out.println("2700");
	}
	public void seat(){//must Override 
		System.out.println("18 - Seats");
	}
	public void tyre(){//must Override 
		System.out.println("4 - Tyre");
	}
	public void color(){//must Override 
		System.out.println("White");
	}
	public void gear(){//must Override 
		System.out.println("6 - Gear");
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
		System.out.println("==================");
		Display.show(b);
		System.out.println("==================");
		Display.show(t);
		System.out.println("==================");
		Display.show(j);
		System.out.println("==================");
		Display.show(bi);
		System.out.println("==================");
		Display.show(tt);
		System.out.println("==================");
		Display.show(tr);
		System.out.println("==================");
		Display.show(r);
		System.out.println("==================");
		Display.show(v);
		
	}
}