class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
class ThrowDemo2{
	public static void main(String arg[]){
		try{
			int age=16;
			if(age<15){
				throw new YoungerAgeException("You are not Eligible");
				
			}else{
				System.out.println("vote Success");
			}
		}catch(YoungerAgeException e){
			e.printStackTrace();
		}
			System.out.println("Hamid");
	}
}