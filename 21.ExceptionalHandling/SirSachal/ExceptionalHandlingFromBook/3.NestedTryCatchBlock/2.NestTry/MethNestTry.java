 class MethNestTry{
		static void nesttry(int a){
		try{
				
				if(a==1){
					a=a/(a-1);
				}
				if(a==2){
					int c[]={1};
					c[42]=99;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException"+e);
			}
		}
	public static void main(String arg[]){
		try{
			int a=arg.length;
			int b=42/a;
				System.out.println("a="+a);
				nesttry(a);
		}catch(ArithmeticException e){
			System.out.println("Divided Bu Zero "+e);
		}
	}
}