import java.util.*;

class Testloopfor51{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter any No ");
		int a=as.nextInt();
		
		String str="";
		
	
		
		for(int i=0; i<=a; i++){
			
		str=""+i;	
			
			System.out.println(str);

		if(i%20==0){
			
			
			System.out.println("press enter Key to Continess ");
			String	c=as.nextLine();
				
			}
			
		}
		
		
		
	}
}