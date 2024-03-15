import java.util.*;

class marks1{
	
	public static void main(String arg[]){
		Scanner as= new Scanner(System.in);
		
		System.out.print("Enter Jave Marks");
		int a = as.nextInt();
		System.out.print("Enter C++ Marks");
		int b = as.nextInt();
		System.out.print("Enter Oracle marks");
		int c = as.nextInt();
		System.out.print("Enter VB marks");
		int d = as.nextInt();
		System.out.print("Enter C marks");
		int e = as.nextInt();
	
        int marks=a+b+c+d+e;
		int java=100*marks/500;
		
		System.out.print("Obtained marks:"+marks+"\nTotal marks: "+500+"\npercentage: "+java);
        
   



	
	}
}