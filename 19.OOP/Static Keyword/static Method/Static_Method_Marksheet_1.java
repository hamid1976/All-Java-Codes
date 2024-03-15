class Marksheet{
	 static void marks(int a,int b,int c,int d,int e){
		 System.out.println("Java Marks:"+a);
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
}		
class Static_Method_Marksheet_1{
	public static void main(String arg[]){
		Marksheet.marks(55,85,75,75,85);
	}
}