class DefaultthrowOurCatch{
	public static void main(String arg[]){
		try
		{
			System.out.println("Addition="+(3/0));
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception="+ e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception="+ e.getMessage());
		}finally{
			System.out.println("Hamid");
		}
		System.out.println("Hello");
		
	}
}