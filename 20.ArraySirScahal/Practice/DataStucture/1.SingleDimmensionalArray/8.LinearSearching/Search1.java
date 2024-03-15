import java.util.*;
class Search1{
	public static void main(String arg[]){
	Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size:");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter "+size+" Items:");
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		System.out.println("Enter Item:");
		int item=ob.nextInt();
		boolean b=true;
		int loc=0;
		for(int i=0; i<data.length; i++){
			if(item==data[i]){
				item=data[i];
				loc=i;
				b=false;
				break;
			}
		}
		if(b==false){
			System.out.println(item+" Found on "+loc+" Location");
		}else{
			System.out.println(item+" Not Found ");
		}
	}
}