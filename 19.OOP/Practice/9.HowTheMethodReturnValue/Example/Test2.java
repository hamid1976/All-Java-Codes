class prog{
	int factorial(int num){
		int fact=1;
		for(int i=1; i<=num; i++){
		    fact=fact*i;
		}
			return fact;
	}//end factorial
	String Even(int num){
		if(num%2==0){
			return "Even number";
		}else{
			return "Odd Number";
		}
	}//end Even
	String isPositive(int num){
		if(num>0){
			return "Positive number";
		}else{
			return "Negative number";
		}
	}//end isPositive
	String isPrime(int num){
		int counter=0;
		for(int i=2; i<num; i++){
			if(num%i==0){
				counter=1;
			}
		}
		if(counter==0){
			return "Prime No";
		}else{
			return "Not a Prime No";
		}
	}//end isPrime
}
class Test2{
	public static void main(String arg[]){
		prog ob=new prog();
		int fact=ob.factorial(6);
		String Even=ob.Even(19);
		String Positive=ob.isPositive(-5);
		String Prime=ob.isPrime(20);
		System.out.println("Factorial="+fact);
		System.out.println(Even);
		System.out.println(Positive);
		System.out.println(Prime);
	}
}