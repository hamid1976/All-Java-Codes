class student{
	int a,b;
		student(int x,int y){
			a=x;
			b=y;
		}
	}
	class Display{
		static void add(student ob1,student ob2){
			System.out.println("Addition is:"+(ob1.a+ob2.a));
			System.out.println("Addition is:"+(ob1.b+ob2.b));
		}
		static void sub(student ob1,student ob2){
			System.out.println("Subtraction is:"+(ob1.a-ob2.a));
			System.out.println("Subtraction is:"+(ob1.b-ob2.b));
		}
		static void mul(student ob1,student ob2){
			System.out.println("Multiplication is:"+(ob1.a*ob2.a));
			System.out.println("Multiplcation is:"+(ob1.b*ob2.b));
		}
		static void div(student ob1,student ob2){
			System.out.println("Division is:"+(ob1.a/ob2.a));
			System.out.println("Division is:"+(ob1.b/ob2.b));
		}	
	}
class CalcStatic_Method1{
public static void main(String arg[]){
	 student ob1 =new student(10,20);
	 student ob2 =new student(2,5);
	 
 	 Display.add(ob1,ob2);
	 Display.sub(ob1,ob2);
	 Display.mul(ob1,ob2);
	 Display.div(ob1,ob2);
}
}