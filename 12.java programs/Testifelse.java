import java.util.*;

class Testifelse{
	
	public static void main(String arg[]){
		
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Month No ");
		int m=as.nextInt();
		
		if(m==11 || m==12 || m==1)
			System.out.print("winter");
		else
			if(m>=2  && m<=4)
				System.out.print("Spring");
			else
				if(m>=5  && m<=7)
					System.out.print("Summar");
				else
					if(m>=8  && m<=10)
						System.out.print("Autimn");
					else
						System.out.print("Invalid Month No");
					
	}
}