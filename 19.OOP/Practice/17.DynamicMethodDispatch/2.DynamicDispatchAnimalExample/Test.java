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
class Test{
	public static void main(String arg[]){
		Cat c=new Cat();
		Dog d=new Dog();
		Human h=new Human();
		
		Animal a=c; //super class
		a.sound();
		a.legs();
		a.eyes();
		
		a=d;
		a.sound();
		a.legs();
		a.eyes();
		
		a=h;
		a.sound();
		a.legs();
		a.eyes();
	}
}