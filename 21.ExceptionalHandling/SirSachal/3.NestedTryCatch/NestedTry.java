class NestedTry{
	public static void main(String arg[]){
		try{
			String s1=arg[0];
			String s2=arg[1]; 
			
			try{
				int a=Integer.parseInt(s1);
				int b=Integer.parseInt(s2);
				
				try{
					int result=a/b;
					System.out.println("Division="+result);
				}catch(ArithmeticException e){
					System.out.println("2nd arg must not be zero:"+e.getMessage());
				}
				System.out.println("Outside of ArithmeticException");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Both Arg must be int:"+e.getMessage());
			}
				System.out.println("Outside of NumberFormatException");
		}catch(NumberFormatException e){
				System.out.println("Please Pass Two cmd line args:"+e.getMessage());
		}
			//System.out.println("Outside of ArrayIndexOutOfBoundsException");
				System.out.println("Good Bye");
	}
}