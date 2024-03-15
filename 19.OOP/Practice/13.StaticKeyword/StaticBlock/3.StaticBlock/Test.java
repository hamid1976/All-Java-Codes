class Test{
	static int a=getValue();
	static {
		a=a*10;
		System.out.println("I am static block "+a);
	}
	public static void main(String arg[]){
		System.out.println("I am main Method");
	}
	static int getValue(){
		System.out.println("I am getValue() Method");
		return 10;
	}
}
		