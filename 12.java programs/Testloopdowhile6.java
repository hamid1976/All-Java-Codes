import java.util.*;

class Testloopdowhile6{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		char ch;
		
		do{
		System.out.print("Enter the Rupees ");
			int a=as.nextInt();
			
			int fivethousand=a/5000;
			a = a%5000;
			
			int thousand=a/1000;
			a = a%1000;
			
			int fivehundred=a/500;
			a = a%500;
			
			int hundred=a/100;
			a = a%100;
			
			int fifty=a/50;
			a = a%50;
			
			int twoty=a/20;
			a = a%20;
			
			int ten=a/10;
			a = a%10;
			
			int five=a/5;
			a = a%5;
			
			int two=a/2;
			a = a%2;
			
			int one=a/1;
			a = a%1;
			
			System.out.println("Five Thousand: "+fivethousand);
			System.out.println("Thousand: "+thousand);
			System.out.println("Five Hundred: "+fivehundred);
			System.out.println("Hundred: "+hundred);
			System.out.println("fifty: "+fifty);
			System.out.println("Twoty: "+twoty);
			System.out.println("Ten: "+ten);
			System.out.println("Five: "+five);
			System.out.println("Two: "+two);
			System.out.println("One: "+one);
		
		
			
			
			System.out.print("\nDo you want to run this system again Enter 'y' ");
			ch=as.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
		
		
	}
}
