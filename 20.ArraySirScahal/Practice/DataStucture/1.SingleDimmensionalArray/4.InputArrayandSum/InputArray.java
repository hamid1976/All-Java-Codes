import java.util.*;
class InputArray{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		System.out.println("Enter "+size+" Items");
		int data[]=new int[size];
		
		//Traversing
		for(int i=0; i<data.length; i++){
			System.out.print("data["+i+"]=");
			data[i]=ob.nextInt();
			
		}
			int sum=0;
			System.out.println("\nTraversing");
		for(int i=0;i<data.length; i++){
			System.out.println("data"+"["+i+"]="+data[i]);
			sum+=data[i];
		}
			System.out.println("\nTotal sum="+sum);
	}
}