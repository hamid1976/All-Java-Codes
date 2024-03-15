import java.util.*;
class unitcovertswitc{
	public static void main (String ar[]){
		 Scanner ob=new Scanner(System.in);
			System.out.print("1.feet To Inch \n2.Inch to Feet \n3.kilometer to Meter \n4.Meter to Kilometer");
			int set =ob.nextInt();
			int a;
			switch (set){
				case 1 :
				System.out.print("Enter feet ");
				a = ob.nextInt();
				System.out.print("Inch Equal to :"+(a*12));
				break;
				case 2 :
				System.out.print("Enter Inch ");
				a = ob.nextInt();
				System.out.print("feet Equal to :"+(a/12));
				break ;
				case 3 :
				System.out.print("Enter Kilometer ");
				a = ob.nextInt();
				System.out.print("Meter Equal to :"+(a*1000));
				break ;
				case 4:
				System.out.print("Enter Meter ");
				a = ob.nextInt();
				System.out.print("Kilometer Equal to :"+(a/1000));
				break ;
			
			default :
			System.out.print("Invalid");
	}
}}
			
			