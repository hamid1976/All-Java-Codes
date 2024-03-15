class Test{
	public static void main(String arg[]){
	//int prime[]={2,3,5,7,11};
	int[] account=new int[10];
		// for(int i=0; i<2; i++){
			// prime[4-i]=prime[i];
		// System.out.print(prime[i]);//output 2,3
		// }
		// for(int i=0; i<5; i++){
			// prime[i]++;
		// System.out.print(prime[i]);//output 3,4,6,8,12
		// }
		for(int i=0; i<10; i++){
			account[i]=new BankAccount();
			System.out.print(account[i]);
		}
	}
}
