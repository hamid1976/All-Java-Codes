class Test{
	public static void main(String arg[]){
		final int a=10;
		
		System.out.println(a);
		//a=20;  //error :cant assign values to find variable a
		final int b;
		b=10;//ok
		System.out.println(b);
		
		//b=30; //error :Variable b might already habe been assigned
	}
}