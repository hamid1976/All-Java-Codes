class student{
	  static int a;
	  static int b;
	 
	 // student(int c,int d){
		 // a=c;
		 // b=d;
	 // }
 	   // void display(){
		      // System.out.println(a);
			  // System.out.println(b);
			 	  
		   // }
 }		   
class TestCalcStatic_Variable{
 public static void main(String arg[]){
	 student s1=new student();
	 student s2=new student();
	 student.a=10;
	 student.b=20;
	 //s1.display();
	 
		   System.out.println("Addition:"+(student.a+student.b));
		   System.out.println("Subtraction:"+(student.a-student.b));
		   System.out.println("Multiplication:"+(student.a*student.b));
		   System.out.println("Division:"+(student.a/student.b));
		   System.out.println("Remainder:"+(student.a%student.b));
		   System.out.println("======================");
		   
		   s1.a=20;
		   s1.b=30;
		   System.out.println("Addition:"+(s1.a+s1.b));
		   System.out.println("Subtraction:"+(s1.a-s1.b));
		   System.out.println("Multiplication:"+(s1.a*s1.b));
		   System.out.println("Division:"+(s1.a/s1.b));
		   System.out.println("Remainder:"+(s1.a%s1.b));
		   System.out.println("======================");
		   
		   s1.a=30;
		   s1.b=40;
		   System.out.println("Addition:"+(s1.a+s1.b));
		   System.out.println("Subtraction:"+(s1.a-s1.b));
		   System.out.println("Multiplication:"+(s1.a*s1.b));
		   System.out.println("Division:"+(s1.a/s1.b));
		   System.out.println("Remainder:"+(s1.a%s1.b));
		   System.out.println("======================");
   }
 }