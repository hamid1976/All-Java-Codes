import java.util.*;
class ArraySize{
	public static void main(String arg[]){
		int sum=0;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter" + size + "items");
		
		for(int i=0; i<data.length; i++){
			System.out.print("data["+  i + "]=");
			data[i]=ob.nextInt();
			sum+=data[i];
		}
		
        System.out.println("Traversing");
		
		for(int i=0; i<data.length; i++){
			System.out.println("data[" + i +"]="+data[i]);
			 
		}
		System.out.println("Total Sum:"+sum);
		
	}
}