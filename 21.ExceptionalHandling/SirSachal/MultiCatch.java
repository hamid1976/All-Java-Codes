class MultiCatch{
	public static void main(String arg[]){
		try{
			int a=arg.length;
			System.out.println("a="+a);
			int b=42/a;
			int c[]={1};
			c[42]=99;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds="+e);
		
		}catch(ArithmeticException e){
			System.out.println("Divide By 0="+e);
		System.out.println("After try/catch blocks.");
		}
			/*a=0
			Divide By 0=java.lang.ArithmeticException: / by zero
			After try/catch blocks.
			
			a=1
			Array Index Out Of Bounds=java.lang.ArrayIndexOutOfBoundsException: 42
			After try/catch blocks.
			*/
	}
}