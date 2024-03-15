class Animal{
	void sound(){
		System.out.println("No Sound");
	}
	void legs(){
		System.out.println("Four Legs");
	}
	void eyes(){
		System.out.println("Two Eyes");
	}
}
class Cat extends Animal{
	void sound(){//override
		System.out.println("Miyaoon Miyaoon..");
	}
}
class Dog extends Animal{
	void sound(){//override
		System.out.println("Wawoo Wawoo...");
	}
}
class Human extends Animal{
	void sound(){//override
		System.out.println("Natural Language");
	}
	void legs(){//override
		System.out.println("Two legs");
	}
}
class Display{
	static void show(Animal a){
		a.sound();
		a.legs();
		a.eyes();
	}
}
class Test{
	public static void main(String arg[]){
		Cat cat=new Cat();
		Dog dog=new Dog();
		Human human=new Human();
		
		Display.show(cat);
		Display.show(dog);
		Display.show(human);
	}
}