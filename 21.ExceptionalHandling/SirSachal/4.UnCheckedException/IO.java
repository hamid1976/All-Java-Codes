class IO{
	public static void main(String arg[]){
		String s1=arg[0];//ArrayIndexOutOfBoundsException
		String s2=arg[1];
		
		int a=Integer.parseInt(s1);//NumberFormatException
		int b=Integer.parseInt(s2);
		
		int c=a/b;//ArithmeticException
		System.out.println("Division="+c);
	}
}