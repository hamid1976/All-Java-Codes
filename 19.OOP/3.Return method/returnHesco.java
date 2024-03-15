import java.util.*;
class program{
int Hesco(int unit){
unit = unit;
return unit;
}
}
class returnHesco{
	public static void main(String arg []){
		Scanner obj =new Scanner(System.in);
		program ob =new program();
		
		int un =ob.Hesco(obj.nextInt());
		if(un>=1&&un<=100){
		System.out.println(un+" * 2 = "+un*2);
		}
		if(un>=101 && un<=200){
			System.out.println("100 * 2 = 200 ");
			System.out.println(un-100+"  * 4 = "+(un-100)*4);
			System.out.println("charges will be "+((un-100)*4+200));
		}
    }
}