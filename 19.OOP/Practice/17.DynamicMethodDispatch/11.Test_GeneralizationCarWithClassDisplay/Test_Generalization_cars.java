	class Car{
		void CC(){
			System.out.println("CC");
		}
		void stairing(){
			System.out.println("Have Stairing");
		}
	    void AirCondition(){
		    System.out.println("AirCondition");
	    }
		void prices(){
			System.out.println("Prices");
		}
	}
	class Cultus extends Car{
        void CC(){
			System.out.println("\nCultus have 998 CC");
		}
		void prices(){
			System.out.println("price is 16 lac 55 Thousand 'VXR'");
	    }
	}
    class Alto extends Car{
        void CC(){
			System.out.println("\nAlto is 796 CC");
		}
		void prices(){
			System.out.println("price is 14 lac 75 Thousand 'VXL'");
	    }
	}
    class Mehran extends Car{
		void AirCondition(){
		    System.out.println("No AirCondition");
	    }
        void CC(){
			System.out.println("\nMehran is 796 CC");
		}
		void prices(){
			System.out.println("price is 8 lac 60 Thousand ");
	    }
	}
    class Cuore extends Car{
        void CC(){
			System.out.println("\nCoure is 800 CC");
		}
		void prices(){
			System.out.println("price is 8 lac 25 Thousand ");
	    }
	}
    class Swift extends Car{
        void CC(){
			System.out.println("\nSwift is 1197 CC");
		}
		void prices(){
			System.out.println("price is 21 lac 48 Thousand ");
	    }
	}
	class Civic extends Car{
        void CC(){
			System.out.println("\nCivic is 1799 CC");
		}
		void prices(){
			System.out.println("price is 45 lac 64 Thousand ");
	    }
	}
	class City extends Car{
        void CC(){
			System.out.println("\nHonda City is 1498 CC");
		}
		void prices(){
			System.out.println("price is 26 lac  ");
	    }
	}
	class Corolla extends Car{
        void CC(){
			System.out.println("\nCorolla is 1794 CC");
		}
		void prices(){
			System.out.println("price is 38 lac 89 Thousand ");
	    }
	}
class Display{
	static void show(Car c){
		c.CC();
		c.stairing();
		c.AirCondition();
		c.prices();
	}
}
class Test_cars{
public static void main(String arg[]){
	
	    Cultus cl=new Cultus();
	    Alto    a=new Alto();
	    Mehran  m=new Mehran();
	    Cuore  cu=new Cuore();
        Swift   s=new Swift();
        Civic  cv=new Civic();
        City   cy=new City();
        Corolla cr=new Corolla();
		
		Display.show(cl);
		Display.show(a);
		Display.show(m);
		Display.show(cu);
		Display.show(s);
		Display.show(cv);
		Display.show(cy);
		Display.show(cr);
		
}
}
		
		
		