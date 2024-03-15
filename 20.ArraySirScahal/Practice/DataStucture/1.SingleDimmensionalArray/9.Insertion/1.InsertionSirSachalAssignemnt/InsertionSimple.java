import java.util.*;
class InsertionSimple{
	public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		
		System.out.println("Enter "+size+" Items");
		
		int data[]=new int[size];
		
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		
		System.out.println("\nTraversing\n");
		
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
					
		}
		
		System.out.println("Which Item You Want to Insert\nEnter Item?");
		int item=ob.nextInt();
		
		System.out.println("Enter Location");
		int loc=ob.nextInt();
		
		System.out.println("\nTraversing\n");
		int array[]=new int [size];
		int j=0;
		for(int i=0; i<array.length; i++){
			if(i==loc){
				array[i]=item;
			}
			else{
				array[i]=data[j];
				j++;
			}
		}
		for(int i=0; i<array.length; i++){
			System.out.println("["+i+"]="+array[i]);
		}
		System.out.println("Item Successfully Inserted");
		
		
		
		
	}
}