import java.util.*;
class InsertionPrac{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter "+size+" Items ");
		
		int i;
		for(i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
	    System.out.println("Traversing\n");
		for(i=0; i<data.length; i++){
			System.out.println("data["+i+"]="+data[i]);
		}
		System.out.println("Which Item you want to insert\nEnter Item:");
		int item=ob.nextInt();
		System.out.println("Enter Location:");
		int loc=ob.nextInt();
		
		for(int j=0; j<data.length; j++){
			  if(j==loc){
				 
				  item=item;
				  loc=j;
			  System.out.println("["+j+"]="+item);
			// break;
			  }else
			   System.out.println("["+j+"]="+data[j]);
		}
				 // System.out.print(item+" ");
       //for(i=0; i<data.length;i++){
		//}
	}
}