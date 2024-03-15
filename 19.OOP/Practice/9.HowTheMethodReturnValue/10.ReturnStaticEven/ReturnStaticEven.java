class Even{
	static boolean isEven(int num){
		boolean b = true;
			if(num%2==0)
				return true;
			else 
			    return false;
	}//end StaticMethod
}//end Even
class ReturnStaticEven{
	public static void main(String arg[]){
		for(int i=2; i<=50; i++){
			boolean b=Even.isEven(i);
			if(b)
				System.out.println(i);
		}
	}
}