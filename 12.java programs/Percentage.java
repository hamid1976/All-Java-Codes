import java.util.*;

class Percentage{
	
	public static void main(String arg[]){
		
    	Scanner as=new Scanner(System.in);
	
    	System.out.print("Enter Your Percentage ");
        	int a=as.nextInt();
			
    	    if(a>90)
	    	    System.out.print("A-1");
		    else
			    if(a>80)
				    System.out.print("A");
			    else
					if(a>70)
				    System.out.print("B");
				else
					if(a>60)
						System.out.print("C");
					else
						if(a>50)
							System.out.print("D");
						else
							if(a>=40)
								System.out.print("E");
							else
								System.out.print("F");
			
	}
}
	
	