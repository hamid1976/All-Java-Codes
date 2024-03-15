import java.util.*;
class Deletion{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Item:");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}//for input
		System.out.println("Traversing");
		for(int i=0; i<data.length; i++){
			System.out.println("data["+i+"]="+data[i]);
		}
		System.out.println("Which Item You want to remove\nEnter Location:");
		int loc=ob.nextInt();
		int c=0;
		System.out.println("Traversing");
	    System.out.println("Item Successfully Deleted");
		for(int i=0; i<data.length; i++){
			if(i==data.length-1){
				if(i==loc){
					data[i]=0;
					System.out.println("data["+(i)+"]="+data[i]);
					break;
				}else
					System.out.println("data["+(i-1)+"]="+data[i]);
					data[i]=0;
					System.out.println("data["+(i)+"]="+data[i]);
					break;
			}
			if(i==loc){
					c--;
			}else
					System.out.println("data["+c+"]="+data[i]);
					c++;
		}//end for loop
	}
}