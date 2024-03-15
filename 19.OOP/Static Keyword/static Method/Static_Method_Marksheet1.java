class marksheet{
	  static int java;
	  static int CPP;
	  static int English;
	  static int Python;
	  static int Csharp;
	  
	  static void marks(int a,int b,int c,int d,int e){
		  java=a;
		  CPP=b;
		  English=c;
		  Python=d;
		  Csharp=e;
	  }
	static void Total(){
		int Total=500;
			System.out.println("Total:"+Total);
	}
	static int Obtained(){
		int Obtain=java+CPP+Csharp+English+Python;
		    System.out.println("Obtained:"+Obtain);
			return Obtain;
	}
	static void percentage(int Obtain,int Total){
		    int percentage=Obtain*100/Total;
		    System.out.println("Percentage:"+percentage);
	}    

}		
class Static_Method_Marksheet1{
   public static void main(String arg[]){
	   marksheet ob=new marksheet();
	   marksheet.marks(75,75,75,78,96);
	   marksheet.Total();
	   int Obtained=marksheet.Obtained();
	   marksheet.percentage(Obtained,500);
   }
}