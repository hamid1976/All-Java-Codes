import java.util.*;
class Insertion{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Items:");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		System.out.println("Traversing");
		for(int i=0; i<data.length; i++){
				System.out.println("data["+i+"]="+data[i]);
		}
		int c=0;
		System.out.println("Which Item you want to insert/nEnter Item:");
		int item=ob.nextInt();
		System.out.println("Enter Location:");
		int loc=ob.nextInt();
		System.out.println("Item Successfully Inserted");
		System.out.println("Traversing");
		for(int i=0; i<data.length; i++){
			if(i==loc&&i==data.length-1){
			    System.out.println("data["+loc+"]="+item);
				break;
			}
			if(i==loc){
				System.out.println("data["+loc+"]="+item);
			    c++;
			}
			if(i==data.length-1){
				   
			}else
				System.out.println("data["+c+"]="+data[i]);
				c++;				
		}//end for loop
	}
	}
	