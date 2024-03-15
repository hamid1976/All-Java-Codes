class Marksheet_Block{
	 static{
		  System.out.println("\nMarksheet");
	  }
	  Marksheet_Block(){
		 int a=75;
		 int b=85;
		 int c=96;
		 int d=78;
		 int e=45;
		 System.out.println("\nJava Marks:"+a);
		 System.out.println("CPP Marks:"+b);
		 System.out.println("English Marks:"+c);
		 System.out.println("Python Marks:"+d);
		 System.out.println("Csharp Marks:"+e);
		 int Total=500;
		 int Obtained=a+b+c+d+e;
		 System.out.println("\nTotal Marks:"+Total);
		 System.out.println("Obtained Marks:"+Obtained);
		 int percentage=Obtained*100/Total;
		 System.out.println("Percentage  :"+percentage );
	 }

	public static void main(String arg[]){
		Marksheet_Block ob=new Marksheet_Block();
	}
}