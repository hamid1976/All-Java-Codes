import java.util.*;

class A{
	
	int a=10;
	static int b=20;
	public static void main(String arg[]){
		
		A r=new A();
		A.Show();
		r.Disp();
		
		
		
	}
	
	
	static void Show(){
	
	System.out.println(
	"Show"+b);
}

void Disp(){
	
	System.out.println("Disp()"+a+" "+b);
}

}

