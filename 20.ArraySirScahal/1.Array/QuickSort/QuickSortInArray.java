import java.util.*;
class QuickSortInArray{
	public static void main(String arg[]){
		int data[]={10,9,8,7,6,5,4,3,2,1,};
		System.out.println("Traversing Before Sorting");
		for(int i=0; i<=data.length-1; i++){
			System.out.println("["+i+"]="+data[i]);
		}
		int outc=0,inc=0;
		for(int j=0; j<data.length/2; j++){
			outc++;
			for(int i=j; i<data.length-j-1;i++){
				inc++;
				if(data[i]>data[i+1]){
					int temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}
				if(data[data.length-i-1]<data[data.length-i-2]){
			
		         int tem=data[data.length-i-1];
		         data[data.length-i-1]=data[data.length-i-2];
		         data[data.length-i-1]=data[data.length-i-2];
		         data[data.length-i-2]=tem;
				}
		}
	}


       System.out.println("Outer loop="+outc+"\ninner loop="+inc+"\nTraversing");
       for(int i=0; i<=data.length-1;i++){
	       System.out.println("["+i+"]="+data[i]);
       }
   }
}