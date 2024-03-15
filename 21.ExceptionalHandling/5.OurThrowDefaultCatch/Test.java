class Test{
	public static void main(String arg[]){
		int balance=5000;
		int withdraw=6000;
		
		if(balance<withdraw)
			throw new ArithmeticException("Insuffiencent Balance");
		
		balance=balance-withdraw;
		System.out.println("Transaction Successfully Completed");
		System.out.println("Program Continue");
	}
}