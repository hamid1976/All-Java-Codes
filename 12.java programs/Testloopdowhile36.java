import java.util.*;

class Testloopdowhile36{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			int i=1;
			String str="";
			do{
						
						str+=i;
						
					System.out.println(str);
					
				
				
				i++;
			}
			while(i<=num);
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
