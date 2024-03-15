abstract class Animal{
	void eyes(){
       System.out.println("Two eyes");
   }
	abstract void name();
	abstract void sound();
	abstract void legs();
}
class Cat extends Animal{
	void name(){
		System.out.println("\nCat");
	}
	void sound(){  //overriding
	System.out.println("Miyaoon Miyaoon miyaoon");
	}
	void legs(){
		System.out.println("Four legs");
    }
}
class Dog extends Animal{
	void name(){
		System.out.println("\nDog");
	}
	void sound(){  //overriding
	System.out.println("wawoo wwwa woowa");
	}
	void legs(){
		System.out.println("Four legs");
    }
}

class Human extends Animal{
	void name(){
		System.out.println("\nHuman");
	}
	void sound(){   //overriding
	System.out.println("Spoken languages..");
	}
	void legs(){  //overriding
	System.out.println("Two legs");
	}
}
class Lion extends Animal{
	void name(){
		System.out.println("\nLion");
	}
	void sound(){
		System.out.println("Roars");
	}
	void legs(){
		System.out.println("Four legs");
    }
}
class Donkey extends Animal{
	void name(){
		System.out.println("\nDonkey");
	}
	void sound(){
		System.out.println("Hee-Haw");
	}
	void legs(){
		System.out.println("Four legs");
    }
}
class Monkey extends Animal{
	void name(){
		System.out.println("\nMonkey");
	}
	void sound(){
		System.out.println("They Scream");
	}
	void legs(){
		System.out.println("Two legs");
	}
}
class Goat extends Animal{
	void name(){
		System.out.println("\nGoat");
	}
    void sound(){
         System.out.println("Meh-eh-eh");
	}
	void legs(){
		System.out.println("Four legs");
    }
}
class Snake extends Animal{
	void name(){
		System.out.println("\nSnake");
	}
    void sound(){
         System.out.println("SSSSS, Hiiissss");
	}
    void legs(){
         System.out.println("No legs");
	}
}
class Dinasour extends Animal{
	void name(){
		System.out.println("\nDinasour");
	}
   void sound(){
         System.out.println("Squeaks,snorts");
   }
   void legs(){
		System.out.println("Two legs");
    }
}
class Horse extends Animal{
	void name(){
		System.out.println("\nHorse");
	}
   void sound(){
         System.out.println("heigh,whinny,nicker");
   }
   void legs(){
		System.out.println("Four legs");
    }
	
}
class Wolf extends Animal{
	void name(){
		System.out.println("\nWolf");
	}
   void sound(){
         System.out.println("howl,growl,bay");
   }
   void legs(){
		System.out.println("Four legs");
    }
	 void eyes(){
		
		 super.eyes();
	 }
}  
	
class Display{
	static void show(Animal ob){
	ob.eyes();
	ob.name();
	ob.sound();
	ob.legs();
}
}
class Abstract_Animal{
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