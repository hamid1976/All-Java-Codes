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
final class Alto extends Car{
        void CC(){
			System.out.println("\nAlto is 796 CC");
		}
		void prices(){
			System.out.println("price is 14 lac 75 Thousand 'VXL'");
	    }
}

class FinalAbstractClass_cars{
public static void main(String arg[]){
	
	    Cultus cl=new Cultus();
	    Alto    a=new Alto();
	    
	    
		Car  c= cl;
		
		c.CC();
		c.stairing();
		c.AirCondition();
		c.prices();
		
		c=a;
		
		c.CC();
		c.stairing();
		c.AirCondition();
		c.prices();
		
}
}