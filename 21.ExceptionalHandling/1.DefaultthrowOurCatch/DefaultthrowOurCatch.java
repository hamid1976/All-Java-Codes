class DefaultthrowOurCatch{
	public static void main(String arg[]){
		
		try{
			System.out.println("Addition="+(3/0));
		}
		catch(ArithmeticException e){
			System.out.println("Exception="+ e.getMessage());
		}
		System.out.println("Hello");
	}
}