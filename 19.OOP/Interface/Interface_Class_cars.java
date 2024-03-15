interface Car{
		void CC();
		void prices();
}
class Cultus implements Car{
        public void CC(){
			System.out.println("\nCultus have 998 CC");
		}
	
		public void prices(){
			System.out.println("price is 16 lac 55 Thousand 'VXR'");
	    }
}

class Alto implements Car{
     public   void CC(){
			System.out.println("\nAlto is 796 CC");
		}
	public	void prices(){
			System.out.println("price is 14 lac 75 Thousand 'VXL'");
	    }
}

class Display{
	static void show(Car a){
		a.CC();
		a.prices();
	}
}
		
class Interface_Class_cars{
public static void main(String arg[]){
	
	    Cultus cl=new Cultus();
	    Alto    a=new Alto();
	    
	    
    Display.show(cl);
    Display.show(a);
	
}
}