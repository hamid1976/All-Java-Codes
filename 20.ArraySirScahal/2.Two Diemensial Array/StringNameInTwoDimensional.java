import java.util.*;
class StringNameInTwoDimensional{
	public static void main(String arg[]){
		String records[][]={{"ALi","imran","Memon","10"},{"Hyder","irfan","Soomro"},{"Jibran","bilawal","Joyo"}};
		for(int rows=0; rows<records.length;rows++){
			System.out.println("Name:"+records[rows][0]);
			System.out.println("FName:"+records[rows][1]);
			System.out.println("Surname:"+records[rows][2]);
			System.out.println("---------------------------");
		}
	}
}
			