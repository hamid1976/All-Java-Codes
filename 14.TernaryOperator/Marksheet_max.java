import java.util.*;
class Marksheet_max{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Your Percentage:");
		int Per=ob.nextInt();
		
		String grade=Per>100?"Over flow":
		             Per>90?"A1":
				     Per>80?"A":
				     Per>70?"B":
				     Per>60?"C":
				     Per>50?"D":
				     Per>40?"E":"Fail";
	   System.out.print("Your Grade is:"+grade);
	   
	}
}