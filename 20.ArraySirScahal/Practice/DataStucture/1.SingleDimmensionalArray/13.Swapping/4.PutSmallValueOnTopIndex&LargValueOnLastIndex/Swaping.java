import java.util.*;
class Swaping{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		System.out.println("Traverse Before Sorting");
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		System.out.println("Array After Swaping");
		int temp;
		for(int i=0; i<data.length; i++){
			if(data[i]<data[0]){
				temp=data[i];
				data[i]=data[0];
				data[0]=temp;
			}
		}
		for(int i=0; i<data.length-1; i++){
			if(data[i]>data[i+1]){
				temp=data[i];
				data[i]=data[i+1];
				data[i+1]=temp;
			}
		}
		for(int i=0; i<data.length; i++){
			System.out.println("["+i+"]="+data[i]);
		}
	}
}