class Test{
	public static void main(String arg[]){
		int balance=5000;
		int withdraw=6000;
		try{
			if(balance<withdraw)
				throw new ArithmeticException("Insuffiencent Balance");
			
			balance=balance-withdraw;
			System.out.println("Transaction Successfully Completed");
		}catch(ArithmeticException e){
			System.out.println("Exception="+e.getMessage());
		}
		
		System.out.println("Program Continue");
	}
}