class Animal{
	void sound(){
		System.out.println("Natural Language");
	}
	void legs(){
		System.out.println("Four legs");
	}
	void eyes(){
		System.out.println("Two eyes");
	}
}
class Cat extends Animal{
 	void sound(){
		System.out.println("Miyaoon Miyaoon...");
	}
}
class Dog extends Cat{
	void sound(){
		System.out.println("Wawooo Wawooo...");
	}
}
final class Human extends Dog{
	void sound(){
		System.out.println("Natural Language");
	}
	void legs(){
		System.out.println("Two legs");
	}
}
class Test{
	public static void main(String arg[]){
	Cat c=new Cat();
	Dog d=new Dog();
	Human h=new Human();
		
		c.sound();
		c.legs();
		c.eyes();
		
		d.sound();
		d.legs();
		d.eyes();
		
		h.sound();
		h.legs();
		h.eyes();
		
		
	}
}