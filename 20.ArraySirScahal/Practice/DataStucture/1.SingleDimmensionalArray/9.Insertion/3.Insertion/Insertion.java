import java.util.*;
class Insertion{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Items:");
		int size=ob.nextInt();
		int data[]=new int [size];
		System.out.println("Enter "+size+" Items");
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		for(int i=0; i<data.length; i++){
			System.out.println("data["+i+"]="+data[i]);
		}
		System.out.println("Enter Item which you want to insert");
		int item=ob.nextInt();
		System.out.println("Enter location");
		int loc=ob.nextInt();
		int c=0;
		for(int i=0; i<data.length; i++){
			if(i==loc&&i==data.length-1){
				System.out.println("data["+i+"]="+item);
				break;
			}
			if(i==loc){
				System.out.println("data["+loc+"]="+item);
				System.out.println("data["+(i+1)+"]="+data[i]);
				c++;
				c++;
			}
			if(i!=loc){
				if(i==data.length-1){
					
				}else
					System.out.println("data["+c+"]="+data[i]);
				c++;
			}
		}
	}
}