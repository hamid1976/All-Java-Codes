class Calc{
     void add(int a,int b){
	  System.out.println("Addition="+(a+b));
	 }
	 void sub(int a,int b){
	  System.out.println("Subtraction="+(a-b));
	 }
	 void mul(int a,int b){
	  System.out.println("Multiplication="+(a*b));
	 }
	 void div(int a,int b){
	  System.out.println("Division="+(a/b));
	 }
}
	 class CalcPassArg{
		 public static void main(String arg[]){
			Calc ob=new Calc();
            ob.add(10,20);
			ob.add(20,30);
			ob.add(20,20);
			ob.add(40,30);
            ob.sub(10,20);
            ob.mul(10,20);
            ob.div(10,20);
		 }
	 }		 