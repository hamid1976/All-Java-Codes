import java.util.*;

class Oop5{
	
	public static void main(String arg[]){
		
		Marksheet std1=new Marksheet();
		Marksheet std2=new Marksheet();
		Marksheet std3=new Marksheet();
		
		std1.Set(90,50,70,60,80);
		std2.Set(80,80,90,90,50);
		std3.Set(60,60,65,50,40);
		
		System.out.println("1st Std Result ");
		System.out.println("Obtain Marks: "+std1.Obtain());
		System.out.println("Percentage: "+std1.Percentage());
		System.out.println("Greade: "+std1.Grade());
				
		System.out.print("\n2st Std Result ");
		System.out.println("Obtain Marks: "+std2.Obtain());
		System.out.println("Percentage: "+std2.Percentage());
		System.out.println("Greade: "+std2.Grade());
				
		System.out.print("\n3st Std Result ");
		System.out.println("Obtain Marks: "+std3.Obtain());
		System.out.println("Percentage: "+std3.Percentage());
		System.out.println("Greade: "+std3.Grade());
				
		
		
		
		
	}
}

class Marksheet{
	
	int Java,Vb,Oracle,C,Cpp;
	
	void Set(int a, int b, int c,int d, int e){
		
		  Java=a;
		    Vb=b;
		Oracle=c;
		     C=d;
		   Cpp=e;
	}
	
	int Obtain(){
		
	
		 return Java+Vb+Oracle+C+Cpp;
	}
	
	int Percentage(){
		
		
		return 100*(Java+Vb+Oracle+C+Cpp)/500;
	}
	
	 String Grade(){
		
    	if((100*(Java+Vb+Oracle+C+Cpp)/500)>=90 && (100*(Java+Vb+Oracle+C+Cpp)/500)<=100){return "A-1";
		}
		if((100*(Java+Vb+Oracle+C+Cpp)/500)>=80 && (100*(Java+Vb+Oracle+C+Cpp)/500)<90){return "A";}
		
		if((100*(Java+Vb+Oracle+C+Cpp)/500)>=70 && (100*(Java+Vb+Oracle+C+Cpp)/500)<80){return "B";}
		
		if((100*(Java+Vb+Oracle+C+Cpp)/500)>=60 && (100*(Java+Vb+Oracle+C+Cpp)/500)<70){return "C";}
		
		if((100*(Java+Vb+Oracle+C+Cpp)/500)>=50 && (100*(Java+Vb+Oracle+C+Cpp)/500)<60){return "D";}
		
		if((100*(Java+Vb+Oracle+C+Cpp)/500)>=40 && (100*(Java+Vb+Oracle+C+Cpp)/500)<50){return "E";}
		
		if((100*(Java+Vb+Oracle+C+Cpp)/500)<40){return "F";}
		
		return "";
			
			
	 }
	     
	
}



















