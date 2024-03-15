import java.util.*;
class Rectangle{
	int feet;
	int inch;
	void show(int a,int b){
		feet=a;
		inch=b;
		System.out.println("Feet="+feet);
		System.out.println("Inch="+inch);
	}
}
class Main{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	Rectangle ob=new Rectangle();
		ob.feet=sc.nextInt();
		ob.inch=sc.nextInt();
	
	ob.show();
  }
}