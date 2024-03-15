import java.util.*;

class Testswitch5{
	
	public static void main(String arg[]){
		Scanner as=new Scanner(System.in);
		
		System.out.print("unit Convertor  \n\n1.Feet to Inches\n2.Inches to Feet\n3.Kilo to grams\n4.Grams to Kilo\n\nEnter Selection ");
		int search=as.nextInt();
		
		switch(search){
			case 1:System.out.print("Enter Feet No ");
			       int feet=as.nextInt();
				   
				   int Inches=feet*12;
				   
				   System.out.print("Inches will be: "+Inches);break;
				   
			case 2:System.out.print("Enter Inches No ");
		           int inches=as.nextInt();
				   
				   int feet1=inches/12;
				   
				   System.out.print("Feet will be: "+feet1);break;
				   
			case 3:System.out.print("Enter Kilo No ");
			       int kilo=as.nextInt();
				   
				   int grams=kilo*1000;
				   
				   System.out.print("Grams will be: "+grams);break;
				   
			case 4:System.out.print("Enter Grams No ");
			       int grams1=as.nextInt();
				   
				   int kilo1=grams1/1000;
				   
				   System.out.print("Kilo will be: "+kilo1);break;
				   
		   default:System.out.print("Invalid Unit Convertor");
		}
		
	}
}