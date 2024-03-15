import java.util.*;
class MinValueInArrayAtTopUsingIf{
	public static void main (String [] args){
		Scanner input=new Scanner (System.in);
		int data[]=new int[]{20,15,5,1,14};
		int temp;
		
		if(data[0]>data[1]){
			temp=data[0];
			data[0]=data[1];
			data[1]=temp;
		}
		
		if(data[1]>data[2]){
			temp=data[1];
			data[1]=data[2];
			data[2]=temp;
		}
		
		if(data[2]>data[3]){
			temp=data[2];
			data[2]=data[3];
			data[3]=temp;
		}
		
		for(int i:data){
			System.out.println(data[i]);
		}
	}
}