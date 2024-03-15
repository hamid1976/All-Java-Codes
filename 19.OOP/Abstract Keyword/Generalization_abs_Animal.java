abstract class Animal{
	
        abstract void sound();
    void name(){
	 	System.out.println("name");
	}
   void eyes(){
       System.out.println("Two eyes");
   }
   void legs(){
       System.out.println("Four Legs");
	   }
	}
class Cat extends Animal{
	void name(){
		System.out.println("Cat");
	}
	void sound(){  //overriding
	System.out.println("\nMiyaoon Miyaoon miyaoon");
	}
}
class Dog extends Animal{
	void name(){
		System.out.println("Dog");
	}
	void sound(){  //overriding
	System.out.println("\nWawoo wwwa woowa");
	}
}
class Human extends Animal{
	void name(){
		System.out.println("Human");
	}
	void sound(){   //overriding
	System.out.println("\nSpoken languages..");
	}
	void legs(){  //overriding
	System.out.println("\nTwo legs");
	}
}
class Lion extends Animal{
	void name(){
		System.out.println("Lion");
	}
	void sound(){
		System.out.println("\nRoars");
	}
}
class Donkey extends Animal{
	void name(){
		System.out.println("Donkey");
	}
	void sound(){
		System.out.println("\nHee-Haw");
	}
}
class Monkey extends Animal{
	void name(){
		System.out.println("Monkey");
	}
	void sound(){
		System.out.println("\nThey Scream");
	}
	void legs(){
		System.out.println("Two legs");
	}
}
class Goat extends Animal{
	void name(){
		System.out.println("Goat");
	}
    void sound(){
         System.out.println("\nMeh-eh-eh");
	}
}
class Snake extends Animal{
	void name(){
		System.out.println("Snake");
	}
    void sound(){
         System.out.println("\nSSSSS, Hiiissss");
	}
    void legs(){
         System.out.println("\nNo legs");
	}
}
class Dinasour extends Animal{
	void name(){
		System.out.println("Dinasour");
	}
   void sound(){
         System.out.println("\nSqueaks,snorts");
   }
}
class Horse extends Animal{
	void name(){
		System.out.println("Horse");
	}
   void sound(){
         System.out.println("\nheigh,whinny,nicker");
   }
}
class Wolf extends Animal{
	void name(){
		System.out.println("Wolf");
	}
   void sound(){
         System.out.println("\nhowl,growl,bay");
   }
}   
class Display{
    static void show(Animal ob){
	   ob.name();
       ob.sound();
       ob.eyes();
       ob.legs();
    }
}
class Generalization_abs_Animal{
     public static void main(String arg[]){
		 
		 Cat c =new Cat();
		 Dog d =new Dog();
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
		 Display.show(d);
		 Display.show(h);
		 Display.show(l);
		 Display.show(D);
		 Display.show(m);
		 Display.show(g);
		 Display.show(s);
		 Display.show(ds);
		 Display.show(hs);
		 Display.show(w);
		 
	 }
}	 