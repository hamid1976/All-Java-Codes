import java.util.*;
class ForloopFactorial_By_Sir{
	public  static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
    System.out.print("Enter any NO:");
	int num=ob.nextInt();
	int fact=1;
	
	for(int  f=1; f<=num; f++){
		fact*=f;
	}
	
    System.out.println("Factorial is:="+fact);
	}
}