import java.util.*;

class Constructor{
	
	public static void main(String arg[]){
		
		Box ob1=new Box(10,5);
		Box ob2=new Box();
		Box ob3=new Box(100);
		
		ob1.Show();
		ob2.Show();
		ob3.Show();
		
		
	}
}

class Box{
	
	int feet;
	int inch;
	
	Box(){
		
		feet=0;
		inch=0;
		System.out.println("NO argument cost of Box ");
	}
	
	Box(int len){
		
		feet=inch=len;
		System.out.println("One argument cost of Box ");
		
	}
	
	Box(int a, int b){
		
		feet=a;
		inch=b;
		System.out.println("One argument cost of Box ");
	}
	
	void Show(){
		
		System.out.println(feet);
		System.out.println(inch);
	}
	
	
}


















