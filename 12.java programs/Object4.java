import java.util.*;

class Object4{
	
	public static void main(String arg[]){
		
		Box ob1=new Box();
		Box ob2=new Box();
		Box ob3=new Box();
		
		
		ob1.set(10,5);
		
		ob2.set(100,50);
		
		ob3.set(1000,500);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
	}
	
}


class Box{
	
	int Feet;
	int inch;
	
	void set(int a, int b){
		
		Feet=a;
		inch=b;
		
		
	}
	
	void show(){
		
		System.out.println("Feet: "+Feet);
		System.out.println("Inch: "+inch);
	}
	
	
	
}














