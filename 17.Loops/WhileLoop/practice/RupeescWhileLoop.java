import java.util.*;		
class RupeescWhileLoop{
	public static void main(String arg[]){
		
		Scanner ob = new Scanner(System.in);
		char ch = 'y';
		while(ch=='y'||ch=='Y'){
		System.out.print("Enter Rupees ");
		int Rupees = ob.nextInt();
		
		int FThousand = Rupees/5000;
		int remain    = Rupees%5000;
		
		int thousand  = remain/1000;
        int remaining2= remain%1000;
        
		int fHundred  = remaining2/500;
        int remaining3=	remaining2%500;
        
		int hundred   = remaining3/100;
        int remaining4= remaining3%100;		
		
		int Fifty     = remaining4/50;
		int remaining5=	remaining4%50;

        int twenty    = remaining5/20;
        int remaining6=	remaining5%20;	
		
		int ten       = remaining6/10;
		int remaining7= remaining6%10; 
		
		int five      = remaining7/5;
		int remaining8= remaining7%5;
		
		int two       = remaining8/2;
		
		int One       = remaining8%2;
				
		System.out.println("5000 :"+FThousand);
		System.out.println("1000 :"+thousand);
		System.out.println("500  :"+fHundred);
		System.out.println("100  :"+hundred);
		System.out.println("50   :"+Fifty);
		System.out.println("20   :"+twenty);
		System.out.println("10   :"+ten);
		System.out.println("5    :"+five);
		System.out.println("2    :"+two);
		System.out.println("1    :"+One);
	System.out.print("\nDo you  want to do more calculate Y/n ?");  
	ch=ob.next().charAt(0);
	}
	}
}	