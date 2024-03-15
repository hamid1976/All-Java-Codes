import java.util.*;
class switchCalculator{
	public static void main(String arg[]){
		Scanner ob =new Scanner(System.in);
		System.out.print("1.Add\n2.Sub \n3.Multi \n4.divi \n5.Remen \nEnter selection ");
		int set = ob.nextInt();
		int a ,b;
		
		switch (set){
			
			case 1 :
			System.out.print("enter Two number ");
			a=ob.nextInt();
	    	b=ob.nextInt();
			System.out.print(a+b);
			break ; 
			case 2:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a-b);
			break ;
			case 3:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a*b);
			break ;
			case 4:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a/b);
			break ;
			case 5:
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a%b);
			break ;
		
		default :
		System.out.print("Invalid");
	}
	}
}