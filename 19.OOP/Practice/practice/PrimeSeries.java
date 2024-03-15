class Test{
	static boolean isPrime(int n){
	boolean f=true;
		for(int i=2; i<n; i++){
			if(n%i==0){
				f=false;
				break;
			}
		}
		if(f==false){
			return false;
		}else
			return true;
	}
}
class PrimeSeries{
	public static void main(String arg[]){
		for(int i=2;i<50; i++){
		boolean f=Test.isPrime(i);
			if(f)
			System.out.println(i);
		}
	}
}