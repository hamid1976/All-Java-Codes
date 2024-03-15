class student{
	  int a=10;
	  int b=10;
     student(int c,int d){
		 a=c;
		 b=d;
		 System.out.println("Addition:"+(a+b));
		 System.out.println("Subtraction:"+(a-b));
		 System.out.println("Multiplication:"+(a*b));
		 System.out.println("Division:"+(a/b));
		 System.out.println("Remainder:"+(a%b));
	 }
 	 void show(){
		 System.out.println(a);
		 System.out.println(b);
     }
}		   
class TestCalc_Finalkeyword{
	public static void main(String arg[]){
		final  student ob=new student(10,5);
   }
 }