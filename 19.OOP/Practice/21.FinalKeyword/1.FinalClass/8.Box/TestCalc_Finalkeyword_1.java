final class Box{
	   int a;
	   int b;
	 
	 Box(int c,int d){
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
class TestCalc_Finalkeyword_1{
 public static void main(String arg[]){
	 Box ob=new Box(10,5);
	 
	 
   }
 }