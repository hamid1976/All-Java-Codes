class Test{
     static boolean isPrime(int num){
		 int count =0;
		 for(int i=2; i<num; i++){
			 if(num%i==0){
				 count=1;
			 }
		 }
		 if(count==1)
			 return false;
			 else
				 return true;
		 
	 }//end isPrime
	 static boolean isEven(int num){
		 
		 if(num%2==0)
			 return true;
		 else 
			 return false;
	 }//end isEven
	 static boolean isOdd(int num){
		 
		 if(num%2==1)
			 return true;
		 else 
			 return false;
	 }//end isOdd
	 static boolean isPositive(int num){
		 if(num>0)
			 return true;
		 else 
			 return false;
	 }//end isPositive
}//end Test
class StaticMethods{
	public static void main(String arg[]){
		boolean a=Test.isPrime(20);
		System.out.println("prime no="+a);
		boolean b=Test.isEven(20);
		System.out.println("Even no="+b);
		boolean c=Test.isOdd(19);
		System.out.println("Odd no="+c);
		boolean d=Test.isPositive(20);
		System.out.println("positive no="+d);
	}
	}