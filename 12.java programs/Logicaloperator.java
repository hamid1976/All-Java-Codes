import java.util.*;

class Logicaloperator{
	
	public static void main(String arg[]){
		
		boolean b1= 10>5  && 10==10;
		boolean b2= 10>=5 && 10!=5 && 5==5   && 10>100;
		boolean b3= 5>10  || 5<5   || 50>100 || 10>5;
		boolean b4= 10>5  || 10>100 || 50>100;
		boolean b5= !(10>5);
		boolean b6= !(10>100);
		boolean b7= !(!(!(!(10==10))));
		
		
		
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+"\n"+b5+"\n"+b6+"\n"+b7);
		
	}
}