interface Car{
	    void  CC();//by default all methods are public abstract
	    void  seat();//by default all methods are public abstract
	    void  tyre();//by default all methods are public abstract
	    void  prices();//by default all methods are public abstract
	    void  stairing();//by default all methods are public abstract
	    void  AirCondition();//by default all methods are public abstract
	}
	class Cultus implements Car{
        public void  CC(){//must override
			System.out.println("\nCultus have 998 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 16 lac 55 Thousand 'VXR'");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
    class Alto implements Car{
        public void  CC(){//must override
			System.out.println("\nAlto is 796 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override 
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 14 lac 75 Thousand 'VXL'");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
    class Mehran implements Car{
        public void  CC(){//must override
			System.out.println("\nMehran is 796 CC");
		}
		public void  seat(){//must Override
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 8 lac 60 Thousand ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("No AirCondition");
	    }
	}
    class Cuore implements Car{
        public void  CC(){//must override
			System.out.println("\nCoure is 800 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 8 lac 25 Thousand ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
    class Swift implements Car{
        public void  CC(){//must override
			System.out.println("\nSwift is 1197 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override 
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 21 lac 48 Thousand ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
	class Civic implements Car{
        public void  CC(){//must override
			System.out.println("\nCivic is 1799 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override 
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 45 lac 64 Thousand ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
	class City implements Car{
        public void  CC(){//must override
			System.out.println("\nHonda City is 1498 CC");
		}
		public void  seat(){//must Override 
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override 
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 26 lac  ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
	class Corolla implements Car{
        public void  CC(){//must override
			System.out.println("\nCorolla is 1794 CC");
		}
		public void  seat(){//must Override
			System.out.println("4 - Seats");
		}
		public void  tyre(){//must Override
			System.out.println("4 - Tyre");
		}
		public void  prices(){//must override
			System.out.println("price is 38 lac 89 Thousand ");
	    }
		public void  stairing(){//must override
			System.out.println("Have Stairing");
		}
	    public void  AirCondition(){//must override
		    System.out.println("AirCondition");
	    }
	}
class Display{
	static public void  show(Car c){
		c.CC();
		c.seat();
		c.tyre();
		c.stairing();
		c.AirCondition();
		c.prices();
	}
}
class Test_cars{
	public static  void  main(String arg[]){
	
	    Cultus cl=new Cultus();
	    Alto    a=new Alto();
	    Mehran  m=new Mehran();
	    Cuore  cu=new Cuore();
        Swift   s=new Swift();
        Civic  cv=new Civic();
        City   cy=new City();
        Corolla cr=new Corolla();
		
		Display.show(cl);
		System.out.println("======================");
		Display.show(a);
		System.out.println("======================");
		Display.show(m);
		System.out.println("======================");
		Display.show(cu);
		System.out.println("======================");
		Display.show(s);
		System.out.println("======================");
		Display.show(cv);
		System.out.println("======================");
		Display.show(cy);
		System.out.println("======================");
		Display.show(cr);
		
}
}
		
		
		