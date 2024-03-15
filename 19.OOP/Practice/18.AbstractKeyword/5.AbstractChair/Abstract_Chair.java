abstract class Chair{
	void Chair(){
		System.out.println("\nNormal Chair");
	}
	abstract void WoodChair();
	abstract void WheelChair();
	abstract void PlasticChair();
	abstract void SteelChair();
}
class Deluxe extends Chair{
	void WoodChair(){
		System.out.println("\nDelux Brand WoodChair");
	}
	void WheelChair(){
		System.out.println("Delux Brand WheelChair");
	}
	void PlasticChair(){
		System.out.println("Delux Brand PlasticChair");
	}
	void SteelChair(){
		System.out.println("Delux Brand SteelChair");
	}
}
class Brookwood extends Chair{
	void WoodChair(){
		System.out.println("\nBrookwood Brand WoodChair");
	}
	void WheelChair(){
		System.out.println("Brookwood Brand WheelChair");
	}
	void PlasticChair(){
		System.out.println("Brookwood Brand PlasticChair");
	}
	void SteelChair(){
		System.out.println("Brookwood Brand SteelChair");
	}
}
class Hardwood extends Chair{
	void WoodChair(){
		System.out.println("\nHardwood Brand WoodChair");
	}
	void WheelChair(){
		System.out.println("Hardwood Brand WheelChair");
	}
	void PlasticChair(){
		System.out.println("Hardwood Brand PlasticChair");
	}
	void SteelChair(){
		System.out.println("Hardwood Brand SteelChair");
	}
}
class Homemaker extends Chair{
    void WoodChair(){
		System.out.println("\nHomemaker Brand WoodChair");
	}
	void WheelChair(){
		System.out.println("Homemaker Brand WheelChair");
	}
	void PlasticChair(){
		System.out.println("Homemaker Brand PlasticChair");
	}
	void SteelChair(){
		System.out.println("Homemaker Brand SteelChair");
	}
}	
class Royal extends Chair{
	void WoodChair(){
		System.out.println("\nRoyal Brand WoodChair");
	}
	void WheelChair(){
		System.out.println("Royal Brand WheelChair");
	}
	void PlasticChair(){
		System.out.println("Royal Brand PlasticChair");
	}
	void SteelChair(){
		System.out.println("Royal Brand SteelChair");
	}
}
class Display{
   static void show(Chair ob){
   ob.Chair();
   ob.WoodChair();
   ob.WheelChair();
   ob.PlasticChair();
   ob.SteelChair();
   }
}	
class Abstract_Chair{
	public static void main(String arg[]){
		Deluxe       d  = new Deluxe();
		Brookwood    b  = new Brookwood();
		Hardwood     hw = new Hardwood();
		Homemaker    hm = new Homemaker();
		Royal        r  = new Royal();
		
		Display.show(d);
		Display.show(b);
		Display.show(hw);
		Display.show(hm);
		Display.show(r);
	}
}