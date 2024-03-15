interface Animal{
	void name();//by default all methods are public abstract
    void sound();//by default all methods are public abstract
    void legs();//by default all methods are public abstract
    void eyes();//by default all methods are public abstract
}
class Cat implements Animal{
	public void name(){//must override 
		System.out.println("Cat");
	}
	public void sound(){//must override 
	System.out.println("\nMiyaoon Miyaoon miyaoon");
	}
	public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Dog implements Animal{
	public void name(){//must override 
		System.out.println("Dog");
	}
	public void sound(){//must override 
	System.out.println("\nWawoo wwwa woowa");
	}
	public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Human implements Animal{
	public void name(){//must override 
		System.out.println("Human");
	}
	public void sound(){//must override 
	System.out.println("\nSpoken languages..");
	}
	public void legs(){  //must override 
	System.out.println("\nTwo legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Lion implements Animal{
	public void name(){//must override 
		System.out.println("Lion");
	}
	public void sound(){//must override 
		System.out.println("\nRoars");
	}
	public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Donkey implements Animal{
	public void name(){//must override 
		System.out.println("Donkey");
	}
	public void sound(){//must override
		System.out.println("\nHee-Haw");
	}public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Monkey implements Animal{
	public void name(){//must override 
		System.out.println("Monkey");
	}
	public void sound(){//must override
		System.out.println("\nThey Scream");
	}
	public void legs(){//must override 
		System.out.println("Two legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Goat implements Animal{
	public void name(){//must override 
		System.out.println("Goat");
	}
    public void sound(){//must override 
         System.out.println("\nMeh-eh-eh");
	}
	public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Snake implements Animal{
	public void name(){//must override 
		System.out.println("Snake");
	}
    public void sound(){//must override 
         System.out.println("\nSSSSS, Hiiissss");
	}
    public void legs(){//must override 
         System.out.println("\nNo legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Dinasour implements Animal{
	public void name(){//must override 
		 System.out.println("Dinasour");
	}
    public void sound(){//must override 
         System.out.println("\nSqueaks,snorts");
    }
    public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Horse implements Animal{
	public void name(){//must override 
		System.out.println("Horse");
	}
    public void sound(){//must override 
         System.out.println("\nheigh,whinny,nicker");
    }
    public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}
class Wolf implements Animal{
	public void name(){//must override 
		System.out.println("Wolf");
	}
    public void sound(){//must override 
         System.out.println("\nhowl,growl,bay");
    }
    public void legs(){//must override 
		System.out.println("Four legs");
	}
	public void eyes(){//must override 
		System.out.println("Two eyes");
	}
}   
class Display{
	static public void show(Animal a){
		a.sound();
		a.legs();
		a.eyes();
		a.name();
	}
}
class Test_Animal{
	public static  void main(String arg[]){
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