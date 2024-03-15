interface Animal{
	void name();
	void sound();
	void legs();
	void eyes();
}
class Cat implements Animal{
	public void name(){
		System.out.println("\nCat");
	}
	public void sound(){
		System.out.println("Miyaoon Miyaoon...");
	}
	public void legs(){
		System.out.println("Four Legs");
	}
	public void eyes(){
		System.out.println("Two Eyes");
	}
}
class Dog implements Animal{
    public void name(){
		System.out.println("\nDog");
	}
	public void sound(){
		System.out.println("Wawoo Wawoo...");
	}
	public void legs(){
		System.out.println("Four Legs");
	}
	public void eyes(){
		System.out.println("Two Eyes");
	}
}
class Human implements Animal{
	 public void name(){
		System.out.println("\nHuman");
	}
	public void sound(){
		System.out.println("Natural Language");
	}
	public void legs(){
		System.out.println("Two Legs");
	}
	public void eyes(){
		System.out.println("Two Eyes");
	}
}
class Display{
	static void show(Animal a){
		a.name();
		a.sound();
		a.legs();
		a.eyes();
	}
}
class Example{
	public static void main(String arg[]){
	Cat c=new Cat();
	Dog d=new Dog();
	Human h=new Human();
	Display.show(c);
	Display.show(d);
	Display.show(h);
	}
}