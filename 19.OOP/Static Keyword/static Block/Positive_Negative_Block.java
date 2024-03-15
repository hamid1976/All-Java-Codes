class Positive_Negative_Block{
      static{
	  System.out.println("\nCheck Number is positive or Negative");
	  }
	Positive_Negative_Block(){
        int number=20;		
        if(number > 0){
            System.out.println(number+" is a positive number");
        }
        else if(number < 0){
            System.out.println(number+" is a negative number");
        }
	}
	public static void main(String arg[]){
		Positive_Negative_Block ob =new Positive_Negative_Block();
	}
}