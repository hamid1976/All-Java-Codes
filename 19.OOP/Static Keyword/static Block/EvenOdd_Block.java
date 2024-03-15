class EvenOdd_Block{
	static{
		   System.out.println("\nEven Odd");
		}
		EvenOdd_Block(){
			int number=20;
		if(number % 2 == 0)
        {
            System.out.println(number+"is Even number");
        }
        else 
        {
            System.out.println(number+" is odd number");
        }
	}		
			
	public static void main(String arg[]){
		EvenOdd_Block ob=new EvenOdd_Block();    
    }
}