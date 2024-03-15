import java.util.*;
class NameInNestedforloopInTwoDim{
	public static void main(String arg[]){
		String records[][]={{"ALi","imran","Memon","10"},{"Hyder","irfan","Soomro"},{"Jibran","bilawal","Joyo"}};
		for(int rows=0; rows<records.length;rows++){
			for(int col=0; col<records.length;col++){
			System.out.println(records[rows][col]);	
			}
			System.out.println("---------------------------");
		}
	}
}