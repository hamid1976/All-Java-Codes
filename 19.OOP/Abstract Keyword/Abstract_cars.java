abstract class Car{
		
		void stairing(){
			System.out.println("Have Stairing");
		}
		abstract void CC();
		abstract void prices();
	    abstract void AirCondition();
	}
class Cultus extends Car{
        void CC(){
			System.out.println("\nCultus have 998 CC");
		}
		void prices(){
			System.out.println("price is 16 lac 55 Thousand 'VXR'");
		}
	    void AirCondition(){
		    System.out.println("AirCondition");
	    }
	    
	}
class Alto extends Car{
        void CC(){
			System.out.println("\nAlto is 796 CC");
		}
		void prices(){
			System.out.println("price is 14 lac 75 Thousand 'VXL'");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
	}
class Mehran extends Car{
        void CC(){
			System.out.println("\nMehran is 796 CC");
		}
		void prices(){
			System.out.println("price is 8 lac 60 Thousand ");
	    }
		void AirCondition(){
		    System.out.println("No AirCondition");
	    }
	}
class Cuore extends Car{
        void CC(){
			System.out.println("\nCoure is 800 CC");
		}
		void prices(){
			System.out.println("price is 8 lac 25 Thousand ");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
	}
class Swift extends Car{
        void CC(){
			System.out.println("\nSwift is 1197 CC");
		}
		void prices(){
			System.out.println("price is 21 lac 48 Thousand ");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
	}
class Civic extends Car{
        void CC(){
			System.out.println("\nCivic is 1799 CC");
		}
		void prices(){
			System.out.println("price is 45 lac 64 Thousand ");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
	}
class City extends Car{
        void CC(){
			System.out.println("\nHonda City is 1498 CC");
		}
		void prices(){
			System.out.println("price is 26 lac  ");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
	}
class Corolla extends Car{
        void CC(){
			System.out.println("\nCorolla is 1794 CC");
		}
		void prices(){
			System.out.println("price is 38 lac 89 Thousand ");
	    }
		void AirCondition(){
		    System.out.println("AirCondition");
	    }
		void stairing(){
			super.stairing();
		}
	}
class Display{
	static void show(Car ob){
    ob.stairing();
	ob.CC();
	ob.prices();
	ob.AirCondition();
}
}

class Abstract_cars{
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
		