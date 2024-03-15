import java.util.*;
class likeAtm{
     int Rupees ,rupees;
	 int _5000;
	 int _1000;
	 int _500;
	 int _100;
	 int _50;
	 int _20;
	 int _10;
	 int _5;
	 int _2;
	 int _1;
	 }
class ObjAtm{
	public static void main (String arg []){
		Scanner ob =new Scanner (System.in);
			 likeAtm ob1 =new likeAtm();
			 likeAtm ob2 =new likeAtm();
			 ob1.Rupees=ob.nextInt();
			 
			 ob1._5000=ob1.Rupees/5000;
			 ob1.rupees =ob1.Rupees%5000;
			 
			 ob1._1000 =ob1.rupees/1000;
			 ob1.rupees=ob1.rupees%1000;
			
			 ob1._500 =ob1.rupees/500;
			 ob1.rupees=ob1.rupees%500;
			 
			 ob1._100 =ob1.rupees/100;
			 ob1.rupees=ob1.rupees%100;
			 
			 ob1._50 =ob1.rupees/50;
			 ob1.rupees=ob1.rupees%50;
			 
			 ob1._20 =ob1.rupees/20;
			 ob1.rupees=ob1.rupees%20;
			 
			 ob1._10 =ob1.rupees/10;
			 ob1.rupees=ob1.rupees%10;
			 
			 ob1._5 =ob1.rupees/5;
			 ob1.rupees=ob1.rupees%5;
			 
			 ob1._2 =ob1.rupees/2;
			 ob1.rupees=ob1.rupees%2;
			 
			 System.out.println("5000  : "+ob1._5000);
			 System.out.println("1000  : "+ob1._1000);
			 System.out.println("500   : "+ob1._500);
			 System.out.println("100   : "+ob1._100);
			 System.out.println("50    : "+ob1._50);
			 System.out.println("20    : "+ob1._20);
			 System.out.println("10    : "+ob1._10);
			 System.out.println("5     : "+ob1._5);
			 System.out.println("2     : "+ob1._2);
			 System.out.println("1     : "+ob1.rupees+"\n");
			  ob2.Rupees=ob.nextInt();
			 
			 ob2._5000  =ob2.Rupees/5000;
			 ob2.rupees =ob2.Rupees%5000;
			 
			 ob2._1000 =ob2.rupees/1000;
			 ob2.rupees=ob2.rupees%1000;
			
			 ob2._500  =ob2.rupees/500;
			 ob2.rupees=ob2.rupees%500;
			 
			 ob2._100  =ob2.rupees/100;
			 ob2.rupees=ob2.rupees%100;
			 
			 ob2._50   =ob2.rupees/50;
			 ob2.rupees=ob2.rupees%50;
			 
			 ob2._20   =ob2.rupees/20;
			 ob2.rupees=ob2.rupees%20;
			 
			 ob2._10   =ob2.rupees/10;
			 ob2.rupees=ob2.rupees%10;
			 
			 ob2._5    =ob2.rupees/5;
			 ob2.rupees=ob2.rupees%5;
			 
			 ob2._2    =ob2.rupees/2;
			 ob2.rupees=ob2.rupees%2;
			 
			 System.out.println("5000  : "+ob2._5000);
			 System.out.println("1000  : "+ob2._1000);
			 System.out.println("500   : "+ob2._500);
			 System.out.println("100   : "+ob2._100);
			 System.out.println("50    : "+ob2._50);
			 System.out.println("20    : "+ob2._20);
			 System.out.println("10    : "+ob2._10);
			 System.out.println("5     : "+ob2._5);
			 System.out.println("2     : "+ob2._2);
			 System.out.println("1     : "+ob2.rupees);
		 }
	 } 