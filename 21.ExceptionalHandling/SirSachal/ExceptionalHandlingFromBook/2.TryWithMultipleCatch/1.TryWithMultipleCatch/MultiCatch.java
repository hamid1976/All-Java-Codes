class MultiCatch{
	public static void main(String arg[]){
		try{
			int a=arg.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArithmeticException e){
			System.out.println("Divide By 0="+e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds="+e);
		}
		System.out.println("After try/catch blocks.");
	}
}