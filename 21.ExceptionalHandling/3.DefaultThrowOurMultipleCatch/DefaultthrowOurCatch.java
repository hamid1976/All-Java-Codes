class DefaultthrowOurCatch{
	public static void main(String arg[]){
		try
		{
			System.out.println("Addition="+ null);
			String a=null;
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception="+ e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception 1="+ e.getMessage());
		}
		System.out.println("Hello");
	}
}