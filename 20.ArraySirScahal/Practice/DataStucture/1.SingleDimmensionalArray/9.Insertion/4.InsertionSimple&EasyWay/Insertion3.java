import java.util.*;
class Insertion3{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size= ob.nextInt();
		
		System.out.println("Enter "+size+" Items");
		
		int data[]=new int[size];
		
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		
		System.out.println("------Traversing---------");
		
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		
		System.out.print("Which Item you want to insert \nEnter Item:");
		int item=ob.nextInt();
		
		System.out.print("On Which location you want to inser item \nEnter Location:");
		int loc=ob.nextInt();
		
		int array[]=new int[size];
		int j=0;
		for(int i=0; i<array.length; i++){
			if(i==loc){
				array[i]=item;
			}else{
				array[i]=data[j];
				j++;
			}
		}
		System.out.println("------Traversing---------");
		
		for(int i=0; i<array.length; i++){
			System.out.println("["+i+"]="+array[i]);
		}
		
		System.out.println("Item Inserted Successfully");
		
	}
}