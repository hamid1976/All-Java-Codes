class Box{
	static void calc(final int num){
		System.out.println(num);
		//num+=50;//error :final parameter num may not be assigned
	}
}
class Test{
	public static void main(String arg[]){
		int n=10;
		Box.calc(n);
		System.out.println(n);
	}
}