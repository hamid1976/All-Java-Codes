class Calc{
	 
	void Test(){
	     System.out.println("I am  1st Test Method");
		 }
    final double sqr(int num){
       return num*num;
    }
}
class calcImp extends  Calc{
   void Test(){
	     System.out.println("I  am 2nd Test Method");
		 }
}
class CalcImp extends  Calc{
   void Test(){
	     System.out.println("I  am 3rd Test Method");
		 }
}

class Calculator_Final_Method{
 public static void main(String arg[]){
	 Calc ob=new Calc();
	 ob.Test();
	    double r1=ob.sqr(10);
		   System.out.println(r1);
	 
	 
 }
 
 }
