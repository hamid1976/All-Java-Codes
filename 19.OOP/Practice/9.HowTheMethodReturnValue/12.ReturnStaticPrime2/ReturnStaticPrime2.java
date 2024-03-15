class Prime{
	static boolean isPrime(int num){
		int found = 0;
		for(int i=2; i<num; i++){
			if(num%i==0){
				found=1;
				break;
			}
		}
		if(found==1)
			return false;
		else
			return true;
	}//end StaticMethod
}//end Prime

class ReturnStaticPrime2{
	public static void main(String arg[]){
		for(int i=2; i<=50; i++){
			boolean found=Prime.isPrime(i);
			if(found)
				System.out.println(i);
		}
	}
}