class Calculator{
	int fact(int n){
		int res=1;
		for(int i=1; i<=n; i++){
			res=res*i;
		}
		return res;
	}//end fact
	boolean even(int n){
		if(n%2==0)
		    return true;
		else
			return false;
	}//end even
	boolean isPrime(int n){
		int count=0;
		for(int i=2; i<=n; i++){
			if(n%i==0)
				count++;
		}
		if(count==1)
			return true;
		else
			return false;
    }//end primeno
    boolean isPositive(int n){
		if(n>0)
			return true ;
		else 
			return false;
   }//end positive
}
class ReturnMethod{
	public static void main(String arg[]){
		Calculator ob=new Calculator();
		
		int a=ob.fact(5);
		System.out.println("Factorial="+a);
		
		boolean b=ob.even(20);
		System.out.println("Even number="+b);
		
		boolean c=ob.isPrime(19);
		System.out.println("Prime number="+c);
		
		boolean d=ob.isPrime(19);
		System.out.println("positive num="+d);
	}
}