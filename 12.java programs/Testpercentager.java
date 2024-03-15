import java.util.*;

class Testpercentager{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Percentage ");
		int per=as.nextInt();
		
		String percentage=per>=100?"ourtlow"   :per>=90?"A1"  :per>=80?"A"  :per>=70?"B" :per>=60?"C" :per>=50?"D":per>=40?"E":"Fail";
		
//		String percentage2=per>=90?"A1":"";
		
//		String percentage3=per>=80?"A":"";
		
//		String percentage4=per>=70?"B":"";
		
//		String percentage5=per>=60?"C":"";
		
//		String percentage6=per>=50?"E":"";
		
//		String percentage7=per>=40?"F":"";
		
		
		System.out.print("\nYour Greater is "+percentage);
		
	}
}