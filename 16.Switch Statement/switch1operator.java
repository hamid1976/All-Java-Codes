import java.util.*;
class switch1operator{
	public static void main(String arg[]){
		Scanner ob =new Scanner(System.in);
		System.out.print("1.Add\n2.Sub \n3.Multi \n4.divi \n5.Remen \nEnter selection");
		String str = ob.next();	
		//char ope = str.charAt(0);
		int a ,b;
		
		switch (str){
			
			case "+" :
			System.out.print("enter Two number ");
			a=ob.nextInt();
	    	b=ob.nextInt();
			System.out.print(a+b);
			break ; 
			case "-":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a-b);
			break ;
			case "*":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a*b);
			break ;
			case "/":
			System.out.print("enter Two number ");
			a=ob.nextInt();
		    b=ob.nextInt();
			System.out.print(a/b);
			break ;
			case "%":
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
			
		
