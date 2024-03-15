import java.util.*;
class Hesco{
int unit ;
}

class ObjectHesco{
	public static void main(String arg []){
		Scanner obj =new Scanner (System.in);
		Hesco ob =new Hesco();
		System.out.print("Enter units ");
		ob.unit=obj.nextInt();
		if(ob.unit>=1 && ob.unit<=100){
			System.out.println(ob.unit+" * 2 = "+ob.unit*2);
			System.out.println("charges will be "+ob.unit*2);
		}
		if(ob.unit>200 && ob.unit<=300){
			System.out.println("100 * 2 = 200 ");
			System.out.println("100 * 4 = 400 ");
			System.out.println((ob.unit-200)+" * 6 ="+((ob.unit-200)*6));
			System.out.println("charges will be "+((ob.unit-200)*6));
		}
		}
	}