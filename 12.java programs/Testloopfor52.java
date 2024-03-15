import java.util.*;

class Testloopfor52{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Table No ");
		int a=as.nextInt();
		
		System.out.print("Enter Counter No ");
		int b=as.nextInt();
		
		String str="";
		
		for(int i=0; i<=b; i++){
			
			str=a+" X "+i+" = "+(a*i);
			System.out.println(str);
			
			
			if(i%20==0){
				System.out.println("press Enter Keyto Continess ");
				String c=as.nextLine();
				
				
			}
			
			
			
			
		}
		
	}
}