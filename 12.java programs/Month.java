import java.util.*;

class Month{
	
	public static void main(String arg[]){
    	Scanner as=new Scanner(System.in);
		
		System.out.print("Enter Month No? ");
		int a=as.nextInt();
		
		if(a==1 || a==11 || a==12)
			System.out.print("Winter");
		
		if(a==2 || a==3 || a==4)
			System.out.print("Spring");
		
		if(a==5 || a==6 || a==7)
			System.out.print("Summar");
		
		if(a==8 || a==9 || a==10)
			System.out.print("Automn");
		
		if(a<1  || a>=13){
			System.out.print("Invalid Month No- Month No- Must Enter in Between 1 to 12");
		}
	}
}