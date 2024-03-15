class Test{
	public static void main(String arg[]){
		try{
			String s1=arg[0];
			String s2=arg[1];
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			
			int result=a/b;
			System.out.println("Division="+result);
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("Please Pass Two cmd Arguments:"+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please Pass Two Integer from cmd Line:"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("2nd Argument must not be zero"+e);
		}
		catch(Exception e)
		{
			System.out.println("General Error:"+e);
		}
		System.out.println("Good Bye");
	}
}