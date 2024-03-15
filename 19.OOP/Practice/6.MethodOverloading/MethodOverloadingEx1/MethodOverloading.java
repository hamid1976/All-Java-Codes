/* class Calculator{
	 
    void add(int a,int b){
	    System.out.println("Addition="+a+b);
	}
	void add(int a,int b,int c){
	    System.out.println("Addition="+a+b);
	}
	void add(double a,int b){
	    System.out.println("Addition="+a+b);
	}
	void add(int a,double b){
	    System.out.println("Addition="+a+b);
	}
}
class MethodOverloading{
	public static void main(String arg[]){
			  Calculator ob=new Calculator();
			  ob.add(10,5);
			  ob.add(10,20);
			  ob.add(20.1,10);
			  ob.add(10,30.0);
		  }
	  } */

class Calculator<T,U,I> {
 
    void add(T a, T b) {
        System.out.println("Addition=" + a + b);
    }
    
    void add(T a, T b, T c) {
        System.out.println("Addition=" + a + b + c);
    }
}
 
class MethodOverloading {
    public static void main(String[] args) {
        Calculator<Integer> ob = new Calculator<>();
        ob.add(10, 5);
        
        Calculator<String> ob2 = new Calculator<>();
        ob2.add("Hello", "World");
        
        Calculator<Double> ob3 = new Calculator<>();
        ob3.add(10.5, 20.3);
		
		Calculator<Integer,Float,Character> ob4 = new Calculator<>();
        ob4.add(2, 20.3,'a');
    }
}
