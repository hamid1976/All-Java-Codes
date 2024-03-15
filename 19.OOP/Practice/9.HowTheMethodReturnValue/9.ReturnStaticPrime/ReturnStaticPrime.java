class Prime{
	static boolean isPrime(int num){
		boolean found = true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				found=false;
				break;
			}
		}
		if(found==false)
			return false;
		else
			return true;
	}//end StaticMethod
}//end Prime

class ReturnStaticPrime{
	public static void main(String arg[]){
		for(int i=2; i<=50; i++){
			boolean found=Prime.isPrime(i);
			if(found)
				System.out.println(i);
		}
	}
}