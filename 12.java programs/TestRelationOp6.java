import java.util.*;


class TestRelationOp6{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Rupees  ");
		int a=as.nextInt();
		
		int fivethousand=a/5000;
		int thousand=a/1000;
		int fivehundred=a/500;
		int hundred=a/100;
		int fifty=a/50;
		int twoty=a/20;
		int ten=a/10;
		int five=a/5;
		int two=a/2;
		int one=a/1;
		
		int fivethousand2=a%5000;
		int thousand2=a%1000;
		int fivehundred2=a%500;
		int hundred2=a&100;
		int fifty2=a%50;
		int twoty2=a%20;
		int ten2=a%10;
		
		int five2=a%5;
		int two2=a%2;
		int one2=a%1;
		
		if(fivethousand>fivethousand2 )
			
			System.out.print("\nfivethousand: ");
		else
			System.out.print("\nfivethousand:"+fivethousand2);
		
		if(thousand<thousand2)
			
			System.out.print("\nThousand: ");
		else
			System.out.print("\nThousand: "+thousand2);
		
		if(fivehundred<fivehundred2)
			
			System.out.print("\nFive Hundred: ");
		else
			System.out.print("\nFive Hundred"+hundred2);
		
		if(hundred<hundred2)
			System.out.print("\nHundred: ");
		else
			System.out.print("\nHundred: "+hundred2);
		
		if(fifty<fifty2)
			System.out.print("\nFifty: ");
		else
			System.out.print("\nFifty: "+fifty2);
		
		if(twoty<twoty2)
			System.out.print("\nTwoty: ");
		else
			System.out.print("\nTwoty: "+twoty2);
		
		if(ten<ten2)
			System.out.print("\nTen: ");
		else
			System.out.print("\nTen: "+ten2);
		
		if(five<five2)
			System.out.print("\nFive: ");
		else
			System.out.print("\nFive: "+five2);
		
		if(two<two2)
			System.out.print("\nTwo: ");
		else
			System.out.print("\nTwo: "+two2);
		
		if(one<one2)
			System.out.print("\nOne: ");
		else
			System.out.print("\nOne: "+one2);
		
		
		
		
		
		
		
		
		
		
		
		
		//	if(fivethousand<fivethousand2)
		//	System.out.print("");
		
	//	if(thousand<thousand2)
	//		System.out.print("");
		
	//	if(fivehundred<fivehundred2)
	//		System.out.print("");
		
	//	if(hundred<hundred2)
	//		System.out.print("");
		
	//	if(fifty<fifty2)
	///		System.out.print("");
		
	//	if(twoty<twoty2)
	//		System.out.print("");
		
	//	if(ten<ten2)
	//		System.out.print("");
		
	//	if(five<five2)
	//		System.out.print("");
		
	//	if(two<two2)
	//		System.out.print("");
		
	//	if(one<one2)
	//		System.out.print("");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	System.out.println("Fivethousand: "+fivethousand);
	//	System.out.println("Thousand:     "+thousand);
	//	System.out.println("Fivehundred:  "+fivehundred);
	//	System.out.println("hundred:      "+hundred);
	//	System.out.println("fifty:        "+fifty);
	//	System.out.println("Twoty:        "+twoty);
	//	System.out.println("Ten:          "+ten);
	//	System.out.println("Five:         "+five);
	//	System.out.println("Two:          "+two);
	//	System.out.println("One:          "+one);
		
			
		//}
		

	}
}