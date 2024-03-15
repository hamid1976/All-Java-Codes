import java.util.*;
class LinearSearching{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		System.out.println("Enter "+size+" Items");
		int data[]=new int[size];
		
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		int max=data[0];
		int loc=0;
		for(int i=0; i<data.length; i++){
			if(data[i]>max){
				max=data[i];
				loc=i;
			}
		}
			System.out.println(max+ " is the greater And its location is "+(loc+1));
	}
}