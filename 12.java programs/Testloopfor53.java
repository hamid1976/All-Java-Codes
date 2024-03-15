import java.util.*;

class Testloopfor53{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Any No ");
		int a=as.nextInt();
		
		String str="";
		
		for(int i=0; i<=a; i++){
			
			str=i+"  "+(i+i)+"  "+(i+i+i);
			
			System.out.println(str);
			if(i%20==0){
				
				System.out.println("Press Enter key to countiness ");
			String	c=as.nextLine();
			}
			
		}
		
		
		
	}
}