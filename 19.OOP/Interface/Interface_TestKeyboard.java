interface keyboard{
	int A=65;
	int B=66;
	int C=67;

	int Z=90;
	
	int a=97;
	int b=98;
	int c=99;
      
	int z=122;
	
	int space =32;
	int ESC=27;
	int delete=8;
	
}
	
	
class Interface_TestKeyboard{
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