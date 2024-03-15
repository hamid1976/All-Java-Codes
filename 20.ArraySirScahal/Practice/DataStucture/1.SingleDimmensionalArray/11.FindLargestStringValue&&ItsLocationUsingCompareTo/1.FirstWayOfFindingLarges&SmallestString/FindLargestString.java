import java.util.*;
class FindLargestString{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		String data[]=new String[size];
		System.out.println("Enter Array Names");
		for(int i=0; i<data.length; i++){
			System.out.print("names["+i+"]=");
			data[i]=ob.next();
		}
	
		int loc=0;
		int greater=0;
	    int num;
		for(int i=0; i<data.length;i++){
				if((num=data[0].compareTo(data[i]))<greater){
						greater=num;
						loc=i;	
				}
		}
		System.out.println(" Largest Name is "+data[loc]+" & its location is "+loc);
		loc=0;
		greater=0;
		for(int i=0; i<data.length;i++){
				if((num=data[0].compareTo(data[i]))>greater){
						greater=num;
						loc=i;
				}
		}
		System.out.println("Smallest Name is "+data[loc]+" & its location is "+loc);
	}
}