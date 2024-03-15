import java.util.*;
class LinearSearching{
	public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
	System.out.print("Enter Array Size:");
	int size=ob.nextInt();
	int data[]=new int[size];
	System.out.println("Enter "+size+" Items");
	
	for(int i=0; i<data.length; i++){
		data[i]=ob.nextInt();
	}//for taking input
	int min=data[0];
	int loc=0;
	for(int i=0; i<data.length; i++){
		if(data[i]<min){
			min=data[i];
			loc=i;
		}
	}
		System.out.println(min+ " is the smallest & Its Location is " +(loc+1));
	
	}
}
	