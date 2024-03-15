// import java.io.*;
// class StringGreaterSmaller{
	// public static void main(String arg[]){
		// String s1="Ali";
		// String s2="Zahid";
		// int num=s1.compareTo(s2);
		
		// System.out.println(num);
		// if(num==0){
			// System.out.println("Both are Equal");
		// }
		// if(num>0){
			// System.out.println("1st String is Greater");
		// }
		// if(num<0){
			// System.out.println("2nd String is Greater");
		// }
	// }
// }

//1st String =65,109,106=280
//2nd String =90,97,104,106,100=497


import java.util.*;
class StringGreaterSmaller{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		
		System.out.println("Enter "+size+" Array Names:");
		
		String data[]=new String[size];
		
		for(int i=0; i<data.length; i++){
			System.out.print("names["+i+"]=");
			data[i]=ob.next();
		}
		
		int num;
		int loc=0;
		int loc1=0;
		
		String max=data[0];
	    String min=data[0];
		
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data.length; j++){
				num=data[i].compareTo(data[j]);
				if(num>0){
					min=data[i];
					loc=i;
					break;
				}
				if(num<0){
					max=data[i];
					loc1=i;
					break;
				}
			}	
		}	
		System.out.println("The Largest name is "+min+"& its Location is "+loc);
		System.out.println("The Smallest name is "+max+"& its Location is "+loc1);
	
		
			
	}	
}