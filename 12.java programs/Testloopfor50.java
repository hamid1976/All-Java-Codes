import java.util.*;

class Testloopfor50{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		int str=0; int str1=0;
		System.out.println("Enter price until enter 0 value");
		
		
		
		
		for(int i=1; i<=100; i++){
			
			System.out.print("Enter "+i+" item price ");
			int a=as.nextInt();
			str+=a;
			
			if(a==0){
				
				System.out.println("Total sum: "+str+"\n\nPress Enter key to Countiness ");
            	String c=as.nextLine();
				String v=as.nextLine();
			
			break;	
			}
			
				
			str1+=1;
		
			
		}
	
		
			System.out.print("you have purchased "+str1+" items\n");
    		System.out.print("Total Amout is Rs. "+str);
	
		
		 
		
		
	
		
	}
}









//	if(break;){
		//		System.out.print("Total sum: "+str+"\n");
		//        as.nextLine();
		//	}
		
		
		
		
		//	System.out.print("Total sum: "+str+"\n\nPress Enter 1 key to Countiness");
    	//   int c=as.nextInt();
		
		
	//	if(c){}










