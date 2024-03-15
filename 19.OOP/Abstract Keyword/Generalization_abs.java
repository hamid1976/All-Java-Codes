abstract class Animal{
        abstract void sound();
   void eyes(){
       System.out.println("Two eyes");
   }
   void legs(){
       System.out.println("Four Legs");
	   }
	}
class Cat extends Animal{
	void sound(){
	   System.out.println("miyaoon miyaoon miyaoon ....");
	   }
}
class Dog extends Animal{
	void sound(){
	    System.out.println("wawoo wawooo wawooo...");
         }
}
class Human extends Animal{
      void sound(){
         System.out.println("Natural Language");
         }
	  void legs(){
         System.out.println("Two Legs");
         }		 
	}
class Display{
    static void show(Animal ob){
       ob.sound();
       ob.eyes();
       ob.legs();
    }
}
class Generalization_abs{
     public static void main(String arg[]){
		 
		 Cat c =new Cat();
		 Dog d =new Dog();
		 Human h=new Human();
		 
		 Display.show(c);
		 Display.show(d);
		 Display.show(h);
	 }
}	 