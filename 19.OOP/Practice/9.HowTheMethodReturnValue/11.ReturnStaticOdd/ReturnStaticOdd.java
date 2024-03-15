class Odd{
	static boolean isOdd(int num){
		boolean b = true;
			if(num%2==1)
				return true;
			else 
			    return false;
	}//end StaticMethod
}//end Even
class ReturnStaticOdd{
	public static void main(String arg[]){
		for(int i=2; i<=50; i++){
			boolean b=Odd.isOdd(i);
			if(b)
				System.out.println(i);
		}
	}
}