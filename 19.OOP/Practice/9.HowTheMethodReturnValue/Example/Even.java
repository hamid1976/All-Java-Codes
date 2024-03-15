class Test{
	static boolean isEven(int num){
		boolean b=true;
		//for(int i=1; i<){
		if(num%2==0)
			return true;
		else 
		return false;
	}
}
class Even{
	public static void main(String arg[]){
		Test ob=new Test();
		for(int i=2; i<=50; i++){
			boolean b=Test.isEven(i);
            if(b)
				System.out.println(i);
		}
	}
}