import java.util.*;

class TestHescobill{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Units Bill ");
		int bill=as.nextInt();
		
		int a1=bill%100*4;
		int a2=bill%200*6;
		int a3=bill%300*8;
		int a4=bill%400*10;
		
		if(bill>=1 && bill<100){
			System.out.print(bill+"*="+(bill*2));
			
			System.out.print("\nYour Hesco bill "+bill*2);
		}
		if(bill>=100 && bill<200){
			
			System.out.print("100*2=200\n");
			
			System.out.print(bill%100+"*4="+a1);
			
			System.out.print("\nTotal Hesco bill "+(a1+200));
		}
		if(bill>=200 && bill<300){
			System.out.print("100*2=200\n");
			System.out.print("100*4=400\n");
			System.out.print(bill%200+"*6="+a2);
			System.out.print("\nTotal Hesco bill "+(a2+600));
		}
		if(bill>=300 && bill<400){
			System.out.print("100*2=200\n");
			System.out.print("100*4=400\n");
			System.out.print("100*6=600\n");
			System.out.print(bill%300+"*8="+a3);
			System.out.print("\nTotal Hesco bill "+(a3+1200));
		}
		if(bill>=400 && bill<500){
			System.out.print("100*2=200\n");
			System.out.print("100*4=400\n");
			System.out.print("100*6=600\n");
			System.out.print("100*8=800\n");
			System.out.print(bill%400+"*10="+a4);
			System.out.print("\nTotal Hesco bill "+(a4+2000));
		}
		
	}
}