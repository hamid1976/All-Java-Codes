class Calc{
	void Test(){
		System.out.println("I am 1st Test");
	}
	final double sqr(int num){
		int result=num*num;
		return result;
		
	}
}
class calcImp extends Calc{
	void Test(){
		System.out.println("I am 2nd Test");
	}
}
class CalcImp extends Calc{
	void Test(){
		System.out.println("I am 3rd Test");
	}
}
class FinalMethod{
	public static void main(String arg[]){
		Calc ob=new Calc();
		ob.Test();
		double a=ob.sqr(5);
		System.out.println("Square ="+a);
	}
}