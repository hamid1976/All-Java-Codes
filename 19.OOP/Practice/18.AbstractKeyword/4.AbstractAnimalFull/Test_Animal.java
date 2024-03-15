abstract class Animal{
	abstract void name();
	abstract void sound();
	void legs(){
		System.out.println("Four legs");
	}
	void eyes(){
		System.out.println("Two eyes");
	}
}
class Cat extends Animal{
	void name(){//must override abstract method
		System.out.println("Cat");
	}
	void sound(){//must override abstract method
	System.out.println("\nMiyaoon Miyaoon miyaoon");
	}
}
class Dog extends Animal{
	void name(){//must override abstract method
		System.out.println("Dog");
	}
	void sound(){//must override abstract method
	System.out.println("\nWawoo wwwa woowa");
	}
}
class Human extends Animal{
	void name(){//must override abstract method
		System.out.println("Human");
	}
	void sound(){//must override abstract method
	System.out.println("\nSpoken languages..");
	}
	void legs(){  //overriding
	System.out.println("\nTwo legs");
	}
}
class Lion extends Animal{
	void name(){//must override abstract method
		System.out.println("Lion");
	}
	void sound(){//must override abstract method
		System.out.println("\nRoars");
	}
}
class Donkey extends Animal{
	void name(){//must override abstract method
		System.out.println("Donkey");
	}
	void sound(){//must override abstract method
		System.out.println("\nHee-Haw");
	}
}
class Monkey extends Animal{
	void name(){//must override abstract method
		System.out.println("Monkey");
	}
	void sound(){//must override abstract method
		System.out.println("\nThey Scream");
	}
	void legs(){
		System.out.println("Two legs");
	}
}
class Goat extends Animal{
	void name(){//must override abstract method
		System.out.println("Goat");
	}
    void sound(){//must override abstract method
         System.out.println("\nMeh-eh-eh");
	}
}
class Snake extends Animal{
	void name(){//must override abstract method
		System.out.println("Snake");
	}
    void sound(){//must override abstract method
         System.out.println("\nSSSSS, Hiiissss");
	}
    void legs(){
         System.out.println("\nNo legs");
	}
}
class Dinasour extends Animal{
	void name(){//must override abstract method
		System.out.println("Dinasour");
	}
   void sound(){//must override abstract method
         System.out.println("\nSqueaks,snorts");
   }
}
class Horse extends Animal{
	void name(){//must override abstract method
		System.out.println("Horse");
	}
   void sound(){//must override abstract method
         System.out.println("\nheigh,whinny,nicker");
   }
}
class Wolf extends Animal{
	void name(){//must override abstract method
		System.out.println("Wolf");
	}
   void sound(){//must override abstract method
         System.out.println("\nhowl,growl,bay");
   }
}   
class Display{
	static void show(Animal a){
		a.sound();
		a.legs();
		a.eyes();
		a.name();
	}
}
class Test_Animal{
	public static void main(String arg[]){
		Cat c=new Cat();
		Dog d=new Dog();
		Human h=new Human();
		Lion l=new Lion();
		Donkey D=new Donkey();
		Monkey m=new Monkey();
		Goat g=new Goat();
		Snake s=new Snake();
		Dinasour ds=new Dinasour();
		Horse hs=new Horse();
		Wolf w=new  Wolf();
		
		Display.show(c);
		System.out.println("======================");
		Display.show(d);
		System.out.println("======================");
		Display.show(h);
		System.out.println("======================");
		Display.show(l);
		System.out.println("======================");
		Display.show(D);
		System.out.println("======================");
		Display.show(m);
		System.out.println("======================");
		Display.show(g);
		System.out.println("======================");
		Display.show(s);
		System.out.println("======================");
		Display.show(ds);
		System.out.println("======================");
		Display.show(hs);
		System.out.println("======================");
		Display.show(w);
	}
}