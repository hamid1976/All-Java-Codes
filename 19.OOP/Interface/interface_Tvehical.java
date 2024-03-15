interface  Vehical{
	 void name();
	 void seats();
	 void tyre();
	
}
class Car implements Vehical{
	
	public void name(){
		System.out.println("\nCar");
	}
	
	public void seats(){
		System.out.println("4-seats");
	}
	public void tyre(){
		System.out.println("4-tyres");
	}

}
class jeep implements Vehical{
 public	void name(){
		System.out.println("\nJeep");
	}

	public void seats(){
		System.out.println("2-Seats");
	}
	 public void tyre(){
		System.out.println("4-tyre");
	}
	
}
class Ven implements Vehical{
	public void name(){
		System.out.println("\nVen");
	}
	
	public void seats(){
		System.out.println("18-Seats");
	}
	public void tyre(){
		System.out.println("4-tyre");
	}
	
}

class Display{
	static void show(Vehical a){
		
		a.name();
		a.seats();
		a.tyre();

	}
}
class interface_Tvehical{
      public static void main(String arg[]){
		  Car c=new Car();
		  Ven v=new Ven();
		 jeep j=new jeep();
		  Display.show(c);
		  Display.show(v);
		  Display.show(j);
		 
		  
	  }
}