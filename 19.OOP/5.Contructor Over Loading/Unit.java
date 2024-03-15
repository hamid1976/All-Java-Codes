import java.util.*;

class Unit{
	
	public static void main(String arg[]){
		
		Box ob1=new Box();
		Box ob2=new Box(10,5);
		Box ob3=new Box(100,50);
		
		ob1.show();
		ob2.show();
		ob3.show();
		
		
		
	}
	
}

class Box{
	
	int feet;
	int inch;
	
	Box(){
		
		System.out.println("Sam No argument constructor of Box");
		
		feet=0;
		inch=0;
		
	}
	
	Box(int a, int b){
		
		feet=a;
		inch=b;
		
		System.out.println("Iam Two argument constructor of Box ");
	}
	
	void show(){
		
		System.out.println("Feet: "+feet);
		System.out.println("Inch: "+inch);
		
	}
	
}

