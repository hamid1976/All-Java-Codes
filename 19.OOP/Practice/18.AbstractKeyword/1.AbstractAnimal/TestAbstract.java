abstract class Animal{
	abstract void sound();//must override abstract sound method in sub classes
	void legs(){
		System.out.println("Four Legs");
	}
	void eyes(){
		System.out.println("Two Eyes");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("Miyaoon Miyaoon");//must override
	}
}
class Dog extends Animal{
	void sound(){//must override
		System.out.println("Wawooo Wawooo");
	}
}
class Human extends Animal{
	void sound(){//must override
		System.out.println("Natural Language");
	}
	void legs(){//override
		System.out.println("Two Legs");
	}
}
class Display{
	static void show(Animal a){
		a.sound();
		a.legs();
		a.eyes();
	}
}
class TestAbstract{
	public static void main(String arg[]){
		Cat c=new Cat();
		Dog d=new Dog();
		Human h=new Human();
		
		Display.show(c);
		Display.show(d);
		Display.show(h);
	}
}