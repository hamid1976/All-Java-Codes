class Calc{
	static int div(int a,int b){
		if(a<0  || b<0){
			ArithmeticException e=new ArithmeticException("Negative value not allowed");	
			throw e;
		}
		
		int c=a/b;
		
		return c;
	}//end static div
	
	
	static int result(){
		int a=0;
		try{
			System.out.println("inside try");
			System.out.println("10/2 done");
			return a= 10/2;
			
		}catch (ArithmeticException ex){
			System.out.println("inside catch");
			
			System.exit(0);
		}
		finally{
			System.out.println("inside finall");
			System.out.println("a="+a);
			//return a=1010;
		}
		System.out.println("inside finall");
		System.out.println("a="+a);
		
	}
	
}
class TestThrow{
	public static void main(String arg[]){
		int a= Calc.result();
		System.out.println(a);
	// int c;
	// try{
			// c=Calc.div(10,2);
			// System.out.println("Result:"+c);
			
			// c=Calc.div(5,-2);
			// System.out.println("Div="+c);
			
		// }catch(ArithmeticException e){
			
			// System.out.println(e.getMessage());
		// }finally{
			// c=12;
			// System.out.println("Result:"+c);
		// }
			// System.out.println("Program Start");
	// }
}
}