import java.util.*;

class Testloopdowhile40{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			String str="";
			
			int i=1;
			do{
				str=" "+i;
				System.out.println(str);
				
				if(i%20==0){
					System.out.println("press Enter Key to Countiness ");
					String c=as.nextLine();
				}
				i++;
			}
			while(i<=num);
			
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
