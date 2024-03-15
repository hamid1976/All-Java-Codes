abstract class Computer{
     void Shape(){
         System.out.println("\n\nSame Shape");
	 }
     void Ram(){
         System.out.print("8 GB Ram");
     }
     abstract void processor();
     abstract void SSD();
     abstract void GraphicCard();
}
class HP extends Computer{
	void processor(){
		System.out.println("\nCore i5 4th Generation");
	}
	void SSD(){
		System.out.println("128 GB SSD");
	}
	void GraphicCard(){
		System.out.println("1050 ti 4GB GC");
	}
}
class Toshiba extends Computer{
	void processor(){
		System.out.println("\nCore i5 6th Generation");
	}
	void SSD(){
		System.out.println("256 GB SSD");
	}
	void GraphicCard(){
		System.out.println("RTX 3070 8GB  GC");
	}
}
class IBM extends Computer{
	void processor(){
		System.out.println("\n Core i7 4th Generation");
	}
	void SSD(){
		System.out.println("500 GB SSD");
	}
	void GraphicCard(){
		System.out.println("AMD Radeon Rx 5700 GC");
	}
}
class display{
	static void show( Computer ob){
		ob.Shape();
		ob.Ram();
		ob.processor();
		ob.SSD();
		ob.GraphicCard();
	}
}
class Abstract_ComputerFinalKeyword{
	public static void main(String arg[]){
		HP      h = new HP();
		Toshiba t = new Toshiba();
		IBM     i = new IBM();
		
		display.show(h);
		display.show(t);
		display.show(i);
	}
}