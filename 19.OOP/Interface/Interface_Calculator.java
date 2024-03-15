interface Calc{
     void add(int a, int b);
	 void sub(int a, int b);
	 void mul(int a, int b);
	 }
class Calculator implements Calc{
      public void add(int a,int b){
         System.out.println("ADDition="+(a+b));
      }
	  public void sub(int a,int b){
         System.out.println(a-b);
      }
	  public void mul(int a,int b){
         System.out.println(a*b);
      }
}
class Interface_Calculator{
public static void main(String arg[]){
Calculator ob=new Calculator();
ob.add(10,10);
ob.sub(20,10);
ob.mul(10,5);
}
}
      