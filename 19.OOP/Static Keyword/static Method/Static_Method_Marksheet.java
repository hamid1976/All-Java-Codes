class student{
	int Java;
	int CPP;
	int English;
	int Python;
	int Csharp;
	static void marksheet(){	
	}
	student(int a,int b,int c,int d,int e){
			Java=a;
			CPP=b;
			English=c;
			Python=d;
			Csharp=e;
		System.out.println("Java Marks:"+Java);
		System.out.println("CPP Marks:"+CPP);
		System.out.println("English Marks:"+English);
		System.out.println("Python Marks:"+Python);
		System.out.println("Csharp Marks:"+Csharp);
		int Total=500;
		int Obtained=Java+CPP+English+Python+Csharp;
		System.out.println("\nTotal Marks:"+Total);
		System.out.println("Obtained Marks:"+Obtained);
		int percentage=Obtained*100/Total;
		System.out.println("Percentage  :"+percentage );
	}
	void display(){
		System.out.println(Java+" "+CPP+" "+English+" "+Python+" "+Csharp);
	}
}		
class Static_Method_Marksheet{
   public static void main(String arg[]){
	   student ob=new student(75,85,95,55,60);
       ob.display();  
   }
}