class Outer{
  int outer;
    Outer(int outer){
	   this.outer=outer;
	   System.out.println("Outer="+outer);
   }
   void sub(){
	  
	   System.out.println("Outer1 Sub="+outer); 
   }
   void mul(){
	  
	   System.out.println("Outer1 mul="+outer); 
   }
}
   class Test2{
	   public static void main(String arg[]){
	   Outer outer=new Outer(10);
	   Outer outer1=new Outer(12);
	   outer.sub();
	   outer1.mul();
   }
}
   