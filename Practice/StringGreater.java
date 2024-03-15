import java.util.*;
class StringGreater{
	public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=ob.nextInt();
		String data[]=new String[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length;i++){
			data[i]=ob.next();
		}
		// System.out.println("Enter Item you want to Search:");
		// String item=ob.next();
		//int loc=0;
			boolean b=true;
			int greater=0;
			int loc=0;
			int num;
		for(int i=0; i<data.length; i++){
			if(( num=data[0].compareTo(data[i]))<greater){
				num=greater;
				loc=i;
			}
		}
			System.out.println(" Largest name found  "+data[loc]+" on location"+loc);
		greater=0;
		loc=0;
		for(int i=0; i<data.length; i++){
			if(( num=data[0].compareTo(data[i]))>greater){
				num=greater;
				loc=i;
			}
		}
			System.out.println(" Smallest name found  "+data[loc]+" on location"+loc);
		
			
	}
}