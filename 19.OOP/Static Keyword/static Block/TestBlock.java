class TestBlock{
       static{
	      System.out.println("I am static block");
	   }
	   TestBlock(){
	     System.out.println("\nI am Constructor");
	   }
	  
    public static void main(String arg[]){
       System.out.println("I am main method");
       TestBlock ob1=new TestBlock();
       TestBlock ob2=new TestBlock();
  }
 }






	