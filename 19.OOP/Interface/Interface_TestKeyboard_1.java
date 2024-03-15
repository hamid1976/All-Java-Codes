abstract interface keyboard{
	
	public static final int A=65;
	public static final int B=66;
	public static final int C=67;

	public static final int Z=90;
	
	public static final int a=97;
	public static final int b=98;
	public static final int c=99;
     
	public static final int z=122;
	
	public static final int space =32;
	public static final int ESC=27;
	public static final int delete=8;
	
}
	
	
class Interface_TestKeyboard_1{
   public static void main(String arg[]){
	 System.out.println(keyboard.A);
	 System.out.println(keyboard.B);
	 System.out.println(keyboard.C);
	 
	 System.out.println(keyboard.Z);
	 
	 System.out.println(keyboard.a);
	 System.out.println(keyboard.b);
	 System.out.println(keyboard.c);
	 
	 System.out.println(keyboard.z);
	 
	 System.out.println(keyboard.space);
	 System.out.println(keyboard.ESC);
	 System.out.println(keyboard.delete);
  }
}