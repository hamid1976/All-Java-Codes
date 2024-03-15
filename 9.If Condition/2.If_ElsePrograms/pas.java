/*class pas{
	public static void main (String arg []){
	String  s ="Sindhi";
	String str =s.substring(3,5);
	int size =s.length();
	System.out.println("5 is ending "+str);
	}
}*/
import java.util.*;
class pas{
	public static void main (String arg []){
		Scanner ob=new Scanner(System.in);
	System.out.println("Enter pasword ");
	String  psw =ob.next();
	if(psw.equals("alijaan")||psw.equals("alichanna")||psw.equals("aliraza"))
		System.out.println("well come");
	else
		System.out.println("wrong pasword ");
	
	}
}
