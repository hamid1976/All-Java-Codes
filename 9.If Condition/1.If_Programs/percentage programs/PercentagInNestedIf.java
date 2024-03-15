import java.util.*;
class NestedIf{

    public static void main(String arg[]){
	
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Percentage?");
		int Percentage=ob.nextInt();
		
		
	
		
			
			if(Percentage >=90){
				if(Percentage <=100){
					System.out.print("A1");
				}
			}
			
			if(Percentage >=80){
				if(Percentage <=90){
					System.out.print("A");
				}
			}
			
			if(Percentage >=70){
				if(Percentage <=80){
					System.out.print("B");
				}
			}
			
				if(Percentage >=60){
				   if(Percentage <=70){
					System.out.print("c");
				}
				}
				
				if(Percentage >=50){
				    if(Percentage <=60){
					System.out.print("d");
				}
				}
				
				if(Percentage >=40){
				    if(Percentage <=50){
					System.out.print("e");
					
				}
				}
				
				if(Percentage <=39){
					System.out.print("Fail");
					
				}
				
				
				
			
			
	}
}		