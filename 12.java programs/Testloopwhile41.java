import java.util.*;

class Testloopwhile41{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch='y';
		
		while(ch=='y' || ch=='Y'){
		System.out.println("Enter price until Enter 0 value ");
		//	int num=as.nextInt();
			int str=0, str1=0;
			int i=1;
			while(i<=100){
				
				System.out.print("Enter "+i+" items price ");
				int a=as.nextInt();
				str+=a;
				
				if(a==0){
					System.out.print("Total sum : "+str+"\n\npress Enter Key to Countiness ");
				String	c=as.nextLine();
				String	v=as.nextLine();
					break;
				}
				str1+=1;
				
			}
			System.out.println("You have purchased "+str1+" items ");
			System.out.println("Total Amout is Rs: "+str);
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		
		
	}
}
