import java.util.*;
class MaxMin{
	public static void main(String arg[]){
		
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Array Size");
		int size=ob.nextInt();
		int data[]=new int[size];
		System.out.println("Enter" + size + "items");
		
		for(int i=0; i<data.length; i++){
			data[i]=ob.nextInt();
		}
		int max=data[0];
		int loc=0;
		//int min=data[0];
		//int loc1=0;
		for(int k=0; k<data.length; k++){
			if(data[k]>max){
			max=data[k];
            loc=k;
			}
		}
        System.out.println(max +"is greater and its location is:"+ (loc+1));		
		
	}
}