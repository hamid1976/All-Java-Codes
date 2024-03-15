import java.util.*;

class Testloopwhile42{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.print("Enter Any No ");
			int num=as.nextInt();
			
			String str="";
			
			int i=1;
			while(i<=num){
				str=" "+i;
				System.out.println(str);
				
				if(i%20==0){
					System.out.println("press Enter Key to Countiness ");
					String c=as.nextLine();
				}
				i++;
			}
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
