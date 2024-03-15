class Test{
	static boolean isPrime(int num){
	boolean found=true;
		for(int i=2; i<num; i++){
			if(num%i==0){
				found =false;
			}
		}
		if(found==true)
			return true;
		else 
			return false;
	}
}
class Prime{
	public static void main(String arg[]){
		for(int i=2; i<=50; i++){
			boolean found=Test.isPrime(i);
			System.out.println(i);
			if(found)
				System.out.println(i);
		}
	}
}