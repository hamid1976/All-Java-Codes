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
		int max=data[0];
		int min=data[0];
		int loc=0;//for max
		int location=0;//for min
		
		for(int i=0; i<data.length; i++){
			if(data[i]>max){
				max=data[i];
				loc=i;
			}
			if(data[i]<min){
				min=data[i];
				location=i;
			}
		}
		System.out.println(max+ " is the greater and its location is " +(loc+1));
		System.out.println(min+ " is the smallest and its location is " +(location+1));
	}
}