 class NestTry{
	public static void main(String arg[]){
		try{
				int a=2;
				
				int b=42/a;
				System.out.println("a="+a);
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
		}catch(ArithmeticException e){
			System.out.println("Divided Bu Zero "+e);
		}
	}
}