import java.util.*;

class Objectdemo{
	
	public static void main(String arg[]){
		
		Box ob1=new Box();
		Box ob2=new Box();
		Box ob3=new Box();
		
		ob1.Feet=10;
		ob1.Inches=5;
		
		ob2.Feet=100;
		ob2.Inches=50;
		
		ob3.Feet=1000;
		ob4.Inches=500;
		
		System.out.println(ob1.Feet+ob1.Inches);
		System.out.println(ob2.Feet+ob2.Inches);
		System.out.println(ob3.Feet+ob3.Inches);
		
		
		
		
	}
}


class Box{
	
	int Feet;
	int Inches;
}