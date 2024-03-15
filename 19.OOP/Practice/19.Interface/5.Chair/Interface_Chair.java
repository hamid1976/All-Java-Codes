interface Chair{
    void Chair();//by default all methods are public abstract
    void WoodChair();//by default all methods are public abstract
    void WheelChair();//by default all methods are public abstract
    void PlasticChair();//by default all methods are public abstract
    void SteelChair();//by default all methods are public abstract
}
class Deluxe implements Chair{
	public void WoodChair(){
		System.out.println("\nDelux Brand WoodChair");
	}
	public void WheelChair(){
		System.out.println("Delux Brand WheelChair");
	}
	public void PlasticChair(){
		System.out.println("Delux Brand PlasticChair");
	}
	public void SteelChair(){
		System.out.println("Delux Brand SteelChair");
	}
	public void Chair(){
		System.out.println("Delux Brand Chair");
	}
}
class Brookwood implements Chair{
	public void WoodChair(){
		System.out.println("\nBrookwood Brand WoodChair");
	}
	public void WheelChair(){
		System.out.println("Brookwood Brand WheelChair");
	}
	public void PlasticChair(){
		System.out.println("Brookwood Brand PlasticChair");
	}
	public void SteelChair(){
		System.out.println("Brookwood Brand SteelChair");
	}
	public void Chair(){
		System.out.println("Delux Brand Chair");
	}
}
class Hardwood implements Chair{
	public void WoodChair(){
		System.out.println("\nHardwood Brand WoodChair");
	}
	public void WheelChair(){
		System.out.println("Hardwood Brand WheelChair");
	}
	public void PlasticChair(){
		System.out.println("Hardwood Brand PlasticChair");
	}
	public void SteelChair(){
		System.out.println("Hardwood Brand SteelChair");
	}
	public void Chair(){
		System.out.println("Delux Brand Chair");
	}
}
class Homemaker implements Chair{
    public void WoodChair(){
		System.out.println("\nHomemaker Brand WoodChair");
	}
	public void WheelChair(){
		System.out.println("Homemaker Brand WheelChair");
	}
	public void PlasticChair(){
		System.out.println("Homemaker Brand PlasticChair");
	}
	public void SteelChair(){
		System.out.println("Homemaker Brand SteelChair");
	}
	public void Chair(){
		System.out.println("Delux Brand Chair");
	}
}	
class Royal implements Chair{
	public void WoodChair(){
		System.out.println("\nRoyal Brand WoodChair");
	}
	public void WheelChair(){
		System.out.println("Royal Brand WheelChair");
	}
	public void PlasticChair(){
		System.out.println("Royal Brand PlasticChair");
	}
	public void SteelChair(){
		System.out.println("Royal Brand SteelChair");
	}
	public void Chair(){
		System.out.println("Delux Brand Chair");
	}
}
class Display{
   static public void show(Chair ob){
   ob.Chair();
   ob.WoodChair();
   ob.WheelChair();
   ob.PlasticChair();
   ob.SteelChair();
   }
}	
class Interface_Chair{
	public static void main(String arg[]){
		Deluxe       d  = new Deluxe();
		Brookwood    b  = new Brookwood();
		Hardwood     hw = new Hardwood();
		Homemaker    hm = new Homemaker();
		Royal        r  = new Royal();
		
		Display.show(d);
		System.out.println("======================");
		Display.show(b);
		System.out.println("======================");
		Display.show(hw);
		System.out.println("======================");
		Display.show(hm);
		System.out.println("======================");
		Display.show(r);
	}
}